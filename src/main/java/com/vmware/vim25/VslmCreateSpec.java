package com.vmware.vim25;

import java.util.Arrays;

/**
 * Specification to create a virtual storage object.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @since 6.5
 */
public class VslmCreateSpec extends DynamicData {

    private String name;
    private Boolean keepAfterDeleteVm;
    private VslmCreateSpecBackingSpec backingSpec;
    private long capacityInMB;
    private VirtualMachineProfileSpec[] profile;
    private CryptoSpec crypto;
    private KeyValue[] metadata;

    @Override
    public String toString() {
        return "VslmCreateSpec{" +
                "name='" + name + '\'' +
                ", keepAfterDeleteVm=" + keepAfterDeleteVm +
                ", backingSpec=" + backingSpec +
                ", capacityInMB=" + capacityInMB +
                ", profile=" + Arrays.toString(profile) +
                ", crypto=" + crypto +
                ", metadata=" + Arrays.toString(metadata) +
                "} " + super.toString();
    }

    public VslmCreateSpecBackingSpec getBackingSpec() {
        return backingSpec;
    }

    public void setBackingSpec(final VslmCreateSpecBackingSpec backingSpec) {
        this.backingSpec = backingSpec;
    }

    public long getCapacityInMB() {
        return capacityInMB;
    }

    public void setCapacityInMB(final long capacityInMB) {
        this.capacityInMB = capacityInMB;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    public void setKeepAfterDeleteVm(final Boolean keepAfterDeleteVm) {
        this.keepAfterDeleteVm = keepAfterDeleteVm;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }

    public void setProfile(final VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public KeyValue[] getMetadata() {
        return metadata;
    }

    public void setMetadata(final KeyValue[] metadata) {
        this.metadata = metadata;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
    }

}
