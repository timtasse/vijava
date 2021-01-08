package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Managed object responsible for reading and configuring Non-Volatile DIMMs.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.1
 * @since 6.7
 */
public class HostNvdimmSystem extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public HostNvdimmSystem(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public NvdimmSystemInfo getNvdimmSystemInfo() {
        return (NvdimmSystemInfo) this.getCurrentProperty("nvdimmSystemInfo");
    }

    @Deprecated
    public Task createNamespace(final NvdimmNamespaceCreateSpec createSpec)
            throws AlreadyExists, HostConfigFault, InvalidArgument, InvalidHostState, NotSupported, RuntimeFault, SystemError, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("createSpec", NvdimmNamespaceCreateSpec.class, createSpec));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("CreateNvdimmNamespace_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task createPMemNamespace(final NvdimmPMemNamespaceCreateSpec createSpec) throws AlreadyExists, HostConfigFault, InvalidArgument, InvalidHostState, NotSupported, RuntimeFault, SystemError, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("createSpec", NvdimmPMemNamespaceCreateSpec.class, createSpec));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("CreateNvdimmPMemNamespace_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteBlockNamespaces() throws HostConfigFault, InvalidArgument, InvalidHostState, NotFound, NotSupported, RuntimeFault, SystemError, RemoteException {
        final ManagedObjectReference mor = this.getVimService().getWsc()
                .invoke("DeleteNvdimmBlockNamespaces_Task", this.getSingleSelfArgumentList(), ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

    public Task deleteNamespace(final NvdimmNamespaceDeleteSpec deleteSpec) throws HostConfigFault, InvalidArgument, InvalidHostState, NotFound, NotSupported, RuntimeFault, SystemError, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("deleteSpec", NvdimmNamespaceDeleteSpec.class, deleteSpec));
        final ManagedObjectReference mor = this.getVimService().getWsc().invoke("DeleteNvdimmNamespace_Task", params, ManagedObjectReference.class);
        return new Task(this.getServerConnection(), mor);
    }

}
