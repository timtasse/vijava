package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HbrManagerVmReplicationCapability extends DynamicData {

    public boolean compressionSupported;
    public LocalizedMethodFault fault;
    public long maxSupportedSourceDiskCapacity;
    public Long minRpo;
    public String supportedQuiesceMode;
    public ManagedObjectReference vm;

    public boolean isCompressionSupported() {
        return compressionSupported;
    }

    public void setCompressionSupported(final boolean compressionSupported) {
        this.compressionSupported = compressionSupported;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public long getMaxSupportedSourceDiskCapacity() {
        return maxSupportedSourceDiskCapacity;
    }

    public void setMaxSupportedSourceDiskCapacity(final long maxSupportedSourceDiskCapacity) {
        this.maxSupportedSourceDiskCapacity = maxSupportedSourceDiskCapacity;
    }

    public long getMinRpo() {
        return minRpo;
    }

    public void setMinRpo(final long minRpo) {
        this.minRpo = minRpo;
    }

    public String getSupportedQuiesceMode() {
        return supportedQuiesceMode;
    }

    public void setSupportedQuiesceMode(final String supportedQuiesceMode) {
        this.supportedQuiesceMode = supportedQuiesceMode;
    }

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }
}
