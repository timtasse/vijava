package com.vmware.vim25;

/**
 * Describes the validations applicable to the network settings. These are based off the information recorded in dvsSetting.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceDVSConfigurationValidation extends ClusterComputeResourceValidationResultBase {

    private boolean isDvpgValid;
    private boolean isDvsValid;

    @Override
    public String toString() {
        return "ClusterComputeResourceDVSConfigurationValidation{" +
                "isDvpgValid=" + isDvpgValid +
                ", isDvsValid=" + isDvsValid +
                "} " + super.toString();
    }

    public boolean isDvpgValid() {
        return isDvpgValid;
    }

    public void setDvpgValid(final boolean dvpgValid) {
        isDvpgValid = dvpgValid;
    }

    public boolean isDvsValid() {
        return isDvsValid;
    }

    public void setDvsValid(final boolean dvsValid) {
        isDvsValid = dvsValid;
    }
}
