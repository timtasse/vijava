package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public enum QuarantineModeFaultFaultType {

    CorrectionDisallowed("CorrectionDisallowed"),
    CorrectionImpact("CorrectionImpact"),
    NoCompatibleNonQuarantinedHost("NoCompatibleNonQuarantinedHost");

    private final String val;

    QuarantineModeFaultFaultType(final String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}