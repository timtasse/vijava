package com.vmware.vim25;

/**
 * Arguments for deleting a namespace
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmNamespaceDeleteSpec extends DynamicData {

    private String uuid;

    @Override
    public String toString() {
        return "NvdimmNamespaceDeleteSpec{" +
                "uuid='" + uuid + '\'' +
                "} " + super.toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

}
