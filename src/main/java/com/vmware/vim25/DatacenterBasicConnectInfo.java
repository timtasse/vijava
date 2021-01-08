package com.vmware.vim25;

/**
 * BasicConnectInfo consists of essential information about the host.
 * This is a subset of HostConnectInfo and contains the information which is relevant when it comes to dealing with a set of hosts.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class DatacenterBasicConnectInfo extends DynamicData {

    private LocalizedMethodFault error;
    private String hardwareModel;
    private String hardwareVendor;
    private String hostname;
    private AboutInfo hostProductInfo;
    private Integer numPoweredOnVm;
    private Integer numVm;
    private String serverIp;

    @Override
    public String toString() {
        return "DatacenterBasicConnectInfo{" +
                "error=" + error +
                ", hardwareModel='" + hardwareModel + '\'' +
                ", hardwareVendor='" + hardwareVendor + '\'' +
                ", hostname='" + hostname + '\'' +
                ", hostProductInfo=" + hostProductInfo +
                ", numPoweredOnVm=" + numPoweredOnVm +
                ", numVm=" + numVm +
                ", serverIp='" + serverIp + '\'' +
                "} " + super.toString();
    }

    public LocalizedMethodFault getError() {
        return error;
    }

    public void setError(final LocalizedMethodFault error) {
        this.error = error;
    }

    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(final String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    public String getHardwareVendor() {
        return hardwareVendor;
    }

    public void setHardwareVendor(final String hardwareVendor) {
        this.hardwareVendor = hardwareVendor;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public AboutInfo getHostProductInfo() {
        return hostProductInfo;
    }

    public void setHostProductInfo(final AboutInfo hostProductInfo) {
        this.hostProductInfo = hostProductInfo;
    }

    public Integer getNumPoweredOnVm() {
        return numPoweredOnVm;
    }

    public void setNumPoweredOnVm(final Integer numPoweredOnVm) {
        this.numPoweredOnVm = numPoweredOnVm;
    }

    public Integer getNumVm() {
        return numVm;
    }

    public void setNumVm(final Integer numVm) {
        this.numVm = numVm;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(final String serverIp) {
        this.serverIp = serverIp;
    }
}
