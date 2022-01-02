package com.vmware.vim25;

/**
 * Description of PCI vGPU device and its capabilities.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class VirtualMachineVgpuDeviceInfo extends VirtualMachineTargetInfo {

    private String deviceName;
    private long deviceVendorId;
    private long maxFbSizeInGib;
    private boolean timeSlicedCapable;
    private boolean migCapable;
    private boolean computeProfileCapable;
    private boolean quadroProfileCapable;

    @Override
    public String toString() {
        return "VirtualMachineVgpuDeviceInfo{" +
                "deviceName='" + deviceName + '\'' +
                ", deviceVendorId=" + deviceVendorId +
                ", maxFbSizeInGib=" + maxFbSizeInGib +
                ", timeSlicedCapable=" + timeSlicedCapable +
                ", migCapable=" + migCapable +
                ", computeProfileCapable=" + computeProfileCapable +
                ", quadroProfileCapable=" + quadroProfileCapable +
                "} " + super.toString();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(final String deviceName) {
        this.deviceName = deviceName;
    }

    public long getDeviceVendorId() {
        return deviceVendorId;
    }

    public void setDeviceVendorId(final long deviceVendorId) {
        this.deviceVendorId = deviceVendorId;
    }

    public long getMaxFbSizeInGib() {
        return maxFbSizeInGib;
    }

    public void setMaxFbSizeInGib(final long maxFbSizeInGib) {
        this.maxFbSizeInGib = maxFbSizeInGib;
    }

    public boolean isTimeSlicedCapable() {
        return timeSlicedCapable;
    }

    public void setTimeSlicedCapable(final boolean timeSlicedCapable) {
        this.timeSlicedCapable = timeSlicedCapable;
    }

    public boolean isMigCapable() {
        return migCapable;
    }

    public void setMigCapable(final boolean migCapable) {
        this.migCapable = migCapable;
    }

    public boolean isComputeProfileCapable() {
        return computeProfileCapable;
    }

    public void setComputeProfileCapable(final boolean computeProfileCapable) {
        this.computeProfileCapable = computeProfileCapable;
    }

    public boolean isQuadroProfileCapable() {
        return quadroProfileCapable;
    }

    public void setQuadroProfileCapable(final boolean quadroProfileCapable) {
        this.quadroProfileCapable = quadroProfileCapable;
    }

}
