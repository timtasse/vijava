package com.vmware.vim25;

import java.util.Arrays;

/**
 * Describes DVS related information to be configured by calling ConfigureHCI_Task method.
 * Consists of name of the DVS, the physical adapters to be attached to it and the list of dvportgroups to be created on this DVS.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceDvsProfile extends DynamicData {

    private String dvsName;
    private ManagedObjectReference dvSwitch;
    private String[] pnicDevices;
    private ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping[] dvPortgroupMapping;

    @Override
    public String toString() {
        return "ClusterComputeResourceDvsProfile{" +
                "dvPortgroupMapping=" + Arrays.toString(dvPortgroupMapping) +
                ", dvsName='" + dvsName + '\'' +
                ", dvSwitch=" + dvSwitch +
                ", pnicDevices=" + Arrays.toString(pnicDevices) +
                "} " + super.toString();
    }

    public ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping[] getDvPortgroupMapping() {
        return dvPortgroupMapping;
    }

    public void setDvPortgroupMapping(final ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping[] dvPortgroupMapping) {
        this.dvPortgroupMapping = dvPortgroupMapping;
    }

    public String getDvsName() {
        return dvsName;
    }

    public void setDvsName(final String dvsName) {
        this.dvsName = dvsName;
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
