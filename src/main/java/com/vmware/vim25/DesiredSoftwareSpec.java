package com.vmware.vim25;

import java.util.Arrays;

/**
 * Desired Software Spec is defined as combination of base-image and add-on component
 * which user wants to install on ESX host or cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 7.0
 */
public class DesiredSoftwareSpec extends DynamicData {

    private DesiredSoftwareSpecBaseImageSpec baseImageSpec;
    private DesiredSoftwareSpecVendorAddOnSpec vendorAddOnSpec;
    private DesiredSoftwareSpecComponentSpec[] components;

    @Override
    public String toString() {
        return "DesiredSoftwareSpec{" +
                "baseImageSpec=" + baseImageSpec +
                ", vendorAddOnSpec=" + vendorAddOnSpec +
                ", components=" + Arrays.toString(components) +
                '}';
    }

    public DesiredSoftwareSpecBaseImageSpec getBaseImageSpec() {
        return baseImageSpec;
    }

    public void setBaseImageSpec(final DesiredSoftwareSpecBaseImageSpec baseImageSpec) {
        this.baseImageSpec = baseImageSpec;
    }

    public DesiredSoftwareSpecVendorAddOnSpec getVendorAddOnSpec() {
        return vendorAddOnSpec;
    }

    public void setVendorAddOnSpec(final DesiredSoftwareSpecVendorAddOnSpec vendorAddOnSpec) {
        this.vendorAddOnSpec = vendorAddOnSpec;
    }

    public DesiredSoftwareSpecComponentSpec[] getComponents() {
        return components;
    }

    public void setComponents(final DesiredSoftwareSpecComponentSpec[] components) {
        this.components = components;
    }

}
