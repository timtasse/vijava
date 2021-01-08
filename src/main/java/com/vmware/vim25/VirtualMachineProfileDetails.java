package com.vmware.vim25;

import java.util.Arrays;

/**
 * The VirtualMachineProfileDetails data object type provides details of the policy associated with a virtual machine and it's virtual disks.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualMachineProfileDetails extends DynamicData {

    private VirtualMachineProfileDetailsDiskProfileDetails[] diskProfileDetails;
    private VirtualMachineProfileSpec[] profile;

    @Override
    public String toString() {
        return "VirtualMachineProfileDetails{" +
                "diskProfileDetails=" + Arrays.toString(diskProfileDetails) +
                ", profile=" + Arrays.toString(profile) +
                "} " + super.toString();
    }

    public VirtualMachineProfileDetailsDiskProfileDetails[] getDiskProfileDetails() {
        return diskProfileDetails;
    }

    public void setDiskProfileDetails(final VirtualMachineProfileDetailsDiskProfileDetails[] diskProfileDetails) {
        this.diskProfileDetails = diskProfileDetails;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }

    public void setProfile(final VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

}
