package com.vmware.vim25;

import java.util.Arrays;

/**
 * Describes the validation results.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class ClusterComputeResourceValidationResultBase extends DynamicData {

    private LocalizableMessage[] error;

    @Override
    public String toString() {
        return "ClusterComputeResourceValidationResultBase{" +
                "error=" + Arrays.toString(error) +
                "} " + super.toString();
    }

    public LocalizableMessage[] getError() {
        return error;
    }

    public void setError(final LocalizableMessage[] error) {
        this.error = error;
    }
}
