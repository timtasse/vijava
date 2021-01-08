package com.vmware.vim25;

/**
 * The data object type describes improved virtual disk infrastructure namespace storage policy details.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class vslmInfrastructureObjectPolicy extends DynamicData {

    private String backingObjectId;
    private LocalizedMethodFault error;
    private String name;
    private String profileId;

    @Override
    public String toString() {
        return "vslmInfrastructureObjectPolicy{" +
                "backingObjectId='" + backingObjectId + '\'' +
                ", error=" + error +
                ", name='" + name + '\'' +
                ", profileId='" + profileId + '\'' +
                "} " + super.toString();
    }

    public String getBackingObjectId() {
        return backingObjectId;
    }

    public void setBackingObjectId(final String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

    public LocalizedMethodFault getError() {
        return error;
    }

    public void setError(final LocalizedMethodFault error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(final String profileId) {
        this.profileId = profileId;
    }

}
