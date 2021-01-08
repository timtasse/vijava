package com.vmware.vim25;

import java.util.Arrays;

/**
 * Characteristics of an interleave set of a NVDIMM
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmInterleaveSetInfo extends DynamicData {

    private long availableSize;
    private long baseAddress;
    private int[] deviceList;
    private String rangeType;
    private int setId;
    private long size;
    private String state;

    @Override
    public String toString() {
        return "NvdimmInterleaveSetInfo{" +
                "availableSize=" + availableSize +
                ", baseAddress=" + baseAddress +
                ", deviceList=" + Arrays.toString(deviceList) +
                ", rangeType='" + rangeType + '\'' +
                ", setId=" + setId +
                ", size=" + size +
                ", state='" + state + '\'' +
                "} " + super.toString();
    }

    public long getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(final long availableSize) {
        this.availableSize = availableSize;
    }

    public long getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(final long baseAddress) {
        this.baseAddress = baseAddress;
    }

    public int[] getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(final int[] deviceList) {
        this.deviceList = deviceList;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(final String rangeType) {
        this.rangeType = rangeType;
    }

    public int getSetId() {
        return setId;
    }

    public void setSetId(final int setId) {
        this.setId = setId;
    }

    public long getSize() {
        return size;
    }

    public void setSize(final long size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

}
