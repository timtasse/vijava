package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostLowLevelProvisioningManagerFileReserveResult extends DynamicData {

    public String baseName;
    public String parentDir;
    public String reservedName;

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(final String baseName) {
        this.baseName = baseName;
    }

    public String getParentDir() {
        return parentDir;
    }

    public void setParentDir(final String parentDir) {
        this.parentDir = parentDir;
    }

    public String getReservedName() {
        return reservedName;
    }

    public void setReservedName(final String reservedName) {
        this.reservedName = reservedName;
    }
}
