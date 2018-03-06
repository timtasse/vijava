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
public class DistributedVirtualSwitchPortStatistics extends DynamicData {

    public long bytesInBroadcast;
    public Long bytesInFromPnic;
    public long bytesInMulticast;
    public long bytesInUnicast;
    public long bytesOutBroadcast;
    public long bytesOutMulticast;
    public Long bytesOutToPnic;
    public long bytesOutUnicast;
    public long packetsInBroadcast;
    public long packetsInDropped;
    public long packetsInException;
    public long packetsInMulticast;
    public long packetsInUnicast;
    public long packetsOutBroadcast;
    public long packetsOutDropped;
    public long packetsOutException;
    public long packetsOutMulticast;
    public long packetsOutUnicast;

    public long getPacketsInMulticast() {
        return this.packetsInMulticast;
    }

    public void setPacketsInMulticast(long packetsInMulticast) {
        this.packetsInMulticast = packetsInMulticast;
    }

    public long getPacketsOutMulticast() {
        return this.packetsOutMulticast;
    }

    public void setPacketsOutMulticast(long packetsOutMulticast) {
        this.packetsOutMulticast = packetsOutMulticast;
    }

    public long getBytesInMulticast() {
        return this.bytesInMulticast;
    }

    public void setBytesInMulticast(long bytesInMulticast) {
        this.bytesInMulticast = bytesInMulticast;
    }

    public long getBytesOutMulticast() {
        return this.bytesOutMulticast;
    }

    public void setBytesOutMulticast(long bytesOutMulticast) {
        this.bytesOutMulticast = bytesOutMulticast;
    }

    public long getPacketsInUnicast() {
        return this.packetsInUnicast;
    }

    public void setPacketsInUnicast(long packetsInUnicast) {
        this.packetsInUnicast = packetsInUnicast;
    }

    public long getPacketsOutUnicast() {
        return this.packetsOutUnicast;
    }

    public void setPacketsOutUnicast(long packetsOutUnicast) {
        this.packetsOutUnicast = packetsOutUnicast;
    }

    public long getBytesInUnicast() {
        return this.bytesInUnicast;
    }

    public void setBytesInUnicast(long bytesInUnicast) {
        this.bytesInUnicast = bytesInUnicast;
    }

    public long getBytesOutUnicast() {
        return this.bytesOutUnicast;
    }

    public void setBytesOutUnicast(long bytesOutUnicast) {
        this.bytesOutUnicast = bytesOutUnicast;
    }

    public long getPacketsInBroadcast() {
        return this.packetsInBroadcast;
    }

    public void setPacketsInBroadcast(long packetsInBroadcast) {
        this.packetsInBroadcast = packetsInBroadcast;
    }

    public long getPacketsOutBroadcast() {
        return this.packetsOutBroadcast;
    }

    public void setPacketsOutBroadcast(long packetsOutBroadcast) {
        this.packetsOutBroadcast = packetsOutBroadcast;
    }

    public long getBytesInBroadcast() {
        return this.bytesInBroadcast;
    }

    public void setBytesInBroadcast(long bytesInBroadcast) {
        this.bytesInBroadcast = bytesInBroadcast;
    }

    public long getBytesOutBroadcast() {
        return this.bytesOutBroadcast;
    }

    public void setBytesOutBroadcast(long bytesOutBroadcast) {
        this.bytesOutBroadcast = bytesOutBroadcast;
    }

    public long getPacketsInDropped() {
        return this.packetsInDropped;
    }

    public void setPacketsInDropped(long packetsInDropped) {
        this.packetsInDropped = packetsInDropped;
    }

    public long getPacketsOutDropped() {
        return this.packetsOutDropped;
    }

    public void setPacketsOutDropped(long packetsOutDropped) {
        this.packetsOutDropped = packetsOutDropped;
    }

    public long getPacketsInException() {
        return this.packetsInException;
    }

    public void setPacketsInException(long packetsInException) {
        this.packetsInException = packetsInException;
    }

    public long getPacketsOutException() {
        return this.packetsOutException;
    }

    public void setPacketsOutException(long packetsOutException) {
        this.packetsOutException = packetsOutException;
    }

    public Long getBytesInFromPnic() {
        return bytesInFromPnic;
    }

    public void setBytesInFromPnic(final Long bytesInFromPnic) {
        this.bytesInFromPnic = bytesInFromPnic;
    }

    public Long getBytesOutToPnic() {
        return bytesOutToPnic;
    }

    public void setBytesOutToPnic(final Long bytesOutToPnic) {
        this.bytesOutToPnic = bytesOutToPnic;
    }
}