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
 * Provides a manifest for downloaded (exported) files and disks.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 4.1
 */

@SuppressWarnings("all")
public class HttpNfcLeaseManifestEntry extends DynamicData {

    private Long capacity;
    private String checksum;
    private String checksumType;
    private boolean disk;
    private String key;
    private Long populatedSize;
    private String sha1;
    private long size;

    @Override
    public String toString() {
        return "HttpNfcLeaseManifestEntry{" +
                "capacity=" + capacity +
                ", checksum='" + checksum + '\'' +
                ", checksumType='" + checksumType + '\'' +
                ", disk=" + disk +
                ", key='" + key + '\'' +
                ", populatedSize=" + populatedSize +
                ", sha1='" + sha1 + '\'' +
                ", size=" + size +
                "} " + super.toString();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSha1() {
        return this.sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isDisk() {
        return this.disk;
    }

    public void setDisk(boolean disk) {
        this.disk = disk;
    }

    public Long getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getPopulatedSize() {
        return this.populatedSize;
    }

    public void setPopulatedSize(Long populatedSize) {
        this.populatedSize = populatedSize;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(final String checksum) {
        this.checksum = checksum;
    }

    public String getChecksumType() {
        return checksumType;
    }

    public void setChecksumType(final String checksumType) {
        this.checksumType = checksumType;
    }

}
