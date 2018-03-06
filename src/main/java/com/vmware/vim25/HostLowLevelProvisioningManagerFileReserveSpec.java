package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostLowLevelProvisioningManagerFileReserveSpec extends DynamicData {

    public String baseName;
    public String parentDir;
    public String fileType;
    public String storageProfile;

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(final String baseName) {
        this.baseName = baseName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(final String fileType) {
        this.fileType = fileType;
    }

    public String getParentDir() {
        return parentDir;
    }

    public void setParentDir(final String parentDir) {
        this.parentDir = parentDir;
    }

    public String getStorageProfile() {
        return storageProfile;
    }

    public void setStorageProfile(final String storageProfile) {
        this.storageProfile = storageProfile;
    }
}
