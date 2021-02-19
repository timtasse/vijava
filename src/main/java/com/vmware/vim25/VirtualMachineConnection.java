package com.vmware.vim25;

/**
 * The Connection object describes a connection to the virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.1
 */
public class VirtualMachineConnection extends DynamicData {

    private String label;
    private String client;
    private String userName;

    @Override
    public String toString() {
        return "VirtualMachineConnection{" +
                "label='" + label + '\'' +
                ", client='" + client + '\'' +
                ", userName='" + userName + '\'' +
                "} " + super.toString();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getClient() {
        return client;
    }

    public void setClient(final String client) {
        this.client = client;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

}
