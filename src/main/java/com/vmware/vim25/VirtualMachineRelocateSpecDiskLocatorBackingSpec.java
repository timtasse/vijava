package com.vmware.vim25;

/**
 * VirtualMachineRelocateSpecDiskLocatorBackingSpec is a data object type for crytographic information about the backing of a device.
 * The member parent refers the parent in the chain of VirtualDeviceBackingInfo objects.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineRelocateSpecDiskLocatorBackingSpec extends DynamicData {

    private VirtualMachineRelocateSpecDiskLocatorBackingSpec parent;
    private CryptoSpec crypto;

    @Override
    public String toString() {
        return "VirtualMachineRelocateSpecDiskLocatorBackingSpec{" +
                "parent=" + parent +
                ", crypto=" + crypto +
                "} " + super.toString();
    }

    public VirtualMachineRelocateSpecDiskLocatorBackingSpec getParent() {
        return parent;
    }

    public void setParent(final VirtualMachineRelocateSpecDiskLocatorBackingSpec parent) {
        this.parent = parent;
    }

    public CryptoSpec getCrypto() {
        return crypto;
    }

    public void setCrypto(final CryptoSpec crypto) {
        this.crypto = crypto;
    }

}
