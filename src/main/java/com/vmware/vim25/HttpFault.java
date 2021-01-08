package com.vmware.vim25;

/**
 * Generic base class for outbound HTTP communication errors.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HttpFault extends VimFault {

    private int statusCode;
    private String statusMessage;

    @Override
    public String toString() {
        return "HttpFault{" +
                "statusCode=" + statusCode +
                ", statusMessage='" + statusMessage + '\'' +
                "} " + super.toString();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(final int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
