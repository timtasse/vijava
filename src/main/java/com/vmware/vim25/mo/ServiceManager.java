package com.vmware.vim25.mo;

import com.vmware.vim25.InvalidArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.ServiceManagerServiceInfo;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * The ServiceManager managed object is a singleton object that is used to present services that are optional and not necessarily formally defined.
 * This directory makes available a list of such services and provides an easy way to locate them.
 * The service being represented can take arbitrary form here and is thus represented by a generic ManagedObject.
 * The expectation is that the client side is knowledgeable of the instance type of the specific service it is interested in using.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 5.1
 */
@SuppressWarnings("unchecked")
public class ServiceManager extends ManagedObject {

    public ServiceManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<ServiceManagerServiceInfo> getService() {
        return Optional.ofNullable((ServiceManagerServiceInfo[]) this.getCurrentProperty("service"))
                .map(List::of)
                .orElse(Collections.emptyList());
    }

    public List<ServiceManagerServiceInfo> queryServiceList(final String serviceName, final List<String> location) throws InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("serviceName", "String", serviceName),
                new Argument("location", "String[]", location.toArray()));
        return (List<ServiceManagerServiceInfo>) this.getVimService().getWsc().invoke("QueryServiceList", params, "List.ServiceManagerServiceInfo");
    }

}
