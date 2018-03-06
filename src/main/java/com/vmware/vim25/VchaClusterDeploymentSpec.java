package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterDeploymentSpec extends DynamicData {

    public PassiveNodeDeploymentSpec passiveDeploymentSpec;
    public NodeDeploymentSpec witnessDeploymentSpec;
    public SourceNodeSpec activeVcSpec;
    public ClusterNetworkConfigSpec activeVcNetworkConfig;

    public ClusterNetworkConfigSpec getActiveVcNetworkConfig() {
        return activeVcNetworkConfig;
    }

    public void setActiveVcNetworkConfig(final ClusterNetworkConfigSpec activeVcNetworkConfig) {
        this.activeVcNetworkConfig = activeVcNetworkConfig;
    }

    public SourceNodeSpec getActiveVcSpec() {
        return activeVcSpec;
    }

    public void setActiveVcSpec(final SourceNodeSpec activeVcSpec) {
        this.activeVcSpec = activeVcSpec;
    }

    public PassiveNodeDeploymentSpec getPassiveDeploymentSpec() {
        return passiveDeploymentSpec;
    }

    public void setPassiveDeploymentSpec(final PassiveNodeDeploymentSpec passiveDeploymentSpec) {
        this.passiveDeploymentSpec = passiveDeploymentSpec;
    }

    public NodeDeploymentSpec getWitnessDeploymentSpec() {
        return witnessDeploymentSpec;
    }

    public void setWitnessDeploymentSpec(final NodeDeploymentSpec witnessDeploymentSpec) {
        this.witnessDeploymentSpec = witnessDeploymentSpec;
    }
}
