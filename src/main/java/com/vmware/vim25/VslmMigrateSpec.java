package com.vmware.vim25;

import java.util.Arrays;

/**
 * Base specification of moving or copying a virtual storage object.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0
 * @since 6.5
 */
public class VslmMigrateSpec extends DynamicData {

    private VslmCreateSpecBackingSpec backingSpec;
    private VirtualMachineProfileSpec[] profile;
    private Boolean consolidate;
    private DiskCryptoSpec diskCrypto;

    @Override
    public String toString() {
        return "VslmMigrateSpec{" +
                "backingSpec=" + backingSpec +
                ", profile=" + Arrays.toString(profile) +
                ", consolidate=" + consolidate +
                ", diskCrypto=" + diskCrypto +
                "} " + super.toString();
    }

    public VslmCreateSpecBackingSpec getBackingSpec() {
        return backingSpec;
    }

    public void setBackingSpec(final VslmCreateSpecBackingSpec backingSpec) {
        this.backingSpec = backingSpec;
    }

    public Boolean getConsolidate() {
        return consolidate;
    }

    public void setConsolidate(final Boolean consolidate) {
        this.consolidate = consolidate;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return profile;
    }

    public void setProfile(final VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

    public DiskCryptoSpec getDiskCrypto() {
        return diskCrypto;
    }

    public void setDiskCrypto(final DiskCryptoSpec diskCrypto) {
        this.diskCrypto = diskCrypto;
    }

}
