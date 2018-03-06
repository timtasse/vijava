package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class SoftwarePackageCapability extends DynamicData {

    public Boolean liveInstallAllowed;
    public Boolean liveRemoveAllowed;
    public Boolean overlay;
    public Boolean statelessReady;

    public Boolean isLiveInstallAllowed() {
        return liveInstallAllowed;
    }

    public void setLiveInstallAllowed(final Boolean liveInstallAllowed) {
        this.liveInstallAllowed = liveInstallAllowed;
    }

    public Boolean isLiveRemoveAllowed() {
        return liveRemoveAllowed;
    }

    public void setLiveRemoveAllowed(final Boolean liveRemoveAllowed) {
        this.liveRemoveAllowed = liveRemoveAllowed;
    }

    public Boolean isOverlay() {
        return overlay;
    }

    public void setOverlay(final Boolean overlay) {
        this.overlay = overlay;
    }

    public Boolean isStatelessReady() {
        return statelessReady;
    }

    public void setStatelessReady(final Boolean statelessReady) {
        this.statelessReady = statelessReady;
    }
}
