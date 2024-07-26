package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.ws.Argument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * This managed object is used to query vCenter Server's storage system entities.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.2
 */
@SuppressWarnings("unchecked")
public class StorageQueryManager extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public StorageQueryManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<HostSystem> queryHostsWithAttachedLun(final String lunUuid) throws RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("lunUuid", String.class, lunUuid));
        final List<ManagedObjectReference> mors = (List<ManagedObjectReference>) this.getVimService().getWsc()
                .invoke("QueryHostsWithAttachedLun", params, "List.ManagedObjectReference");
        return mors.stream()
                .filter(Objects::nonNull)
                .filter(val -> Objects.nonNull(val.getType()))
                .filter(mor -> mor.getType().equals(HostSystem.class.getSimpleName()))
                .map(mor -> new HostSystem(this.getServerConnection(), mor))
                .collect(Collectors.toList());
    }

}
