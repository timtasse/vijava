/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.ws.WSClient;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * The ServiceInstance managed object is the singleton root object of the inventory on both vCenter servers and servers running on standalone host agents.
 * The server creates the ServiceInstance automatically, and also automatically creates the various manager entities that provide services in the virtual environment.
 * Some examples of manager entities are LicenseManager, PerformanceManager, and ViewManager. You can access the manager entities through the content property.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */

public class ServiceInstance extends ManagedObject {

    public final static String VIM25_NAMESPACE = " xmlns=\"urn:vim25\">";
    final static ManagedObjectReference SERVICE_INSTANCE_MOR;

    static {
        SERVICE_INSTANCE_MOR = new ManagedObjectReference();
        SERVICE_INSTANCE_MOR.setVal("ServiceInstance");
        SERVICE_INSTANCE_MOR.setType("ServiceInstance");
    }

    private ServiceContent serviceContent = null;

    public ServiceInstance(URL url, String username, String password)
            throws RemoteException, MalformedURLException {
        this(url, username, password, false);
    }

    public ServiceInstance(URL url, String username, String password, boolean ignoreCert)
            throws RemoteException, MalformedURLException {
        this(url, username, password, ignoreCert, VIM25_NAMESPACE);
    }

    public ServiceInstance(URL url, String username, String password, boolean ignoreCert, String namespace)
            throws RemoteException, MalformedURLException {
        if (url == null || username == null) {
            throw new NullPointerException("None of url, username can be null.");
        }

        setMOR(SERVICE_INSTANCE_MOR);

        VimPortType vimService = new VimPortType(url.toString(), ignoreCert);
        vimService.getWsc().setVimNameSpace(namespace);

        serviceContent = vimService.retrieveServiceContent(SERVICE_INSTANCE_MOR);
        vimService.getWsc().setSoapActionOnApiVersion(serviceContent.getAbout().getApiVersion());
        serviceContent = vimService.retrieveServiceContent(SERVICE_INSTANCE_MOR); //with new SOAP_ACTION
        setServerConnection(new ServerConnection(url, vimService, this));

        UserSession userSession = getSessionManager().login(username, password, null);
        getServerConnection().setUserSession(userSession);
    }

    public ServiceInstance(URL url, String sessionStr, boolean ignoreCert)
            throws RemoteException, MalformedURLException {
        this(url, sessionStr, ignoreCert, VIM25_NAMESPACE);
    }

    // sessionStr format: "vmware_soap_session=\"B3240D15-34DF-4BB8-B902-A844FDF42E85\""
    public ServiceInstance(URL url, String sessionStr, boolean ignoreCert, String namespace)
            throws RemoteException, MalformedURLException {
        if (url == null || sessionStr == null) {
            throw new NullPointerException("None of url, session string can be null.");
        }

        setMOR(SERVICE_INSTANCE_MOR);

        VimPortType vimService = new VimPortType(url.toString(), ignoreCert);
        WSClient wsc = vimService.getWsc();
        wsc.setCookie(sessionStr);
        wsc.setVimNameSpace(namespace);

        serviceContent = vimService.retrieveServiceContent(SERVICE_INSTANCE_MOR);
        wsc.setSoapActionOnApiVersion(serviceContent.getAbout().getApiVersion());
        setServerConnection(new ServerConnection(url, vimService, this));
        serviceContent = vimService.retrieveServiceContent(SERVICE_INSTANCE_MOR); //with new SOAP_ACTION
        UserSession userSession = (UserSession) getSessionManager().getCurrentProperty("currentSession");
        getServerConnection().setUserSession(userSession);
    }

    public ServiceInstance(ServerConnection sc) {
        super(sc, SERVICE_INSTANCE_MOR);
    }

    private ManagedObject createMO(ManagedObjectReference mor) {
        return MorUtil.createExactManagedObject(getServerConnection(), mor);
    }

    public Capability getCapability() {
        return (Capability) getCurrentProperty("capability");
    }

    public ServiceContent getServiceContent() {
        if (serviceContent == null) {
            try {
                serviceContent = retrieveServiceContent();
            } catch (Exception e) {
                throw new IllegalStateException("Cannot retrieve ServiceContent", e);
            }
        }
        return serviceContent;
    }

