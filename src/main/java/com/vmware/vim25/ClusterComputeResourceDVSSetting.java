package com.vmware.vim25;

import java.util.Arrays;

/**
 * Contains reference to the DVS, list of physical nics attached to it,
 * and list of dvportgroups created on it while initially configuring a cluster by calling the ConfigureHCI_Task method.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceDVSSetting extends DynamicData {

    private ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping[] dvPortgroupSetting;
    private ManagedObjectReference dvSwitch;
    private String[] pnicDevices;

    @Override
    public String toString() {
        return "ClusterComputeResourceDVSSetting{" +
                "dvPortgroupSetting=" + Arrays.toString(dvPortgroupSetting) +
                ", dvSwitch=" + dvSwitch +
                ", pnicDevices=" + Arrays.toString(pnicDevices) +
                "} " + super.toString();
    }

    public ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping[] getDvPortgroupSetting() {
        return dvPortgroupSetting;
    }

    public void setDvPortgroupSetting(final ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping[] dvPortgroupSetting) {
        this.dvPortgroupSetting = dvPortgroupSetting;
    }

    public ManagedObjectReference getDvSwitch() {
        return dvSwitch;
    }

    public void setDvSwitch(final ManagedObjectReference dvSwitch) {
        this.dvSwitch = dvSwitch;
    }

    public String[] getPnicDevices() {
        return pnicDevices;
    }

    public void setPnicDevices(final String[] pnicDevices) {
        this.pnicDevices = pnicDevices;
    }
}
