package com.vmware.vim25;

/**
 * A unique identifier used for namespaces
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmGuid extends DynamicData {

    private String uuid;

    @Override
    public String toString() {
        return "NvdimmGuid{" +
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
