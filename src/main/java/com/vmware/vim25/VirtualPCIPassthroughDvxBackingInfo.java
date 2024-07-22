package com.vmware.vim25;

import java.util.List;

/**
 * DVX Device specific information.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualPCIPassthroughDvxBackingInfo extends VirtualDeviceBackingInfo {

    private String deviceClass;
    private List<OptionValue> configParams;

    @Override
    public String toString() {
        return "VirtualPCIPassthroughDvxBackingInfo{" +
                "deviceClass='" + deviceClass + '\'' +
                ", configParams=" + configParams +
                '}';
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(final String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public List<OptionValue> getConfigParams() {
        return configParams;
    }

    public void setConfigParams(final List<OptionValue> configParams) {
        this.configParams = configParams;
    }

}
