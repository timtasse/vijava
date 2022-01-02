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

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(final String metadata) {
        this.metadata = metadata;
    }

    public String getUserdata() {
        return userdata;
    }

    public void setUserdata(final String userdata) {
        this.userdata = userdata;
    }

}