    public Calendar getServerClock() {
        return (Calendar) getCurrentProperty("serverClock");
    }

    public Calendar currentTime() throws RuntimeFault, RemoteException {
        return getVimService().currentTime(getMOR());
    }

    @Deprecated
    public HostVMotionCompatibility[] queryVMotionCompatibility(VirtualMachine vm, HostSystem[] hosts, String[] compatibility) throws RuntimeFault, RemoteException {
        if (vm == null || hosts == null) {
            throw new IllegalArgumentException("Neither vm or hosts can be null.");
        }
        return getVimService().queryVMotionCompatibility(getMOR(), vm.getMOR(), MorUtil.createMORs(hosts), compatibility);
    }

    public ProductComponentInfo[] retrieveProductComponents() throws RuntimeFault, RemoteException {
        return getVimService().retrieveProductComponents(getMOR());
    }

    private ServiceContent retrieveServiceContent() throws RuntimeFault, RemoteException {
        return getVimService().retrieveServiceContent(getMOR());
    }

    @Deprecated
    public Event[] validateMigration(VirtualMachine[] vms, VirtualMachinePowerState state, String[] testType
            , ResourcePool pool, HostSystem host) throws InvalidState, RuntimeFault, RemoteException {
        if (vms == null) {
            throw new IllegalArgumentException("vms must not be null.");
        }

        return getVimService().validateMigration(getMOR(), MorUtil.createMORs(vms), state, testType,
                pool == null ? null : pool.getMOR(), host == null ? null : host.getMOR());
    }

    public AboutInfo getAboutInfo() {
        return getServiceContent().getAbout();
    }

    public HostLocalAccountManager getAccountManager() {
        return (HostLocalAccountManager) createMO(getServiceContent().getAccountManager());
    }

    public AlarmManager getAlarmManager() {
        return (AlarmManager) createMO(getServiceContent().getAlarmManager());
    }

    public AuthorizationManager getAuthorizationManager() {
        return (AuthorizationManager) createMO(getServiceContent().getAuthorizationManager());
    }

    public CertificateManager getCertificateManager() {
        return (CertificateManager) createMO(this.getServiceContent().getCertificateManager());
    }

    public ClusterProfileManager getClusterProfileManager() {
        return (ClusterProfileManager) createMO(getServiceContent().getClusterProfileManager());
    }

    public ProfileComplianceManager getComplianceManager() {
        return (ProfileComplianceManager) createMO(getServiceContent().getComplianceManager());
    }

    public CryptoManager getCryptoManager() {
        return (CryptoManager) createMO(this.getServiceContent().getCryptoManager());
    }

    public CustomFieldsManager getCustomFieldsManager() {
        return (CustomFieldsManager) createMO(getServiceContent().getCustomFieldsManager());
    }

    public CustomizationSpecManager getCustomizationSpecManager() {
        return (CustomizationSpecManager) createMO(getServiceContent().getCustomizationSpecManager());
    }

    public DatastoreNamespaceManager getDatastoreNamespaceManager() {
        return (DatastoreNamespaceManager) createMO(this.getServiceContent().getDatastoreNamespaceManager());
    }

    public DiagnosticManager getDiagnosticManager() {
        return (DiagnosticManager) createMO(getServiceContent().getDiagnosticManager());
    }

    public DistributedVirtualSwitchManager getDistributedVirtualSwitchManager() {
        return (DistributedVirtualSwitchManager) createMO(getServiceContent().getDvSwitchManager());
    }

    public EventManager getEventManager() {
        return (EventManager) createMO(getServiceContent().getEventManager());
    }

    public ExtensionManager getExtensionManager() {
        return (ExtensionManager) createMO(getServiceContent().getExtensionManager());
    }

    public FailoverClusterConfigurator getFailoverClusterConfigurator() {
        return (FailoverClusterConfigurator) createMO(this.getServiceContent().getFailoverClusterConfigurator());
    }

    public FailoverClusterManager getFailoverClusterManager() {
        return (FailoverClusterManager) createMO(this.getServiceContent().getFailoverClusterManager());
    }

