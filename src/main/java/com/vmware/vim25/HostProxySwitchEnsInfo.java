package com.vmware.vim25;

/**
 * This data object type describes the Ens status from VmKernel.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class HostProxySwitchEnsInfo extends DynamicData {

    private long opsVersion;
    private long numPSOps;
    private long numLcoreOps;
    private long errorStatus;
    private long lcoreStatus;

    @Override
    public String toString() {
        return "HostProxySwitchEnsInfo{" +
                "opsVersion=" + opsVersion +
                ", numPSOps=" + numPSOps +
                ", numLcoreOps=" + numLcoreOps +
                ", errorStatus=" + errorStatus +
                ", lcoreStatus=" + lcoreStatus +
                '}';
    }

    public long getOpsVersion() {
        return opsVersion;
    }

    public void setOpsVersion(final long opsVersion) {
        this.opsVersion = opsVersion;
    }

    public long getNumPSOps() {
        return numPSOps;
    }

    public void setNumPSOps(final long numPSOps) {
        this.numPSOps = numPSOps;
    }

    public long getNumLcoreOps() {
        return numLcoreOps;
    }

    public void setNumLcoreOps(final long numLcoreOps) {
        this.numLcoreOps = numLcoreOps;
    }

    public long getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(final long errorStatus) {
        this.errorStatus = errorStatus;
    }

    public long getLcoreStatus() {
        return lcoreStatus;
    }

    public void setLcoreStatus(final long lcoreStatus) {
        this.lcoreStatus = lcoreStatus;
    }

}
