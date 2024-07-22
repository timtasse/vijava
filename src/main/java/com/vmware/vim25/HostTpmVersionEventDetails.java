package com.vmware.vim25;

/**
 * Details of a Trusted Platform Module (TPM) event recording the measurement of a module version.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class HostTpmVersionEventDetails extends HostTpmEventDetails {

    private String version;

    @Override
    public String toString() {
        return "HostTpmVersionEventDetails{" +
                "version='" + version + '\'' +
                '}';
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

}
