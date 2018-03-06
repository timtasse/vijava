package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostVsanInternalSystemVsanObjectOperationResult extends DynamicData {

    public LocalizableMessage[] failureReason;
    public String uuid;

    public LocalizableMessage[] getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(final LocalizableMessage[] failureReason) {
        this.failureReason = failureReason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }
}
