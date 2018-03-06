package com.vmware.vim25.mo;

import com.vmware.vim25.*;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 28.03.18.
 */
public class OverheadMemoryManager extends ManagedObject {

    //private static final Logger LOGGER = LoggerFactory.getLogger(OverheadMemoryManager.class);

    public OverheadMemoryManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public long LookupVmOverheadMemory(final VirtualMachine vm, final HostSystem host) throws InvalidArgument,
            InvalidType, ManagedObjectNotFound, NotFound, RuntimeFault {
        // TODO: implement in VimStub
        // return getVimService().lookupVmOverheadMemory(this.getMOR(), vm.getMOR(), host.getMOR())
        throw new NotImplemented();
    }

}
