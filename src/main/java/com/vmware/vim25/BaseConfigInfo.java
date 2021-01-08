package com.vmware.vim25;

import java.util.Calendar;

/**
 * This data object type contains the basic configuration for a virtual storage object or a virtual storage object snapshot.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public class BaseConfigInfo extends DynamicData {

    private BaseConfigInfoBackingInfo backing;
    private Boolean changedBlockTrackingEnabled;
    private Calendar createTime;
    private ID id;
    private String[] iofilter;
    private Boolean keepAfterDeleteVm;
    private String name;
    private Boolean nativeSnapshotSupported;
    private Boolean relocationDisabled;

    public BaseConfigInfoBackingInfo getBacking() {
        return backing;
    }

    public void setBacking(final BaseConfigInfoBackingInfo backing) {
        this.backing = backing;
    }

    public Boolean getChangedBlockTrackingEnabled() {
        return changedBlockTrackingEnabled;
    }

    public void setChangedBlockTrackingEnabled(final Boolean changedBlockTrackingEnabled) {
        this.changedBlockTrackingEnabled = changedBlockTrackingEnabled;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final Calendar createTime) {
        this.createTime = createTime;
    }

    public ID getId() {
        return id;
    }

    public void setId(final ID id) {
        this.id = id;
    }

    public String[] getIofilter() {
        return iofilter;
    }

    public void setIofilter(final String[] iofilter) {
        this.iofilter = iofilter;
    }

    public Boolean getKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    public void setKeepAfterDeleteVm(final Boolean keepAfterDeleteVm) {
        this.keepAfterDeleteVm = keepAfterDeleteVm;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getNativeSnapshotSupported() {
        return nativeSnapshotSupported;
    }

    public void setNativeSnapshotSupported(final Boolean nativeSnapshotSupported) {
        this.nativeSnapshotSupported = nativeSnapshotSupported;
    }

    public Boolean getRelocationDisabled() {
        return relocationDisabled;
    }

    public void setRelocationDisabled(final Boolean relocationDisabled) {
        this.relocationDisabled = relocationDisabled;
    }

}
