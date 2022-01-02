package com.vmware.vim25;

/**
 * Description of PCI vGPU profile and its attributes.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class VirtualMachineVgpuProfileInfo extends VirtualMachineTargetInfo {

    private String profileName;
    private long deviceVendorId;
    private long fbSizeInGib;
    private VirtualMachineVgpuProfileInfoProfileSharing profileSharing;
    private VirtualMachineVgpuProfileInfoProfileClass profileClass;

    @Override
    public String toString() {
        return "VirtualMachineVgpuProfileInfo{" +
                "profileName='" + profileName + '\'' +
                ", deviceVendorId=" + deviceVendorId +
                ", fbSizeInGib=" + fbSizeInGib +
                ", profileSharing=" + profileSharing +
                ", profileClass=" + profileClass +
                "} " + super.toString();
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(final String profileName) {
        this.profileName = profileName;
    }

    public long getDeviceVendorId() {
        return deviceVendorId;
    }

    public void setDeviceVendorId(final long deviceVendorId) {
        this.deviceVendorId = deviceVendorId;
    }

    public long getFbSizeInGib() {
        return fbSizeInGib;
    }

    public void setFbSizeInGib(final long fbSizeInGib) {
        this.fbSizeInGib = fbSizeInGib;
    }

    public VirtualMachineVgpuProfileInfoProfileSharing getProfileSharing() {
        return profileSharing;
    }

    public void setProfileSharing(final VirtualMachineVgpuProfileInfoProfileSharing profileSharing) {
        this.profileSharing = profileSharing;
    }

    public VirtualMachineVgpuProfileInfoProfileClass getProfileClass() {
        return profileClass;
    }

    public void setProfileClass(final VirtualMachineVgpuProfileInfoProfileClass profileClass) {
        this.profileClass = profileClass;
    }

}
