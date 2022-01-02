package com.vmware.vim25;

import com.vmware.vim25.mo.*;
import org.doublecloud.ws.util.ReflectUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.time.Instant;
import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class HostBIOSInfoTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(HostBIOSInfoTest.class);
    public String VM_USERNAME;
    public String VM_PASSWORD;
    public String HOSTNAME;
    public String USERNAME;
    public String PASSWORD;
    public String ESX_NAME;
    ServiceInstance instance;

    @Parameters({"VC_HOSTNAME", "VC_USERNAME", "VC_PASSWORD", "ESX_HOSTNAME", "VM_USERNAME", "VM_PASSWORD"})
    @BeforeClass
    public void initParameters(final String vcHostname, final String vcUsername, final String vcPassword,
                               final String esxHostname, final String vmUsername, final String vmPassword) {
        this.HOSTNAME = vcHostname;
        this.USERNAME = vcUsername;
        this.PASSWORD = vcPassword;
        this.ESX_NAME = esxHostname;
        this.VM_USERNAME = vmUsername;
        this.VM_PASSWORD = vmPassword;
    }

    @BeforeMethod
    public void setUp() throws Exception {
        final URL url = new URL("https://" + HOSTNAME + "/sdk");
        instance = new ServiceInstance(url, USERNAME, PASSWORD, true, 1000, 1000);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (this.instance != null) {
            this.instance.getServerConnection().logout();
        }
    }

    @Test
    public void testTicket() throws Exception {
        final SessionManagerHttpServiceRequestSpec spec = new SessionManagerHttpServiceRequestSpec();
        spec.setUrl("https://127.0.0.1:8080/cgi-bin/vm-support.cgi?n=val");
        final SessionManagerGenericServiceTicket ticket = this.instance.getSessionManager().acquireGenericServiceTicket(spec);
        LOGGER.debug("{}", ticket);
        assertNotNull(ticket);
    }

    @Test
    public void testCapability() throws Exception {
        final Capability capability = this.instance.getCapability();
        LOGGER.debug(capability.toString());
        assertNotNull(capability);
    }

    @Test
    public void testDvs() throws Exception {
        final List<VmwareDistributedVirtualSwitch> switches = Optional.ofNullable(new InventoryNavigator(this.instance.getRootFolder()).searchManagedEntities(VmwareDistributedVirtualSwitch.class.getSimpleName()))
                .stream().flatMap(Arrays::stream)
                .map(VmwareDistributedVirtualSwitch.class::cast)
                .filter(sw -> !"Switch_bak-esx".equals(sw.getName()))
                .collect(Collectors.toList());
        assertFalse(switches.isEmpty());
        LOGGER.debug(switches.get(0).getName());
        LOGGER.debug("{}", switches.get(0).queryUsedVlanIds());
        final VMwareDVSConfigInfo config = (VMwareDVSConfigInfo) switches.get(0).getConfig();
        assertNotNull(config);
        final VMwareDvsLacpGroupConfig lacpGroupConfig = Arrays.asList(config.lacpGroupConfig).get(0);
        assertNotNull(lacpGroupConfig);
        assertEquals(lacpGroupConfig.getUplinkNum().intValue(), 2);
        assertEquals(lacpGroupConfig.getTimeoutMode(), VMwareUplinkLacpTimeoutMode.fast);
        LOGGER.debug("lacpGroupConfig: {}", lacpGroupConfig);
    }

    @Test
    public void testSummary() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        assertNotNull(vm);
        assertNotNull(vm.getSummary());
        assertNotNull(vm.getSummary().getConfig());
        LOGGER.debug("{}", vm.getSummary().getConfig());
        final ClusterComputeResource cluster = (ClusterComputeResource) new InventoryNavigator(this.instance.getRootFolder())
                .searchManagedEntity(ClusterComputeResource.class.getSimpleName(), "pi-esx-1");
        assertNotNull(cluster);
        final ComputeResourceSummary summary = cluster.getSummary();
        assertNotNull(summary);
        LOGGER.debug("{}", summary);
    }

    @Test
    public void testEvcManager() throws Exception {
        final ClusterComputeResource cluster = (ClusterComputeResource) new InventoryNavigator(this.instance.getRootFolder())
                .searchManagedEntity(ClusterComputeResource.class.getSimpleName(), "pi-esx-1");
        final ClusterEVCManager evcManager = cluster.getEvcManager();
        LOGGER.debug("EvcManager is from Cluster: {}", evcManager.getManagedCluster().getName());
        LOGGER.debug("EVCModeKey: {}", evcManager.getEvcState().currentEVCModeKey);
        Arrays.stream(evcManager.getEvcState().getSupportedEVCMode())
                .map(val -> val.getKey() + "-" + val.getVendor() + ":" + val.getVendorTier() + "  " + val.getLabel())
                .forEach(LOGGER::debug);
        assertNotNull(evcManager);
        assertNotNull(evcManager.getManagedCluster());
    }

    @Test(enabled = false)
    public void testSnapshot() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        final Task task = vm.createSnapshot("test123", "test", false, false);
        task.waitForTask();
        if (task.getTaskInfo().getState() == TaskInfoState.success) {
            VirtualMachineSnapshot snap =
                    new VirtualMachineSnapshot(this.instance.getServerConnection(),
                            (ManagedObjectReference) task.getTaskInfo().getResult());
            LOGGER.debug("VM: {} -> {}", snap.getVm().getMOR(), snap.getVm().getName());
            final Task removeSnap = snap.removeSnapshot_Task(true);
            removeSnap.waitForTask();
        }
    }

    @Test
    public void testGuestIntegrity() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        LOGGER.debug("{}", vm);
        final VirtualMachineTicket ticket = vm.acquireTicket(VirtualMachineTicketType.mks);
        LOGGER.debug("{}", ticket);
        assertNotNull(ticket);
        LOGGER.debug("vmrc://{}:{}/?mksticket={}&thumbprint={}&path={}", ticket.getHost(), ticket.getPort(), ticket.getTicket(), ticket.getSslThumbprint().replace(":", "%3A"), ticket.getCfgFile());
        final VirtualMachineTicket webTicket = vm.acquireTicket(VirtualMachineTicketType.webmks);
        LOGGER.debug("{}", webTicket);
        assertNotNull(webTicket);
        //Thread.sleep(40000);
        final VirtualMachineConfigInfo config = vm.getConfig();
        assertNotNull(config);
        final VirtualMachineGuestIntegrityInfo integrityInfo = config.getGuestIntegrityInfo();
        assertNotNull(integrityInfo);
        LOGGER.debug("IntegrityInfo enabled={}", integrityInfo.isEnabled());
        LOGGER.debug("vmxConfigChecksum={}", config.getVmxConfigChecksum());
        LOGGER.debug("forkConfigInfo={}", config.getForkConfigInfo());
        LOGGER.debug("messageBusTunnelEnabled={}", config.getMessageBusTunnelEnabled());
        LOGGER.debug("migrateEncryption={}", config.getMigrateEncryption());
        //LOGGER.debug("vmxConfigChecksum={}", Base64.getDecoder().decode(config.getVmxConfigChecksum()));
    }

    @Test(enabled = false)
    public void testGuestInteraction() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        final NamePasswordAuthentication auth = new NamePasswordAuthentication();
        auth.setUsername(this.VM_USERNAME);
        auth.setPassword(this.VM_PASSWORD);
        final GuestProgramSpec spec = new GuestProgramSpec();
        spec.setProgramPath("/bin/ls");
        spec.setArguments("-la /root/ > /tmp/bla.txt");
        final GuestProcessManager processManager = this.instance.getGuestOperationsManager().getProcessManager(vm);
        final long pid = processManager.startProgramInGuest(auth, spec);
        Thread.sleep(2000);
        final GuestProcessInfo[] infos = processManager.listProcessesInGuest(auth, new long[]{pid});
        if (infos != null) {
            LOGGER.debug("start: {}, end: {}", infos[0].getStartTime().getTime(), infos[0].getEndTime().getTime());
        }
        final GuestFileManager fileManager = this.instance.getGuestOperationsManager().getFileManager(vm);
        final FileTransferInformation information = fileManager.initiateFileTransferFromGuest(auth, "/tmp/bla.txt");
        LOGGER.debug(information.getUrl());
        final URL url = new URL(information.getUrl());
        final URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        connection.connect();
        new BufferedReader(new InputStreamReader(connection.getInputStream())).lines().forEach(LOGGER::debug);
    }

    private VirtualMachine getVirtualMachine() throws RemoteException {
        return this.getVirtualMachine("8100361");
    }

    private VirtualMachine getVirtualMachine(final String inv) throws RemoteException {
        return (VirtualMachine) new InventoryNavigator(this.instance.getRootFolder())
                .searchManagedEntity(VirtualMachine.class.getSimpleName(), inv);
    }

    @Test
    public void testLogEvent() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        final List<VirtualMachineSnapshot> rootSnapshot = vm.getRootSnapshot();
        LOGGER.debug("{} - {}", rootSnapshot, rootSnapshot.getClass());
        final EventManager eventManager = this.instance.getEventManager();
        for (EventDescriptionEventDetail detail : eventManager.getDescription().getEventInfo()) {
            if (detail.getKey().toLowerCase().contains("freenet")) {
                LOGGER.debug(detail.toString());
            }
        }
        LOGGER.debug(Arrays.toString(eventManager.retrieveArgumentDescription("de.freenet.test")));
        final EventEx event = new EventEx();
        final VmEventArgument argument = new VmEventArgument();
        argument.setVm(vm.getMOR());
        argument.setName(vm.getName());
        event.setVm(argument);
        event.setUserName("testuser");
        event.setCreatedTime(GregorianCalendar.getInstance());
        event.setFullFormattedMessage("Dies ist eine Test Nachricht");
        event.setEventTypeId("de.freenet.test");
        event.setSeverity(EventEventSeverity.warning.name());
        eventManager.logUserEvent(vm, "noch ein test");
        LOGGER.debug(event.toString());
        final Event latestEvent = eventManager.getLatestEvent();
        LOGGER.debug(latestEvent.toString());
        eventManager.postEvent(event, null);
        /*final TaskManager taskManager = this.instance.getTaskManager();
        for (Task task : taskManager.getRecentTasks()) {
            LOGGER.debug("{} -> {}", task.getAssociatedManagedEntity().getName(), task.getTaskInfo().progress);
            if (vm.getName().equals(task.getAssociatedManagedEntity().getName())) {
                task.setTaskState(TaskInfoState.running, null, null);
                Thread.sleep(1000);
                task.updateProgress(10);
                Thread.sleep(1000);
                task.updateProgress(100);
                task.setTaskState(TaskInfoState.success, "OK", null);
            }
        }*/

    }

    @Test(enabled = false)
    public void testRegisterExtension() throws Exception {
        final Extension ext = new Extension();
        final Description description = new Description();
        description.setLabel("de.freenet");
        description.setSummary("Custom Freenet Events");
        ext.setDescription(description);
        ext.setKey("de.freenet");
        ext.setLastHeartbeatTime(GregorianCalendar.getInstance());
        ext.setVersion("1.0.0");
        final ExtensionEventTypeInfo eventTypeInfo = new ExtensionEventTypeInfo();
        eventTypeInfo.setEventID("de.freenet.test");
        eventTypeInfo.setEventTypeSchema("<EventType>" +
                "<eventTypeID>de.freenet.test</eventTypeID>" +
                "<description>Test Event</description>" +
                "</EventType>");
        ext.setEventList(new ExtensionEventTypeInfo[]{eventTypeInfo});
        this.instance.getExtensionManager().updateExtension(ext);
    }

    @Test
    public void testEventCollector() throws Exception {
        final List<Field> fields = ReflectUtil.getAllFields(EventFilterSpec.class);
        LOGGER.debug(fields.toString());
        final EventManager eventManager = this.instance.getEventManager();
        LOGGER.debug("MaxCollector: {}", eventManager.getMaxCollector());
        final EventFilterSpec filterSpec = new EventFilterSpec();
        //filterSpec.setMaxCount(100);
        final EventFilterSpecByTime byTime = new EventFilterSpecByTime();
        final Instant oneMin = Instant.now().minusSeconds(14400);
        final Calendar instance = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.setTimeInMillis(oneMin.getEpochSecond());
        final Calendar now = this.instance.currentTime();
        //now.roll(Calendar.MINUTE, false);
        now.setTimeInMillis(oneMin.getEpochSecond());
        now.setTimeZone(TimeZone.getTimeZone("UTC"));
        byTime.setBeginTime(now);
        //byTime.setEndTime(GregorianCalendar.getInstance());
        filterSpec.setTime(byTime);
        //filterSpec.setDisableFullMessage(false);
        final EventFilterSpecByEntity byEntity = new EventFilterSpecByEntity();
        //byEntity.setEntity(this.getVirtualMachine("8100617").getMOR());
        byEntity.setRecursion(EventFilterSpecRecursionOption.all);
        filterSpec.setEntity(byEntity);
        try {
            final EventHistoryCollector collector = eventManager.createCollectorForEvents(filterSpec);
            this.printEvents(collector);
        } catch (RemoteException e) {
            if (e.getCause() instanceof InvalidRequest) {
                final InvalidRequest cause = (InvalidRequest) e.getCause();
                LOGGER.debug(Arrays.toString(cause.faultMessage));
                LOGGER.debug(cause.faultCause == null ? "no faultCause" : cause.faultCause.localizedMessage);
            } else {
                LOGGER.error("Error in Collector", e);
            }
        }
    }

    void printEvents(final EventHistoryCollector collector) throws RemoteException {
        Event[] events = collector.getLatestPage();
        while ((events == null ? 0 : events.length) > 0) {
            for (Event event : events) {
                if (event instanceof UserLoginSessionEvent || event instanceof UserLogoutSessionEvent) {
                    continue;
                }
                printEvent(event);
            }
            events = collector.readNextEvents(10);
        }
    }

    private void printEvent(final Event event) {
        LOGGER.debug("{}: {} -> username={}, dc={}, compute={}, host={}, vm={}, ds={}, net={}, dvs={} : {} - {}",
                event.createdTime.getTime(), event.getClass().getSimpleName(), event.userName,
                (event.datacenter == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.datacenter.datacenter).getName()),
                (event.computeResource == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.computeResource.computeResource).getName()),
                (event.host == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.host.host).getName()),
                (event.vm == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.vm.vm).getName()),
                (event.ds == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.ds.datastore).getName()),
                (event.net == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.net.network).getName()),
                (event.dvs == null ? "null" : new ManagedEntity(this.instance.getServerConnection(), event.dvs.dvs).getName()),
                event.fullFormattedMessage, event.key);
    }

    @Test
    public void testHostBIOSInfo() throws Exception {
        final HostSystem host = (HostSystem) new InventoryNavigator(this.instance.getRootFolder()).searchManagedEntity(HostSystem.class.getSimpleName(), ESX_NAME);
        final HostAccessManager accessManager = host.getHostAccessManager();
        LOGGER.debug("LockdownMode={}", accessManager.getLockdownMode());
        final HostCapability capability = host.getCapability();
        LOGGER.debug("cpuHwMmuSupported={}", capability.getCpuHwMmuSupported());
        LOGGER.debug("cryptoSupported={}", capability.getCryptoSupported());
        LOGGER.debug("encryptedVMotionSupported={}", capability.getEncryptedVMotionSupported());
        LOGGER.debug("gatewayOnNicSupported={}", capability.getGatewayOnNicSupported());
        LOGGER.debug("hostAccessManagerSupported={}", capability.getHostAccessManagerSupported());
        LOGGER.debug("maxNumDisksSVMotion={}", capability.getMaxNumDisksSVMotion());
        LOGGER.debug("nfs41Supported={}", capability.getNfs41Supported());
        LOGGER.debug("provisioningNicSelectionSupported={}", capability.getProvisioningNicSelectionSupported());
        LOGGER.debug("turnDiskLocatorLedSupported={}", capability.getTurnDiskLocatorLedSupported());
        LOGGER.debug("virtualVolumeDatastoreSupported={}", capability.getVirtualVolumeDatastoreSupported());
        final HostHardwareInfo hardware = host.getHardware();
        final HostBIOSInfo biosInfo = hardware.getBiosInfo();
        LOGGER.debug("Vendor: {}", biosInfo.getVendor());
        LOGGER.debug("BIOS releasedate: {}", biosInfo.getReleaseDate().getTime());
        LOGGER.debug("BIOS Version: {}", biosInfo.getBiosVersion());
        LOGGER.debug("BIOS Release: {}.{}", biosInfo.getMajorRelease(), biosInfo.getMinorRelease());
        LOGGER.debug("BIOS firmwareRelease: {}.{}", biosInfo.getFirmwareMajorRelease(), biosInfo.getFirmwareMinorRelease());
        assertNotNull(biosInfo, "HostBIOSInfo is null");
        assertNotNull(biosInfo.getBiosVersion(), "BIOSVersion is null");
        assertNotNull(biosInfo.getReleaseDate());
        LOGGER.debug("{}", hardware.getCpuPkg());
        assertNotNull(hardware.getCpuPkg());
        try {
            accessManager.changeAccessMode("test", false, HostAccessMode.accessAdmin);
        } catch (final UserNotFound e) {
            LOGGER.debug("User {} not found", e.getPrincipal(), e);
        } catch (final Exception e) {
            LOGGER.debug("Error in changeAccessMode", e);
        }
        LOGGER.debug(accessManager.querySystemUsers().toString());
//        for (int i = 0; i < 20; i++) {
//            accessManager.test();
//            accessManager.testNew();
//        }
//        LOGGER.debug(int.class.getCanonicalName() + " -> " + int.class.getPackage());
//        final LongSummaryStatistics statsOld = Stream.generate(accessManager::test).limit(100).mapToLong(val -> val).summaryStatistics();
//        final LongSummaryStatistics statsNew = Stream.generate(accessManager::testNew).limit(100).mapToLong(val -> val).summaryStatistics();
//        LOGGER.debug(statsOld.toString());
//        LOGGER.debug(statsNew.toString());
//        this.testSpeed(true, accessManager);
//        this.testSpeed(false, accessManager);
    }

    @Test(enabled = false)
    public void testNicChange() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        final VirtualDevice[] devices = vm.getConfig().getHardware().getDevice();
        VirtualEthernetCard nic = null;
        for (VirtualDevice device : devices) {
            if (device instanceof VirtualEthernetCard) {
                final VirtualEthernetCard ethernetCard = VirtualEthernetCard.class.cast(device);
                if (ethernetCard.getKey() == 4000) {
                    nic = ethernetCard;
                }
            }
        }
        LOGGER.debug(nic.resourceAllocation.toString());
        LOGGER.debug(nic.resourceAllocation.share.toString());
        LOGGER.debug(nic.resourceAllocation.share.level.name());
        LOGGER.debug(String.valueOf(nic.resourceAllocation.share.shares));
        final SharesLevel level = nic.resourceAllocation.share.level;
        nic.resourceAllocation.share.level = SharesLevel.low;
        final VirtualDeviceConfigSpec deviceConfigSpec = new VirtualDeviceConfigSpec();
        deviceConfigSpec.setDevice(nic);
        deviceConfigSpec.setOperation(VirtualDeviceConfigSpecOperation.edit);
        final VirtualMachineConfigSpec configSpec = new VirtualMachineConfigSpec();
        configSpec.setDeviceChange(new VirtualDeviceConfigSpec[]{deviceConfigSpec});
        final Task task = vm.reconfigVM(configSpec);
        task.waitForTask();
        nic.resourceAllocation.share.level = level;
        final Task task1 = vm.reconfigVM(configSpec);
        task1.waitForTask();
        final List<VirtualDeviceConfigSpec> specsList = Arrays.stream(devices).peek(dev -> LOGGER.debug("{} : {}", dev.getClass().getSimpleName(), dev.key))
                .filter(dev -> dev.key >= 500 && dev.key != 600 && dev.key != 700)
                .map(dev -> {
                    final VirtualDeviceConfigSpec spec = new VirtualDeviceConfigSpec();
                    spec.setDevice(dev);
                    spec.setOperation(VirtualDeviceConfigSpecOperation.edit);
                    return spec;
                }).collect(Collectors.toList());
        final VirtualDeviceConfigSpec[] specs = specsList.toArray(new VirtualDeviceConfigSpec[specsList.size()]);
        final VirtualMachineConfigSpec configSpec1 = new VirtualMachineConfigSpec();
        configSpec1.setDeviceChange(specs);
        final Task task2 = vm.reconfigVM(configSpec1);
        task2.waitForTask();
    }

}
