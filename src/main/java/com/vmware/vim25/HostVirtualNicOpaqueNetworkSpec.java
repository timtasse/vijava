package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostVirtualNicOpaqueNetworkSpec extends DynamicData {

    public String opaqueNetworkId;
    public String opaqueNetworkType;

    public String getOpaqueNetworkId() {
        return opaqueNetworkId;
    }

    public void setOpaqueNetworkId(final String opaqueNetworkId) {
        this.opaqueNetworkId = opaqueNetworkId;
    }

    public String getOpaqueNetworkType() {
        return opaqueNetworkType;
    }

    public void setOpaqueNetworkType(final String opaqueNetworkType) {
        this.opaqueNetworkType = opaqueNetworkType;
    }
}
