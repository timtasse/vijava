package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanHostVsanDiskInfo extends DynamicData {

    public int formatVersion;
    public String vsanUuid;

    public int getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(final int formatVersion) {
        this.formatVersion = formatVersion;
    }

    public String getVsanUuid() {
        return vsanUuid;
    }

    public void setVsanUuid(final String vsanUuid) {
        this.vsanUuid = vsanUuid;
    }
}
