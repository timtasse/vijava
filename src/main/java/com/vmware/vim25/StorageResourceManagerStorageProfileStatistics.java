package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class StorageResourceManagerStorageProfileStatistics extends DynamicData {

    public String profileId;
    public long totalSpaceMB;
    public long usedSpaceMB;

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(final String profileId) {
        this.profileId = profileId;
    }

    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }

    public void setTotalSpaceMB(final long totalSpaceMB) {
        this.totalSpaceMB = totalSpaceMB;
    }

    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }

    public void setUsedSpaceMB(final long usedSpaceMB) {
        this.usedSpaceMB = usedSpaceMB;
    }
}
