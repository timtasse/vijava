package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostProfileManagerCompositionValidationResultResultElement extends DynamicData {

    public LocalizableMessage[] errors;
    public HostApplyProfile sourceDiffForToBeMerged;
    public String status;
    public ManagedObjectReference target;
    public HostApplyProfile targetDiffForToBeMerged;
    public HostApplyProfile toBeAdded;
    public HostApplyProfile toBeDeleted;
    public HostApplyProfile toBeDisabled;
    public HostApplyProfile toBeEnabled;
    public HostApplyProfile toBeReenableCC;

    public LocalizableMessage[] getErrors() {
        return errors;
    }

    public void setErrors(final LocalizableMessage[] errors) {
        this.errors = errors;
    }

    public HostApplyProfile getSourceDiffForToBeMerged() {
        return sourceDiffForToBeMerged;
    }

    public void setSourceDiffForToBeMerged(final HostApplyProfile sourceDiffForToBeMerged) {
        this.sourceDiffForToBeMerged = sourceDiffForToBeMerged;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public ManagedObjectReference getTarget() {
        return target;
    }

    public void setTarget(final ManagedObjectReference target) {
        this.target = target;
    }

    public HostApplyProfile getTargetDiffForToBeMerged() {
        return targetDiffForToBeMerged;
    }

    public void setTargetDiffForToBeMerged(final HostApplyProfile targetDiffForToBeMerged) {
        this.targetDiffForToBeMerged = targetDiffForToBeMerged;
    }

    public HostApplyProfile getToBeAdded() {
        return toBeAdded;
    }

    public void setToBeAdded(final HostApplyProfile toBeAdded) {
        this.toBeAdded = toBeAdded;
    }

    public HostApplyProfile getToBeDeleted() {
        return toBeDeleted;
    }

    public void setToBeDeleted(final HostApplyProfile toBeDeleted) {
        this.toBeDeleted = toBeDeleted;
    }

    public HostApplyProfile getToBeDisabled() {
        return toBeDisabled;
    }

    public void setToBeDisabled(final HostApplyProfile toBeDisabled) {
        this.toBeDisabled = toBeDisabled;
    }

    public HostApplyProfile getToBeEnabled() {
        return toBeEnabled;
    }

    public void setToBeEnabled(final HostApplyProfile toBeEnabled) {
        this.toBeEnabled = toBeEnabled;
    }

    public HostApplyProfile getToBeReenableCC() {
        return toBeReenableCC;
    }

    public void setToBeReenableCC(final HostApplyProfile toBeReenableCC) {
        this.toBeReenableCC = toBeReenableCC;
    }
}
