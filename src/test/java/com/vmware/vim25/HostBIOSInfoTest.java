package com.vmware.vim25;

import com.vmware.vim25.mo.*;
import com.vmware.vim25.ws.WSClient;
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
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertNotNull;

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
        instance = new ServiceInstance(url, USERNAME, PASSWORD, true);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (this.instance != null) {
            this.instance.getServerConnection().logout();
        }
    }

    @Test
    public void testEvcManager() throws Exception {
        final ClusterComputeResource cluster = (ClusterComputeResource) new InventoryNavigator(this.instance.getRootFolder())
                .searchManagedEntity(ClusterComputeResource.class.getSimpleName(), "ct-esx-1");
        final ClusterEVCManager evcManager = cluster.getEvcManager();
        LOGGER.debug("EvcManager is from Cluster: {}", evcManager.getManagedCluster().getName());
        LOGGER.debug("EVCModeKey: {}", evcManager.getEvcState().currentEVCModeKey);
        Arrays.stream(evcManager.getEvcState().getSupportedEVCMode())
                .map(val -> val.key + "-" + val.vendor + ":" + val.vendorTier + "  " + val.label)
                .forEach(LOGGER::debug);
        assertNotNull(evcManager);
        assertNotNull(evcManager.getManagedCluster());
    }

    @Test(enabled = false)
    public void testSnapshot() throws Exception {
        final VirtualMachine vm = this.getVirtualMachine();
        final Task task = vm.createSnapshot_Task("test123", "test", false, false);
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
        final VirtualMachineConfigInfo config = vm.getConfig();
        final VirtualMachineGuestIntegrityInfo integrityInfo = config.getGuestIntegrityInfo();
        LOGGER.debug("IntegrityInfo enabled={}", integrityInfo.isEnabled());
        LOGGER.debug("vmxConfigChecksum={}", config.getVmxConfigChecksum());
        LOGGER.debug("forkConfigInfo={}", config.getForkConfigInfo());
        LOGGER.debug("messageBusTunnelEnabled={}", config.isMessageBusTunnelEnabled());
        LOGGER.debug("migrateEncryption={}", config.getMigrateEncryption());
        //LOGGER.debug("vmxConfigChecksum={}", Base64.getDecoder().decode(config.getVmxConfigChecksum()));
    }

    @Test
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
        final EventManager eventManager = this.instance.getEventManager();
        final Event event = new VmEvent();
        final VmEventArgument argument = new VmEventArgument();
        argument.setVm(vm.getMOR());
        argument.setName(vm.getName());
        event.setVm(argument);
        event.setUserName("testuser");
        event.setKey(1);
        event.setCreatedTime(GregorianCalendar.getInstance());
        event.setChainId(1);
        event.setFullFormattedMessage("Dies ist eine Test Nachricht");
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

    @Test
    public void testEventCollector() throws Exception {
        final Field[] fields = ReflectUtil.getAllFields(EventFilterSpec.class);
        LOGGER.debug(Arrays.toString(fields));
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
            events = collector.readNextEvents(100);
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
        LOGGER.debug("cpuHwMmuSupported={}", capability.isCpuHwMmuSupported());
        LOGGER.debug("cryptoSupported={}", capability.isCryptoSupported());
        LOGGER.debug("encryptedVMotionSupported={}", capability.isEncryptedVMotionSupported());
        LOGGER.debug("gatewayOnNicSupported={}", capability.isGatewayOnNicSupported());
        LOGGER.debug("hostAccessManagerSupported={}", capability.isHostAccessManagerSupported());
        LOGGER.debug("maxNumDisksSVMotion={}", capability.getMaxNumDisksSVMotion());
        LOGGER.debug("nfs41Supported={}", capability.isNfs41Supported());
        LOGGER.debug("provisioningNicSelectionSupported={}", capability.isProvisioningNicSelectionSupported());
        LOGGER.debug("turnDiskLocatorLedSupported={}", capability.isTurnDiskLocatorLedSupported());
        LOGGER.debug("virtualVolumeDatastoreSupported={}", capability.isVirtualVolumeDatastoreSupported());
        final HostBIOSInfo biosInfo = host.getHardware().getBiosInfo();
        LOGGER.debug("Vendor: {}", biosInfo.vendor);
        LOGGER.debug("BIOS releasedate: {}", biosInfo.releaseDate.getTime());
        LOGGER.debug("BIOS Version: {}", biosInfo.biosVersion);
        LOGGER.debug("BIOS Release: {}.{}", biosInfo.majorRelease, biosInfo.minorRelease);
        LOGGER.debug("BIOS firmwareRelease: {}.{}", biosInfo.firmwareMajorRelease, biosInfo.firmwareMinorRelease);
        assertNotNull(biosInfo, "HostBIOSInfo is null");
        assertNotNull(biosInfo.getBiosVersion(), "BIOSVersion is null");
        assertNotNull(biosInfo.getReleaseDate());
        //assertNotNull(biosInfo.getVendor());
        //assertNotNull(biosInfo.getMajorRelease());
        //assertNotNull(biosInfo.getMinorRelease());
        //assertNotNull(biosInfo.getFirmwareMajorRelease());
        //assertNotNull(biosInfo.getFirmwareMinorRelease());

        try {
            accessManager.changeAccessMode("test", false, HostAccessMode.accessAdmin);
        } catch (Exception e) {
            LOGGER.debug("Error in changeAccessMode", e);
        }
        LOGGER.debug(accessManager.querySystemUsers().toString());
        //accessManager.retrieveAccessEntries().stream().forEach(val -> LOGGER.debug("{} -> {}", val.getPrincipal(), val.getAccessMode()));

        for (int i = 0; i < 20; i++) {
            accessManager.test();
            accessManager.testNew();
        }

        //if (accessManager.testNew() > 0)
        //  return;
        LOGGER.debug(int.class.getCanonicalName() + " -> " + int.class.getPackage());
        final LongSummaryStatistics statsOld = Stream.generate(accessManager::test).limit(100).mapToLong(val -> val).summaryStatistics();
        final LongSummaryStatistics statsNew = Stream.generate(accessManager::testNew).limit(100).mapToLong(val -> val).summaryStatistics();
        LOGGER.debug(statsOld.toString());
        LOGGER.debug(statsNew.toString());
        WSClient.COUNT_OLD.clear();
        WSClient.COUNT_NEW.clear();
        this.testSpeed(true, accessManager);
        this.testSpeed(false, accessManager);
        this.testSpeed(true, accessManager);
        this.testSpeed(false, accessManager);
        this.testSpeed(true, accessManager);
        this.testSpeed(false, accessManager);
        this.testSpeed(true, accessManager);
        this.testSpeed(false, accessManager);
        LOGGER.debug("Old Method: {}", WSClient.COUNT_OLD.stream().mapToLong(val -> val).summaryStatistics());
        LOGGER.debug("New Method: {}", WSClient.COUNT_NEW.stream().mapToLong(val -> val).summaryStatistics());
    }

    private void testSpeed(final boolean old, final HostAccessManager accessManager) {
        if (old) {
            LOGGER.debug("Old: {}", Stream.generate(accessManager::test).limit(100).mapToLong(val -> val).summaryStatistics());
        } else {
            LOGGER.debug("New: {}", Stream.generate(accessManager::testNew).limit(100).mapToLong(val -> val).summaryStatistics());
        }
    }

    @Test
    public void test() {
        final Base64.Decoder decoder = Base64.getDecoder();
        final byte[] decode = decoder.decode("BCoABAEDhAIgD2AA//uLFwOOyACsDWAJQRoQByAHMAcAAAAQEBDsAIQAUHJvYyAxAEFNRABBTUQgT3B0ZXJvbih0bSkgUHJvY2Vzc29yIDYzNzggICAgICAgICAgICAgICAgICAAAA==");
        //Charset.availableCharsets().forEach((key, charset) -> LOGGER.debug(new String(decode, charset)));
        LOGGER.debug(new String(decode));
        LOGGER.debug(new String(decoder.decode("BCgABAEDhAITDwQA//uLFwCOAAC4CygKQQEQByAH//8AAAACAgIEAFByb2MgMQBBTUQAAA==")));
        //LOGGER.debug(new String(decode, StandardCharsets.UTF_16));
    }

    @Test
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
        final Task task = vm.reconfigVM_Task(configSpec);
        task.waitForTask();
        nic.resourceAllocation.share.level = level;
        final Task task1 = vm.reconfigVM_Task(configSpec);
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
        final Task task2 = vm.reconfigVM_Task(configSpec1);
        task2.waitForTask();
    }

    /*@Test
    public void testReflection() throws Exception {
        final TestClass testClass = TestClass.class.newInstance();
        LOGGER.debug(Arrays.toString(TestClass.class.getDeclaredFields()));
        LOGGER.debug(Arrays.toString(TestClass.class.getFields()));
        final Field bla = TestClass.class.getDeclaredField("bla");
        LOGGER.debug("bla isAccessable: {}", bla.isAccessible());
        LOGGER.debug("bla Modifiers: {}", bla.getModifiers());
        LOGGER.debug("is Final: {}", Modifier.isFinal(bla.getModifiers()));
        bla.setAccessible(true);
        bla.set(testClass, "test");
        final Field muh = TestClass.class.getDeclaredField("muh");
        LOGGER.debug("muh isAccessable: {}", muh.isAccessible());
        muh.setAccessible(true);
        muh.set(testClass, 123);
        LOGGER.debug(testClass.toString());
    }*/
}