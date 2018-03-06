package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VasaProviderContainerSpec extends DynamicData {

    public VimVasaProviderInfo[] vasaProviderInfo;
    public String scId;
    public boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(final boolean deleted) {
        this.deleted = deleted;
    }

    public String getScId() {
        return scId;
    }

    public void setScId(final String scId) {
        this.scId = scId;
    }

    public VimVasaProviderInfo[] getVasaProviderInfo() {
        return vasaProviderInfo;
    }

    public void setVasaProviderInfo(final VimVasaProviderInfo[] vasaProviderInfo) {
        this.vasaProviderInfo = vasaProviderInfo;
    }
}
