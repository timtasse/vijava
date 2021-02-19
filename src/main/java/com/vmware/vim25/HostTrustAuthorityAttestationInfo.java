package com.vmware.vim25;

import java.util.Arrays;
import java.util.Calendar;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.1
 */
public class HostTrustAuthorityAttestationInfo extends DynamicData {

    private String attestationStatus;
    private String serviceId;
    private Calendar attestedAt;
    private Calendar attestedUntil;
    private LocalizableMessage[] messages;

    @Override
    public String toString() {
        return "HostTrustAuthorityAttestationInfo{" +
                "attestationStatus='" + attestationStatus + '\'' +
                ", attestedAt=" + attestedAt +
                ", attestedUntil=" + attestedUntil +
                ", messages=" + Arrays.toString(messages) +
                ", serviceId='" + serviceId + '\'' +
                "} " + super.toString();
    }

    public String getAttestationStatus() {
        return attestationStatus;
    }

    public void setAttestationStatus(final String attestationStatus) {
        this.attestationStatus = attestationStatus;
    }

    public Calendar getAttestedAt() {
        return attestedAt;
    }

    public void setAttestedAt(final Calendar attestedAt) {
        this.attestedAt = attestedAt;
    }

    public Calendar getAttestedUntil() {
        return attestedUntil;
    }

    public void setAttestedUntil(final Calendar attestedUntil) {
        this.attestedUntil = attestedUntil;
    }

    public LocalizableMessage[] getMessages() {
        return messages;
    }

    public void setMessages(final LocalizableMessage[] messages) {
        this.messages = messages;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(final String serviceId) {
        this.serviceId = serviceId;
    }

}
