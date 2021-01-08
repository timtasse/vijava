/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
 * Information about the capabilities of this datastore.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */
public class DatastoreCapability extends DynamicData {

    private boolean directoryHierarchySupported;
    private boolean nativeSnapshotSupported;
    private boolean perFileThinProvisioningSupported;
    private boolean rawDiskMappingsSupported;
    private Boolean seSparseSupported;
    private boolean storageIORMSupported;
    private Boolean topLevelDirectoryCreateSupported;
    private Boolean upitSupported;
    private Boolean vmdkExpandSupported;
    private Boolean vmfsSparseSupported;
    private Boolean vsanSparseSupported;

    @Override
    public String toString() {
        return "DatastoreCapability{" +
                "directoryHierarchySupported=" + directoryHierarchySupported +
                ", nativeSnapshotSupported=" + nativeSnapshotSupported +
                ", perFileThinProvisioningSupported=" + perFileThinProvisioningSupported +
                ", rawDiskMappingsSupported=" + rawDiskMappingsSupported +
                ", seSparseSupported=" + seSparseSupported +
                ", storageIORMSupported=" + storageIORMSupported +
                ", topLevelDirectoryCreateSupported=" + topLevelDirectoryCreateSupported +
                ", upitSupported=" + upitSupported +
                ", vmdkExpandSupported=" + vmdkExpandSupported +
                ", vmfsSparseSupported=" + vmfsSparseSupported +
                ", vsanSparseSupported=" + vsanSparseSupported +
                "} " + super.toString();
    }

    public boolean isDirectoryHierarchySupported() {
        return directoryHierarchySupported;
    }

    public void setDirectoryHierarchySupported(final boolean directoryHierarchySupported) {
        this.directoryHierarchySupported = directoryHierarchySupported;
    }

    public boolean isNativeSnapshotSupported() {
        return nativeSnapshotSupported;
    }

    public void setNativeSnapshotSupported(final boolean nativeSnapshotSupported) {
        this.nativeSnapshotSupported = nativeSnapshotSupported;
    }

    public boolean isPerFileThinProvisioningSupported() {
        return perFileThinProvisioningSupported;
    }

    public void setPerFileThinProvisioningSupported(final boolean perFileThinProvisioningSupported) {
        this.perFileThinProvisioningSupported = perFileThinProvisioningSupported;
    }

    public boolean isRawDiskMappingsSupported() {
        return rawDiskMappingsSupported;
    }

    public void setRawDiskMappingsSupported(final boolean rawDiskMappingsSupported) {
        this.rawDiskMappingsSupported = rawDiskMappingsSupported;
    }

    public Boolean getSeSparseSupported() {
        return seSparseSupported;
    }

    public void setSeSparseSupported(final Boolean seSparseSupported) {
        this.seSparseSupported = seSparseSupported;
    }

    public boolean isStorageIORMSupported() {
        return storageIORMSupported;
    }

    public void setStorageIORMSupported(final boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }

    public Boolean getTopLevelDirectoryCreateSupported() {
        return topLevelDirectoryCreateSupported;
    }

    public void setTopLevelDirectoryCreateSupported(final Boolean topLevelDirectoryCreateSupported) {
        this.topLevelDirectoryCreateSupported = topLevelDirectoryCreateSupported;
    }

    public Boolean getUpitSupported() {
        return upitSupported;
    }

    public void setUpitSupported(final Boolean upitSupported) {
        this.upitSupported = upitSupported;
    }

    public Boolean getVmdkExpandSupported() {
        return vmdkExpandSupported;
    }

    public void setVmdkExpandSupported(final Boolean vmdkExpandSupported) {
        this.vmdkExpandSupported = vmdkExpandSupported;
    }

    public Boolean getVmfsSparseSupported() {
        return vmfsSparseSupported;
    }

    public void setVmfsSparseSupported(final Boolean vmfsSparseSupported) {
        this.vmfsSparseSupported = vmfsSparseSupported;
    }

    public Boolean getVsanSparseSupported() {
        return vsanSparseSupported;
    }

    public void setVsanSparseSupported(final Boolean vsanSparseSupported) {
        this.vsanSparseSupported = vsanSparseSupported;
    }

}
