package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class SourceNodeSpec extends DynamicData {

    public ServiceLocator managementVc;
    public ManagedObjectReference activeVc;

    public ManagedObjectReference getActiveVc() {
        return activeVc;
    }

    public void setActiveVc(final ManagedObjectReference activeVc) {
        this.activeVc = activeVc;
    }

    public ServiceLocator getManagementVc() {
        return managementVc;
    }

    public void setManagementVc(final ServiceLocator managementVc) {
        this.managementVc = managementVc;
    }
}
