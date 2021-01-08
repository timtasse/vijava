package com.vmware.vim25;

import java.util.Arrays;

/**
 * This defines the validation result for the host profile.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HostProfileValidationFailureInfo extends DynamicData {

    private String annotation;
    private HostApplyProfile applyProfile;
    private ProfileUpdateFailedUpdateFailure[] failures;
    private LocalizedMethodFault[] faults;
    private ManagedObjectReference host;
    private String name;
    private String updateType;

    @Override
    public String toString() {
        return "HostProfileValidationFailureInfo{" +
                "annotation='" + annotation + '\'' +
                ", applyProfile=" + applyProfile +
                ", failures=" + Arrays.toString(failures) +
                ", faults=" + Arrays.toString(faults) +
                ", host=" + host +
                ", name='" + name + '\'' +
                ", updateType='" + updateType + '\'' +
                "} " + super.toString();
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(final String annotation) {
        this.annotation = annotation;
    }

    public HostApplyProfile getApplyProfile() {
        return applyProfile;
    }

    public void setApplyProfile(final HostApplyProfile applyProfile) {
        this.applyProfile = applyProfile;
    }

    public ProfileUpdateFailedUpdateFailure[] getFailures() {
        return failures;
    }

    public void setFailures(final ProfileUpdateFailedUpdateFailure[] failures) {
        this.failures = failures;
    }

    public LocalizedMethodFault[] getFaults() {
        return faults;
    }

    public void setFaults(final LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(final String updateType) {
        this.updateType = updateType;
    }

}
