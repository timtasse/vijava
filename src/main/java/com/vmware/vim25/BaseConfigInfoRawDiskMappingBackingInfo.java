package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class BaseConfigInfoRawDiskMappingBackingInfo extends BaseConfigInfoFileBackingInfo {

    public String compatibilityMode;
    public String lunUuid;

    public String getCompatibilityMode() {
        return compatibilityMode;
    }

    public void setCompatibilityMode(final String compatibilityMode) {
        this.compatibilityMode = compatibilityMode;
    }

    public String getLunUuid() {
        return lunUuid;
    }

    public void setLunUuid(final String lunUuid) {
        this.lunUuid = lunUuid;
    }
}