    public FileManager getFileManager() {
        return (FileManager) createMO(getServiceContent().getFileManager());
    }

    public GuestOperationsManager getGuestOperationsManager() {
        return (GuestOperationsManager) createMO(getServiceContent().getGuestOperationsManager());
    }

    public HealthUpdateManager getHealthUpdateManager() {
        return (HealthUpdateManager) this.createMO(this.getServiceContent().getHealthUpdateManager());
    }

    public HostProfileManager getHostProfileManager() {
        return (HostProfileManager) createMO(getServiceContent().getHostProfileManager());
    }

    public HostSpecificationManager getHostSpecificationManager() {
        return (HostSpecificationManager) createMO(this.getServiceContent().getHostSpecManager());
    }

    public IoFilterManager getIoFilterManager() {
        return (IoFilterManager) createMO(this.getServiceContent().getIoFilterManager());
    }

    public IpPoolManager getIpPoolManager() {
        return (IpPoolManager) createMO(getServiceContent().getIpPoolManager());
    }

    public LicenseManager getLicenseManager() {
        return (LicenseManager) createMO(getServiceContent().getLicenseManager());
    }

    public LocalizationManager getLocalizationManager() {
        return (LocalizationManager) createMO(getServiceContent().getLocalizationManager());
    }

    public OverheadMemoryManager getOverheadMemoryManager() {
        return (OverheadMemoryManager) createMO(this.getServiceContent().getOverheadMemoryManager());
    }

    public OvfManager getOvfManager() {
        return (OvfManager) createMO(getServiceContent().getOvfManager());
    }

    public PerformanceManager getPerformanceManager() {
        return (PerformanceManager) createMO(getServiceContent().getPerfManager());
    }

    public PropertyCollector getPropertyCollector() {
        return (PropertyCollector) createMO(getServiceContent().getPropertyCollector());
    }

    public Folder getRootFolder() {
        return new Folder(this.getServerConnection(), this.getServiceContent().getRootFolder());
    }

    public ScheduledTaskManager getScheduledTaskManager() {
        return (ScheduledTaskManager) createMO(getServiceContent().getScheduledTaskManager());
    }

    public SearchIndex getSearchIndex() {
        return (SearchIndex) createMO(getServiceContent().getSearchIndex());
    }

    public ServiceManager getServiceManager() {
        return (ServiceManager) createMO(this.getServiceContent().getServiceManager());
    }

    public SessionManager getSessionManager() {
        return (SessionManager) createMO(getServiceContent().getSessionManager());
    }

    public OptionManager getSetting() {
        return (OptionManager) createMO(getServiceContent().getSetting());
    }

    public HostSnmpSystem getSnmpSystem() {
        return (HostSnmpSystem) createMO(getServiceContent().getSnmpSystem());
    }

    public StorageQueryManager getStorageQueryManager() {
        return new StorageQueryManager(this.getServerConnection(), this.getServiceContent().getStorageQueryManager());
    }

    public StorageResourceManager getStorageResourceManager() {
        return (StorageResourceManager) createMO(this.getServiceContent().getStorageResourceManager());
    }

    public TaskManager getTaskManager() {
        return (TaskManager) createMO(getServiceContent().getTaskManager());
    }

    public UserDirectory getUserDirectory() {
        return (UserDirectory) createMO(getServiceContent().getUserDirectory());
    }

    public ViewManager getViewManager() {
        return (ViewManager) createMO(getServiceContent().getViewManager());
    }

    public VirtualDiskManager getVirtualDiskManager() {
        return (VirtualDiskManager) createMO(getServiceContent().getVirtualDiskManager());
    }

    public VirtualMachineCompatibilityChecker getVmCompatibilityChecker() {
        return (VirtualMachineCompatibilityChecker) createMO(getServiceContent().getVmCompatibilityChecker());
    }

    public VirtualMachineProvisioningChecker getVmProvisioningChecker() {
        return (VirtualMachineProvisioningChecker) createMO(getServiceContent().getVmProvisioningChecker());
    }

    public VStorageObjectManagerBase getVStorageObjectManager() {
        return (VStorageObjectManagerBase) createMO(this.getServiceContent().getvStorageObjectManager());
    }

}
