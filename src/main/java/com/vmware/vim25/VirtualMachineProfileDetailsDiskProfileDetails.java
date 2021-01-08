package com.vmware.vim25;

import java.util.Arrays;

/**
 * Details of the policies associated with Virtual Disks.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualMachineProfileDetailsDiskProfileDetails extends DynamicData {

    private int diskId;
    private VirtualMachineProfileSpec[] profile;

    @Override
    public String toString() {
        return "VirtualMachineProfileDetailsDiskProfileDetails{" +
                "diskId=" + diskId +
                ", profile=" + Arrays.toString(profile) +
                "} " + super.toString();
    }

    public int getDiskId() {
        return diskId;
    }

    public void setDiskId(final int diskId) {
        this.diskId = diskId;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }

    public void setProfile(final VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

}
