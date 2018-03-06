package com.vmware.vim25.ws;

import com.vmware.vim25.ManagedObjectReference;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 10.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public interface HostActiveDirectoryAuthenticationMethods extends WSClientBasedInterfaces {

    default ManagedObjectReference joinDomain_Task(ManagedObjectReference mor, String domainName, String userName, String password) throws RemoteException {
        final List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor),
                new Argument("domainName", "String", domainName),
                new Argument("userName", "String", userName),
                new Argument("password", "String", password));
        return (ManagedObjectReference) getWsc().invoke("JoinDomain_Task", paras, "ManagedObjectReference");
    }

    default ManagedObjectReference joinDomainWithCAM_Task(ManagedObjectReference mor, String domainName, String camServer) throws RemoteException {
        final List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor),
                new Argument("domainName", "String", domainName),
                new Argument("camServer", "String", camServer));
        return (ManagedObjectReference) getWsc().invoke("JoinDomainWithCAM_Task", paras, "ManagedObjectReference");
    }

    default ManagedObjectReference importCertificateForCAM_Task(ManagedObjectReference mor, String certPath, String camServer) throws RemoteException {
        final List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor),
                new Argument("certPath", "String", certPath),
                new Argument("camServer", "String", camServer));
        return (ManagedObjectReference) getWsc().invoke("ImportCertificateForCAM_Task", paras, "ManagedObjectReference");
    }

    default ManagedObjectReference leaveCurrentDomain_Task(ManagedObjectReference mor, boolean force) throws RemoteException {
        List<Argument> paras = Arrays.asList(
                new Argument("_this", "ManagedObjectReference", mor),
                new Argument("force", "boolean", force));
        return (ManagedObjectReference) getWsc().invoke("LeaveCurrentDomain_Task", paras, "ManagedObjectReference");
    }

}
