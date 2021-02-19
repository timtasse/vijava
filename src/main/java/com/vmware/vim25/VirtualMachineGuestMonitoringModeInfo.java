package com.vmware.vim25;

/**
 * This data object describes the GMM (Guest Mode Monitoring) configuration of this virtual machine.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class VirtualMachineGuestMonitoringModeInfo extends DynamicData {

    private String gmmFile;
    private String gmmAppliance;

    @Override
    public String toString() {
        return "VirtualMachineGuestMonitoringModeInfo{" +
                "gmmFile='" + gmmFile + '\'' +
                ", gmmAppliance='" + gmmAppliance + '\'' +
                "} " + super.toString();
    }

    public String getGmmFile() {
        return gmmFile;
    }

    public void setGmmFile(final String gmmFile) {
        this.gmmFile = gmmFile;
    }

    public String getGmmAppliance() {
        return gmmAppliance;
    }

    public void setGmmAppliance(final String gmmAppliance) {
        this.gmmAppliance = gmmAppliance;
    }

}
