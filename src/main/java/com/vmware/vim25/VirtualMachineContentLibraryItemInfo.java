package com.vmware.vim25;

/**
 * Describes the content library item information associated with the virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineContentLibraryItemInfo extends DynamicData {

    private String contentLibraryItemUuid;
    private String contentLibraryItemVersion;

    @Override
    public String toString() {
        return "VirtualMachineContentLibraryItemInfo{" +
                "contentLibraryItemUuid='" + contentLibraryItemUuid + '\'' +
                ", contentLibraryItemVersion='" + contentLibraryItemVersion + '\'' +
                "} " + super.toString();
    }

    public String getContentLibraryItemUuid() {
        return contentLibraryItemUuid;
    }

    public void setContentLibraryItemUuid(final String contentLibraryItemUuid) {
        this.contentLibraryItemUuid = contentLibraryItemUuid;
    }

    public String getContentLibraryItemVersion() {
        return contentLibraryItemVersion;
    }

    public void setContentLibraryItemVersion(final String contentLibraryItemVersion) {
        this.contentLibraryItemVersion = contentLibraryItemVersion;
    }

}
