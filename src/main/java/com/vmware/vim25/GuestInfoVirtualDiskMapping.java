package com.vmware.vim25;

/**
 * Describes the virtual disk backing a local guest disk.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class GuestInfoVirtualDiskMapping extends DynamicData {

    private String key;

    @Override
    public String toString() {
        return "GuestInfoVirtualDiskMapping{" +
                "key='" + key + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

}
