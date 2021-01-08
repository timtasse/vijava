package com.vmware.vim25;

/**
 * The VMFS file system.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostPMemVolume extends HostFileSystemVolume {

    private String uuid;
    private String version;

    @Override
    public String toString() {
        return "HostPMemVolume{" +
                "uuid='" + uuid + '\'' +
                ", version='" + version + '\'' +
                "} " + super.toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

}
