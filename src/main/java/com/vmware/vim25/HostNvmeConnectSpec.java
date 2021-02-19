package com.vmware.vim25;

/**
 * Specifies the parameters necessary to connect to a regular NVME over Fabrics controller.
 * Here the transportParameters are used to establish a transport level connection to the specified controller.
 * For reference, see:
 *
 * "NVM Express over Fabrics 1.0", Section 3.3, "Connect command and response"
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeConnectSpec extends HostNvmeSpec {

    private String subnqn;
    private Integer controllerId;
    private Integer adminQueueSize;
    private Integer keepAliveTimeout;

    @Override
    public String toString() {
        return "HostNvmeConnectSpec{" +
                "subnqn='" + subnqn + '\'' +
                ", controllerId=" + controllerId +
                ", adminQueueSize=" + adminQueueSize +
                ", keepAliveTimeout=" + keepAliveTimeout +
                "} " + super.toString();
    }

    public String getSubnqn() {
        return subnqn;
    }

    public void setSubnqn(final String subnqn) {
        this.subnqn = subnqn;
    }

    public Integer getControllerId() {
        return controllerId;
    }

    public void setControllerId(final Integer controllerId) {
        this.controllerId = controllerId;
    }

    public Integer getAdminQueueSize() {
        return adminQueueSize;
    }

    public void setAdminQueueSize(final Integer adminQueueSize) {
        this.adminQueueSize = adminQueueSize;
    }

    public Integer getKeepAliveTimeout() {
        return keepAliveTimeout;
    }

    public void setKeepAliveTimeout(final Integer keepAliveTimeout) {
        this.keepAliveTimeout = keepAliveTimeout;
    }

}
