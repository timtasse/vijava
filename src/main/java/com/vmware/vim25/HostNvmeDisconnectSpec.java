package com.vmware.vim25;

/**
 * Specifies the parameters necessary to disconnect an NVME controller from a given NVME over Fabrics adapter.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeDisconnectSpec extends DynamicData {

    private String hbaName;
    private String subnqn;
    private Integer controllerNumber;

    @Override
    public String toString() {
        return "HostNvmeDisconnectSpec{" +
                "hbaName='" + hbaName + '\'' +
                ", subnqn='" + subnqn + '\'' +
                ", controllerNumber=" + controllerNumber +
                "} " + super.toString();
    }

    public String getHbaName() {
        return hbaName;
    }

    public void setHbaName(final String hbaName) {
        this.hbaName = hbaName;
    }

    public String getSubnqn() {
        return subnqn;
    }

    public void setSubnqn(final String subnqn) {
        this.subnqn = subnqn;
    }

    public Integer getControllerNumber() {
        return controllerNumber;
    }

    public void setControllerNumber(final Integer controllerNumber) {
        this.controllerNumber = controllerNumber;
    }

}
