package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object represents Non-Volatile DIMMs host configuration.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.1
 * @since 6.7
 */
public class NvdimmSystemInfo extends DynamicData {

    private NvdimmDimmInfo[] dimmInfo;
    private int[] dimms;
    private int[] interleaveSet;
    private NvdimmInterleaveSetInfo[] iSetInfo;
    private NvdimmGuid[] namespace;
    private NvdimmNamespaceDetails[] nsDetails;
    @Deprecated(since = "6.7.1")
    private NvdimmNamespaceInfo[] nsInfo;
    private NvdimmSummary summary;

    @Override
    public String toString() {
        return "NvdimmSystemInfo{" +
                "dimmInfo=" + Arrays.toString(dimmInfo) +
                ", dimms=" + Arrays.toString(dimms) +
                ", interleaveSet=" + Arrays.toString(interleaveSet) +
                ", iSetInfo=" + Arrays.toString(iSetInfo) +
                ", namespace=" + Arrays.toString(namespace) +
                ", nsDetails=" + Arrays.toString(nsDetails) +
                ", nsInfo=" + Arrays.toString(nsInfo) +
                ", summary=" + summary +
                "} " + super.toString();
    }

    public NvdimmDimmInfo[] getDimmInfo() {
        return dimmInfo;
    }

    public void setDimmInfo(final NvdimmDimmInfo[] dimmInfo) {
        this.dimmInfo = dimmInfo;
    }

    public int[] getDimms() {
        return dimms;
    }

    public void setDimms(final int[] dimms) {
        this.dimms = dimms;
    }

    public int[] getInterleaveSet() {
        return interleaveSet;
    }

    public void setInterleaveSet(final int[] interleaveSet) {
        this.interleaveSet = interleaveSet;
    }

    public NvdimmInterleaveSetInfo[] getiSetInfo() {
        return iSetInfo;
    }

    public void setiSetInfo(final NvdimmInterleaveSetInfo[] iSetInfo) {
        this.iSetInfo = iSetInfo;
    }

    public NvdimmGuid[] getNamespace() {
        return namespace;
    }

    public void setNamespace(final NvdimmGuid[] namespace) {
        this.namespace = namespace;
    }

    public NvdimmNamespaceInfo[] getNsInfo() {
        return nsInfo;
    }

    public void setNsInfo(final NvdimmNamespaceInfo[] nsInfo) {
        this.nsInfo = nsInfo;
    }

    public NvdimmSummary getSummary() {
        return summary;
    }

    public void setSummary(final NvdimmSummary summary) {
        this.summary = summary;
    }

    public NvdimmNamespaceDetails[] getNsDetails() {
        return nsDetails;
    }

    public void setNsDetails(final NvdimmNamespaceDetails[] nsDetails) {
        this.nsDetails = nsDetails;
    }
}
