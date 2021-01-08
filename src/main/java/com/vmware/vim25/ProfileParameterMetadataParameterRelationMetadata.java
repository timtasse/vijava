package com.vmware.vim25;

import java.util.Arrays;

/**
 * This class to define a relation between the parameter and a profile or a parameter, or a constant list of values.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class ProfileParameterMetadataParameterRelationMetadata extends DynamicData {

    private int maxCount;
    private int minCount;
    private ProfilePropertyPath path;
    private String[] relationTypes;
    private Object[] values;

    @Override
    public String toString() {
        return "ProfileParameterMetadataParameterRelationMetadata{" +
                "maxCount=" + maxCount +
                ", minCount=" + minCount +
                ", path=" + path +
                ", relationTypes=" + Arrays.toString(relationTypes) +
                ", values=" + Arrays.toString(values) +
                "} " + super.toString();
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(final int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(final int minCount) {
        this.minCount = minCount;
    }

    public ProfilePropertyPath getPath() {
        return path;
    }

    public void setPath(final ProfilePropertyPath path) {
        this.path = path;
    }

    public String[] getRelationTypes() {
        return relationTypes;
    }

    public void setRelationTypes(final String[] relationTypes) {
        this.relationTypes = relationTypes;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(final Object[] values) {
        this.values = values;
    }

}
