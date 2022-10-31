package com.vmware.vim25;

/**
 * Guest customization settings to customize a Linux guest operating system with raw cloud-init data.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class CustomizationCloudinitPrep extends CustomizationIdentitySettings {

    private String metadata;
    private String userdata;

    @Override
    public String toString() {
        return "CustomizationCloudinitPrep{" +
                "metadata='" + metadata + '\'' +
                ", userdata='" + userdata + '\'' +
                "} " + super.toString();
    }

    /**
     * Metadata includes the network, instance id and hostname that cloud-init processes to configure the VM.
     * It is in json or yaml format. The max size of the metadata is 524288 bytes.
     * See detail information about Instance Metadata.
     * @see https://cloudinit.readthedocs.io/en/latest/topics/instancedata.html
     * @return Metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(final String metadata) {
        this.metadata = metadata;
    }

    /**
     * Userdata is the user custom content that cloud-init processes to configure the VM.
     * The max size of the userdata is 524288 bytes. See detail information about User-Data formats.
     * @see https://cloudinit.readthedocs.io/en/latest/topics/format.html
     * @return Userdata
     */
    public String getUserdata() {
        return userdata;
    }

    public void setUserdata(final String userdata) {
        this.userdata = userdata;
    }

}
