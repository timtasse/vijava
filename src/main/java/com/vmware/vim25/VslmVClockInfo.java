package com.vmware.vim25;

/**
 * Virtual clock info of VStorageObject catalog.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2
 */
public class VslmVClockInfo extends DynamicData {

    private long vClockTime;

    @Override
    public String toString() {
        return "VslmVClockInfo{" +
                "vClockTime=" + vClockTime +
                '}';
    }

    public long getvClockTime() {
        return vClockTime;
    }

    public void setvClockTime(final long vClockTime) {
        this.vClockTime = vClockTime;
    }

}
