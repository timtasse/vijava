package com.vmware.vim25;

import java.util.List;

/**
 * Description of a Device Virtualization Extensions (DVX) device class.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class VirtualMachineDvxClassInfo extends DynamicData {

    private ElementDescription deviceClass;
    private String vendorName;
    private boolean sriovNic;
    private List<OptionDef> configParams;

    @Override
    public String toString() {
        return "VirtualMachineDvxClassInfo{" +
                "deviceClass=" + deviceClass +
                ", vendorName='" + vendorName + '\'' +
                ", sriovNic=" + sriovNic +
                ", configParams=" + configParams +
                '}';
    }

    public ElementDescription getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(final ElementDescription deviceClass) {
        this.deviceClass = deviceClass;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(final String vendorName) {
        this.vendorName = vendorName;
    }

    public boolean isSriovNic() {
        return sriovNic;
    }

    public void setSriovNic(final boolean sriovNic) {
        this.sriovNic = sriovNic;
    }

    public List<OptionDef> getConfigParams() {
        return configParams;
    }

    public void setConfigParams(final List<OptionDef> configParams) {
        this.configParams = configParams;
    }

}
