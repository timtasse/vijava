package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.SiteInfo;

import java.rmi.RemoteException;

/**
 * This managed object type is used for managing external site-related capabilities which are advertised by vCenter.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class SiteInfoManager extends ManagedObject {

    public SiteInfoManager(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public SiteInfo getSiteInfo() throws RuntimeFault, RemoteException {
        return this.getVimService().getWsc().invoke("GetSiteInfo", this.getSingleSelfArgumentList(), SiteInfo.class);
    }

}
