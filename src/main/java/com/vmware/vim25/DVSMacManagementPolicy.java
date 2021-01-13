package com.vmware.vim25;

/**
 * This data object type describes MAC management policy of a port.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class DVSMacManagementPolicy extends InheritablePolicy {

    private Boolean allowPromiscuous;
    private Boolean macChanges;
    private Boolean forgedTransmits;
    private DVSMacLearningPolicy macLearningPolicy;

    @Override
    public String toString() {
        return "DVSMacManagementPolicy{" +
                "allowPromiscuous=" + allowPromiscuous +
                ", forgedTransmits=" + forgedTransmits +
                ", macChanges=" + macChanges +
                ", macLearningPolicy=" + macLearningPolicy +
                "} " + super.toString();
    }

    public Boolean getAllowPromiscuous() {
        return allowPromiscuous;
    }

    public void setAllowPromiscuous(final Boolean allowPromiscuous) {
        this.allowPromiscuous = allowPromiscuous;
    }

    public Boolean getForgedTransmits() {
        return forgedTransmits;
    }

    public void setForgedTransmits(final Boolean forgedTransmits) {
        this.forgedTransmits = forgedTransmits;
    }

    public Boolean getMacChanges() {
        return macChanges;
    }

    public void setMacChanges(final Boolean macChanges) {
        this.macChanges = macChanges;
    }

    public DVSMacLearningPolicy getMacLearningPolicy() {
        return macLearningPolicy;
    }

    public void setMacLearningPolicy(final DVSMacLearningPolicy macLearningPolicy) {
        this.macLearningPolicy = macLearningPolicy;
    }

}
