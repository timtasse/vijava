package com.vmware.vim25;

import java.util.Arrays;

/**
 * Specification to assign a SPBM policy to FCD infrastructure object (namespace). This is used in object-based storage.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class vslmInfrastructureObjectPolicySpec extends DynamicData {

    private ManagedObjectReference datastore;
    private VirtualMachineProfileSpec[] profile;

    @Override
    public String toString() {
        return "vslmInfrastructureObjectPolicySpec{" +
                "datastore=" + datastore +
                ", profile=" + Arrays.toString(profile) +
                "} " + super.toString();
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }

    public void setProfile(final VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

}
