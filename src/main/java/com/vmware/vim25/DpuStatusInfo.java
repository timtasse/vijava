package com.vmware.vim25;

import java.util.Collections;
import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class DpuStatusInfo extends HostHardwareElementInfo {

    private String dpuId;
    private HostFru fru;
    private List<DpuStatusInfoOperationalInfo> sensors = Collections.emptyList();

    @Override
    public String toString() {
        return "DpuStatusInfo{" +
                "dpuId='" + dpuId + '\'' +
                ", fru=" + fru +
                ", sensors=" + sensors +
                '}';
    }

    public String getDpuId() {
        return dpuId;
    }

    public void setDpuId(final String dpuId) {
        this.dpuId = dpuId;
    }

    public HostFru getFru() {
        return fru;
    }

    public void setFru(final HostFru fru) {
        this.fru = fru;
    }

    public List<DpuStatusInfoOperationalInfo> getSensors() {
        return sensors;
    }

    public void setSensors(final List<DpuStatusInfoOperationalInfo> sensors) {
        this.sensors = sensors;
    }

}
