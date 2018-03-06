package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VirtualResourcePoolUsage extends DynamicData {

    public long cpuReservationMhz;
    public long cpuReservationUsedMhz;
    public long memReservationMB;
    public long memReservationUsedMB;
    public String vrpId;

    public long getCpuReservationMhz() {
        return cpuReservationMhz;
    }

    public void setCpuReservationMhz(final long cpuReservationMhz) {
        this.cpuReservationMhz = cpuReservationMhz;
    }

    public long getCpuReservationUsedMhz() {
        return cpuReservationUsedMhz;
    }

    public void setCpuReservationUsedMhz(final long cpuReservationUsedMhz) {
        this.cpuReservationUsedMhz = cpuReservationUsedMhz;
    }

    public long getMemReservationMB() {
        return memReservationMB;
    }

    public void setMemReservationMB(final long memReservationMB) {
        this.memReservationMB = memReservationMB;
    }

    public long getMemReservationUsedMB() {
        return memReservationUsedMB;
    }

    public void setMemReservationUsedMB(final long memReservationUsedMB) {
        this.memReservationUsedMB = memReservationUsedMB;
    }

    public String getVrpId() {
        return vrpId;
    }

    public void setVrpId(final String vrpId) {
        this.vrpId = vrpId;
    }
}
