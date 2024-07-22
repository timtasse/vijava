package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import static org.doublecloud.ws.util.TypeUtil.asNullSafeList;

/**
 * This managed object manages the assignable hardware state of the host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class HostAssignableHardwareManager extends ManagedObject {

    public HostAssignableHardwareManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<HostAssignableHardwareBinding> getBinding() {
        return asNullSafeList(this.getCurrentProperty("binding", HostAssignableHardwareBinding[].class));
    }

    public HostAssignableHardwareConfig getConfig() {
        return this.getCurrentProperty("config", HostAssignableHardwareConfig.class);
    }

    public byte[] downloadDescriptionTree() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invoke("DownloadDescriptionTree", this.getSingleSelfArgumentList(), byte[].class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VirtualMachineDynamicPassthroughInfo> retrieveDynamicPassthroughInfo() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveDynamicPassthroughInfo",
                            this.getSingleSelfArgumentList(), VirtualMachineDynamicPassthroughInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateAssignableHardwareConfig(final HostAssignableHardwareConfig config) throws HostConfigFault, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("config", HostAssignableHardwareConfig.class, config));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateAssignableHardwareConfig", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof HostConfigFault) {
                throw (HostConfigFault) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<VirtualMachineVendorDeviceGroupInfo> retrieveVendorDeviceGroupInfo() throws RuntimeFault {
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveVendorDeviceGroupInfo",
                    this.getSingleSelfArgumentList(), VirtualMachineVendorDeviceGroupInfo.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
