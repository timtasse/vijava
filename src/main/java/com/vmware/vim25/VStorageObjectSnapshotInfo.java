package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object type contains the brief information of a virtual storage snapshot.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VStorageObjectSnapshotInfo extends DynamicData {

    private VStorageObjectSnapshotInfoVStorageObjectSnapshot[] snapshots;

    @Override
    public String toString() {
        return "VStorageObjectSnapshotInfo{" +
                "snapshots=" + Arrays.toString(snapshots) +
                "} " + super.toString();
    }

    public VStorageObjectSnapshotInfoVStorageObjectSnapshot[] getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(final VStorageObjectSnapshotInfoVStorageObjectSnapshot[] snapshots) {
        this.snapshots = snapshots;
    }

}
