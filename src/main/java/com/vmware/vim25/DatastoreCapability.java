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
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */
@SuppressWarnings("all")
public class DatastoreCapability extends DynamicData {

    public boolean directoryHierarchySupported;
    public boolean nativeSnapshotSupported;
    public boolean perFileThinProvisioningSupported;
    public boolean rawDiskMappingsSupported;
    public Boolean seSparseSupported;
    public boolean storageIORMSupported;
    public Boolean topLevelDirectoryCreateSupported;
    public Boolean upitSupported;
    public Boolean vmfsSparseSupported;
    public Boolean vsanSparseSupported;

    public boolean isDirectoryHierarchySupported() {
        return this.directoryHierarchySupported;
    }

    public void setDirectoryHierarchySupported(boolean directoryHierarchySupported) {
        this.directoryHierarchySupported = directoryHierarchySupported;
    }

    public boolean isRawDiskMappingsSupported() {
        return this.rawDiskMappingsSupported;
    }

    public void setRawDiskMappingsSupported(boolean rawDiskMappingsSupported) {
        this.rawDiskMappingsSupported = rawDiskMappingsSupported;
    }

    public boolean isPerFileThinProvisioningSupported() {
        return this.perFileThinProvisioningSupported;
    }

    public void setPerFileThinProvisioningSupported(boolean perFileThinProvisioningSupported) {
        this.perFileThinProvisioningSupported = perFileThinProvisioningSupported;
    }

    public boolean isNativeSnapshotSupported() {
        return nativeSnapshotSupported;
    }

    public void setNativeSnapshotSupported(boolean nativeSnapshotSupported) {
        this.nativeSnapshotSupported = nativeSnapshotSupported;
    }

    public boolean isSeSparseSupported() {
        return seSparseSupported;
    }

    public void setSeSparseSupported(boolean seSparseSupported) {
        this.seSparseSupported = seSparseSupported;
    }

    public boolean isStorageIORMSupported() {
        return storageIORMSupported;
    }

    public void setStorageIORMSupported(boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }

    public boolean isTopLevelDirectoryCreateSupported() {
        return topLevelDirectoryCreateSupported;
    }

    public void setTopLevelDirectoryCreateSupported(boolean topLevelDirectoryCreateSupported) {
        this.topLevelDirectoryCreateSupported = topLevelDirectoryCreateSupported;
    }

    public boolean isUpitSupported() {
        return upitSupported;
    }

    public void setUpitSupported(final boolean upitSupported) {
        this.upitSupported = upitSupported;
    }

    public boolean isVmfsSparseSupported() {
        return vmfsSparseSupported;
    }

    public void setVmfsSparseSupported(final boolean vmfsSparseSupported) {
        this.vmfsSparseSupported = vmfsSparseSupported;
    }

    public boolean isVsanSparseSupported() {
        return vsanSparseSupported;
    }

    public void setVsanSparseSupported(final boolean vsanSparseSupported) {
        this.vsanSparseSupported = vsanSparseSupported;
    }
}