package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterNetworkSpec extends DynamicData {

    public NodeNetworkSpec witnessNetworkSpec;
    public PassiveNodeNetworkSpec passiveNetworkSpec;

    public PassiveNodeNetworkSpec getPassiveNetworkSpec() {
        return passiveNetworkSpec;
    }

    public void setPassiveNetworkSpec(final PassiveNodeNetworkSpec passiveNetworkSpec) {
        this.passiveNetworkSpec = passiveNetworkSpec;
    }

    public NodeNetworkSpec getWitnessNetworkSpec() {
        return witnessNetworkSpec;
    }

    public void setWitnessNetworkSpec(final NodeNetworkSpec witnessNetworkSpec) {
        this.witnessNetworkSpec = witnessNetworkSpec;
    }
}
