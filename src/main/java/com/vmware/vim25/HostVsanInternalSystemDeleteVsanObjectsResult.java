package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 22.05.18.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostVsanInternalSystemDeleteVsanObjectsResult extends DynamicData {

    public LocalizableMessage[] failureReason;
    public boolean success;
    public String uuid;

    public LocalizableMessage[] getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(final LocalizableMessage[] failureReason) {
        this.failureReason = failureReason;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }
}
