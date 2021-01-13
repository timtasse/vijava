package com.vmware.vim25;

import java.util.Arrays;

/**
 * Specification to configure the cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceHCIConfigSpec extends DynamicData {

    private ClusterComputeResourceDvsProfile[] dvsProf;
    private ClusterComputeResourceHostConfigurationProfile hostConfigProfile;
    private SDDCBase vSanConfigSpec;
    private ClusterComputeResourceVCProfile vcProf;

    @Override
    public String toString() {
        return "ClusterComputeResourceHCIConfigSpec{" +
                "dvsProf=" + Arrays.toString(dvsProf) +
                ", hostConfigProfile=" + hostConfigProfile +
                ", vcProf=" + vcProf +
                ", vSanConfigSpec=" + vSanConfigSpec +
                "} " + super.toString();
    }

    public ClusterComputeResourceDvsProfile[] getDvsProf() {
        return dvsProf;
    }

    public void setDvsProf(final ClusterComputeResourceDvsProfile[] dvsProf) {
        this.dvsProf = dvsProf;
    }

    public ClusterComputeResourceHostConfigurationProfile getHostConfigProfile() {
        return hostConfigProfile;
    }

    public void setHostConfigProfile(final ClusterComputeResourceHostConfigurationProfile hostConfigProfile) {
        this.hostConfigProfile = hostConfigProfile;
    }

    public ClusterComputeResourceVCProfile getVcProf() {
        return vcProf;
    }

    public void setVcProf(final ClusterComputeResourceVCProfile vcProf) {
        this.vcProf = vcProf;
    }

    public SDDCBase getvSanConfigSpec() {
        return vSanConfigSpec;
    }

    public void setvSanConfigSpec(final SDDCBase vSanConfigSpec) {
        this.vSanConfigSpec = vSanConfigSpec;
    }
}
