package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * This managed object manages the assignable hardware state of the host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
@SuppressWarnings("unchecked")
public class HostAssignableHardwareManager extends ManagedObject {

    public HostAssignableHardwareManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<HostAssignableHardwareBinding> getBinding() {
        return Arrays.asList((HostAssignableHardwareBinding[]) this.getCurrentProperty("binding"));
    }

    public HostAssignableHardwareConfig getConfig() {
        return (HostAssignableHardwareConfig) this.getCurrentProperty("config");
    }

    public byte[] downloadDescriptionTree() throws RuntimeFault, RemoteException {
        return this.getVimService().getWsc().invoke("DownloadDescriptionTree", this.getSingleSelfArgumentList(), byte[].class);
    }

    public List<VirtualMachineDynamicPassthroughInfo> retrieveDynamicPassthroughInfo() throws RuntimeFault, RemoteException {
        return (List<VirtualMachineDynamicPassthroughInfo>) this.getVimService().getWsc()
                .invoke("RetrieveDynamicPassthroughInfo", this.getSingleSelfArgumentList(), "List.VirtualMachineDynamicPassthroughInfo");
    }

    public void updateAssignableHardwareConfig(final HostAssignableHardwareConfig config) throws HostConfigFault, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostAssignableHardwareConfig.class, config));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateAssignableHardwareConfig", params);
    }

}
