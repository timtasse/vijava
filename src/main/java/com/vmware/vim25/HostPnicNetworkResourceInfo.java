package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostPnicNetworkResourceInfo extends DynamicData {

    public Long availableBandwidthForVMTraffic;
    public HostPlacedVirtualNicIdentifier[] placedVirtualNics;
    public String pnicDevice;
    public Long unusedBandwidthForVMTraffic;

    public Long getAvailableBandwidthForVMTraffic() {
        return availableBandwidthForVMTraffic;
    }

    public void setAvailableBandwidthForVMTraffic(final Long availableBandwidthForVMTraffic) {
        this.availableBandwidthForVMTraffic = availableBandwidthForVMTraffic;
    }

    public HostPlacedVirtualNicIdentifier[] getPlacedVirtualNics() {
        return placedVirtualNics;
    }

    public void setPlacedVirtualNics(final HostPlacedVirtualNicIdentifier[] placedVirtualNics) {
        this.placedVirtualNics = placedVirtualNics;
    }

    public String getPnicDevice() {
        return pnicDevice;
    }

    public void setPnicDevice(final String pnicDevice) {
        this.pnicDevice = pnicDevice;
    }

    public Long getUnusedBandwidthForVMTraffic() {
        return unusedBandwidthForVMTraffic;
    }

    public void setUnusedBandwidthForVMTraffic(final Long unusedBandwidthForVMTraffic) {
        this.unusedBandwidthForVMTraffic = unusedBandwidthForVMTraffic;
    }
}
