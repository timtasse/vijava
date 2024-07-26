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

import java.util.List;

/**
 * The HostFileSystemVolumeInfo data object describes the file system volume information for the host.
 * A file system volume refers to a storage abstraction that allows files to be created and organized.
 * A host can have multiple file system volumes.
 * File system volumes are typically mounted into a file namespace that allows all files in mounted file systems to be addressable from the host.
 *
 * A file system volume is backed by disk storage. It could span one or more disks but need not use an entire disk.
 *
 * A file system volume by definition must be mounted on the file system in order to exist.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */
@SuppressWarnings("unused")
public class HostFileSystemVolumeInfo extends DynamicData {

    private List<String> volumeTypeList;
    private List<HostFileSystemMountInfo> mountInfo;

    @Override
    public String toString() {
        return "HostFileSystemVolumeInfo{" +
                "volumeTypeList=" + volumeTypeList +
                ", mountInfo=" + mountInfo +
                '}';
    }

    public List<String> getVolumeTypeList() {
        return volumeTypeList;
    }

    public void setVolumeTypeList(final List<String> volumeTypeList) {
        this.volumeTypeList = volumeTypeList;
    }

    public List<HostFileSystemMountInfo> getMountInfo() {
        return mountInfo;
    }

    public void setMountInfo(final List<HostFileSystemMountInfo> mountInfo) {
        this.mountInfo = mountInfo;
    }

}
