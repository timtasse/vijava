package com.vmware.vim25;

/**
 * Specifies the parameters necessary to connect to a Discovery Service and retrieve a Discovery Log Page.
 * Here the transportParameters are used to establish a transport level connection to a Discovery Controller.
 * Further details can be found here:
 *
 * "NVM Express over Fabrics 1.0", Section 5, "Discovery service"
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.3
 * @since 7.0
 */
public class HostNvmeDiscoverSpec extends HostNvmeSpec {

    private Boolean autoConnect;
    private Boolean rootDiscoveryController;

    @Override
    public String toString() {
        return "HostNvmeDiscoverSpec{" +
                "autoConnect=" + autoConnect +
                ", rootDiscoveryController=" + rootDiscoveryController +
                "} " + super.toString();
    }

    public Boolean getAutoConnect() {
        return autoConnect;
    }

    public void setAutoConnect(final Boolean autoConnect) {
        this.autoConnect = autoConnect;
    }

    public Boolean getRootDiscoveryController() {
        return rootDiscoveryController;
    }

    public void setRootDiscoveryController(final Boolean rootDiscoveryController) {
        this.rootDiscoveryController = rootDiscoveryController;
    }

}
