package com.vmware.vim25;

/**
 * Some operations on host profile documents may cause unexpected result. For example, deleting a profile instance of vswitch may break the network connectivity.
 * This data class provides the localizable message which may be presented before or after an operation happens.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class ProfileMetadataProfileOperationMessage extends DynamicData {

    private LocalizableMessage message;
    private String operationName;

    @Override
    public String toString() {
        return "ProfileMetadataProfileOperationMessage{" +
                "message=" + message +
                ", operationName='" + operationName + '\'' +
                "} " + super.toString();
    }

    public LocalizableMessage getMessage() {
        return message;
    }

    public void setMessage(final LocalizableMessage message) {
        this.message = message;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(final String operationName) {
        this.operationName = operationName;
    }

}
