package com.vmware.vim25;

import java.util.Calendar;

/**
 * This data object type represents result of TPM attestation.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostTpmAttestationInfo extends DynamicData {

    private LocalizableMessage message;
    private HostTpmAttestationInfoAcceptanceStatus status;
    private Calendar time;

    @Override
    public String toString() {
        return "HostTpmAttestationInfo{" +
                "message=" + message +
                ", status=" + status +
                ", time=" + time +
                "} " + super.toString();
    }

    public LocalizableMessage getMessage() {
        return message;
    }

    public void setMessage(final LocalizableMessage message) {
        this.message = message;
    }

    public HostTpmAttestationInfoAcceptanceStatus getStatus() {
        return status;
    }

    public void setStatus(final HostTpmAttestationInfoAcceptanceStatus status) {
        this.status = status;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(final Calendar time) {
        this.time = time;
    }

}
