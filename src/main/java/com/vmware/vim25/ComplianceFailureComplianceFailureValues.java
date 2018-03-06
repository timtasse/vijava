package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ComplianceFailureComplianceFailureValues extends DynamicData {

    public String comparisonIdentifier;
    public String hostValue;
    public String profileInstance;
    public String profileValue;

    public String getComparisonIdentifier() {
        return comparisonIdentifier;
    }

    public void setComparisonIdentifier(final String comparisonIdentifier) {
        this.comparisonIdentifier = comparisonIdentifier;
    }

    public String getHostValue() {
        return hostValue;
    }

    public void setHostValue(final String hostValue) {
        this.hostValue = hostValue;
    }

    public String getProfileInstance() {
        return profileInstance;
    }

    public void setProfileInstance(final String profileInstance) {
        this.profileInstance = profileInstance;
    }

    public String getProfileValue() {
        return profileValue;
    }

    public void setProfileValue(final String profileValue) {
        this.profileValue = profileValue;
    }
}
