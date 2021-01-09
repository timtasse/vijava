package com.vmware.vim25;

import com.vmware.vim25.mo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7
 */
public class SpecialTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpecialTest.class);
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

    @Test(enabled = false)
    public void testNvdimm() throws Exception {
        final HostSystem host = (HostSystem) new InventoryNavigator(this.instance.getRootFolder()).searchManagedEntity(HostSystem.class.getSimpleName(), "pi-esx20-2.vmware.freenet-rz.de");
        LOGGER.debug(host.getName());
        final StorageQueryManager storageQueryManager = this.instance.getStorageQueryManager();
        LOGGER.debug(storageQueryManager.queryHostsWithAttachedLun("naa.6005076801808711700000000000093d").stream().map(HostSystem::getName).collect(Collectors.joining(",")));
        for (ScsiLun scsiLun : host.getHostStorageSystem().getStorageDeviceInfo().getScsiLun()) {
            LOGGER.debug(scsiLun.getDisplayName());
            LOGGER.debug(scsiLun.getUuid());
            LOGGER.debug(storageQueryManager.queryHostsWithAttachedLun(scsiLun.getUuid()).stream().map(HostSystem::getName).collect(Collectors.joining(",")));
        }

    }

    @Test
    public void testAlarm() throws Exception {
        final StoragePod pod = (StoragePod) new InventoryNavigator(this.instance.getRootFolder()).searchManagedEntity(StoragePod.class.getSimpleName(), "svc1-iox-pi2-silber-1");
        final ManagedObjectReference mor = ManagedObjectReference.create("StoragePod", "group-p73059");
        final ManagedEntity me = new ManagedEntity(this.instance.getServerConnection(), mor);
        LOGGER.debug(me.getName());
        LOGGER.debug(me.getRealName());
        LOGGER.debug(me.toString());
        final AlarmManager alarmManager = this.instance.getAlarmManager();
        final List<AlarmState> alarmState = alarmManager.getAlarmState(pod);
        for (AlarmState state : alarmState) {
            LOGGER.debug(state.getKey());
            LOGGER.debug(state.getOverallStatus().toString());
            if (state.getKey().equals("alarm-42.group-p73059")) {

            }
        }
    }

    @Test(enabled = false)
    public void testVStorage() throws Exception {
        final ServiceManager serviceManager = this.instance.getServiceManager();
        LOGGER.debug(serviceManager.getService().toString());
        final CryptoManager cryptoManager = this.instance.getCryptoManager();
        LOGGER.debug("{}", cryptoManager.isEnabled());
        final VcenterVStorageObjectManager objectManager = (VcenterVStorageObjectManager) this.instance.getVStorageObjectManager();
        LOGGER.debug("{}", objectManager.getMOR());
        final Datastore ds = (Datastore) new InventoryNavigator(this.instance.getRootFolder()).searchManagedEntity("Datastore", "intern");
        final List<ID> ids = objectManager.listVStorageObject(ds);
        for (ID id : ids) {
            LOGGER.debug("ID {}", id.getId());
        }
        final VStorageObject vStorageObject = objectManager.retrieveVStorageObject(ids.get(0), ds);
        LOGGER.debug("Name: {}, Capacity: {}, ConsumerId: {}, ConsumtionType: {}", vStorageObject.getConfig().getName(), vStorageObject.getConfig().getCapacityInMB(), vStorageObject.getConfig().getConsumerId(), vStorageObject.getConfig().getConsumptionType());
        final BaseConfigInfoFileBackingInfo backing = (BaseConfigInfoFileBackingInfo) vStorageObject.getConfig().getBacking();
        LOGGER.debug(backing.getFilePath());
        LOGGER.debug(ds.getInfo().getUrl());
        //LOGGER.debug(objectManager.reconcileDatastoreInventory(ds).toString());
        final VirtualMachine vm = (VirtualMachine) new InventoryNavigator(this.instance.getRootFolder()).searchManagedEntity("VirtualMachine", "pxe_problem");
        final List<VirtualDisk> disks = Arrays.asList(vm.getConfig().getHardware().getDevice()).stream().filter(dev -> dev instanceof VirtualDisk).map(VirtualDisk.class::cast).collect(Collectors.toList());
        final String fileName = ((VirtualDiskFlatVer2BackingInfo) disks.get(0).getBacking()).getFileName();
        LOGGER.debug(fileName);
        final String cleanedFileName = fileName.split(" ", 2)[1];
        LOGGER.debug(cleanedFileName);
        LOGGER.debug(ds.getInfo().getUrl() + cleanedFileName);
        //objectManager.registerDisk(fileName, fileName);
        final VslmCreateSpec createSpec = new VslmCreateSpec();
        createSpec.setCapacityInMB(100L);
        createSpec.setName("[intern] test.vmdk");
        final VslmCreateSpecDiskFileBackingSpec backingSpec = new VslmCreateSpecDiskFileBackingSpec();
        backingSpec.setDatastore(ds.getMOR());
        createSpec.setBackingSpec(backingSpec);
        LOGGER.debug(createSpec.toString());
        //objectManager.createDisk(createSpec);
    }

}
