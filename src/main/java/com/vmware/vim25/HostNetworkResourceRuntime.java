package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostNetworkResourceRuntime extends DynamicData {

    public HostPnicNetworkResourceInfo[] pnicResourceInfo;

    public HostPnicNetworkResourceInfo[] getPnicResourceInfo() {
        return pnicResourceInfo;
    }

    public void setPnicResourceInfo(final HostPnicNetworkResourceInfo[] pnicResourceInfo) {
        this.pnicResourceInfo = pnicResourceInfo;
    }
}
