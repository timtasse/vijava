package com.vmware.vim25;

/**
 * NVDIMM region information. This represents a region which is a part of NVDIMM.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmRegionInfo extends DynamicData {

    private long offset;
    private String rangeType;
    private int regionId;
    private int setId;
    private long size;
    private long startAddr;

    @Override
    public String toString() {
        return "NvdimmRegionInfo{" +
                "offset=" + offset +
                ", rangeType='" + rangeType + '\'' +
                ", regionId=" + regionId +
                ", setId=" + setId +
                ", size=" + size +
                ", startAddr=" + startAddr +
                "} " + super.toString();
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(final long offset) {
        this.offset = offset;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(final String rangeType) {
        this.rangeType = rangeType;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(final int regionId) {
        this.regionId = regionId;
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

    public long getStartAddr() {
        return startAddr;
    }

    public void setStartAddr(final long startAddr) {
        this.startAddr = startAddr;
    }

}
