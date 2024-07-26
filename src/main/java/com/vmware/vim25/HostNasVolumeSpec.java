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
 * Specification for creating NAS volume. When mounting a NAS volume on multiple hosts,
 * the same remoteHost and remotePath values should be used on every host, otherwise it will be treated as different datastores.
 * For example, if one host references the remotePath of a NAS volume as "/mnt/mount1" and another references it as "/mnt/mount1/",
 * it will not be recognized as the same datastore.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 */
@SuppressWarnings("unused")
public class HostNasVolumeSpec extends DynamicData {

    private String remoteHost;
    private String remotePath;
    private String localPath;
    private HostMountMode accessMode;
    private HostFileSystemVolumeFileSystemType type;
    private String userName;
    private String password;
    private List<String> remoteHostNames = List.of();
    private HostNasVolumeSecurityType securityType;
    private String vmknicToBind;
    private Boolean vmknicBound;
    private Integer connections;

    @Override
    public String toString() {
        return "HostNasVolumeSpec{" +
                "remoteHost='" + remoteHost + '\'' +
                ", remotePath='" + remotePath + '\'' +
                ", localPath='" + localPath + '\'' +
                ", accessMode=" + accessMode +
                ", type=" + type +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", remoteHostNames=" + remoteHostNames +
                ", securityType=" + securityType +
                ", vmknicToBind='" + vmknicToBind + '\'' +
                ", vmknicBound=" + vmknicBound +
                ", connections=" + connections +
                '}';
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(final String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getRemotePath() {
        return remotePath;
    }

    public void setRemotePath(final String remotePath) {
        this.remotePath = remotePath;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(final String localPath) {
        this.localPath = localPath;
    }

    public HostMountMode getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(final HostMountMode accessMode) {
        this.accessMode = accessMode;
    }

    public HostFileSystemVolumeFileSystemType getType() {
        return type;
    }

    public void setType(final HostFileSystemVolumeFileSystemType type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public List<String> getRemoteHostNames() {
        return remoteHostNames;
    }

    public void setRemoteHostNames(final List<String> remoteHostNames) {
        this.remoteHostNames = remoteHostNames;
    }

    public HostNasVolumeSecurityType getSecurityType() {
        return securityType;
    }

    public void setSecurityType(final HostNasVolumeSecurityType securityType) {
        this.securityType = securityType;
    }

    public String getVmknicToBind() {
        return vmknicToBind;
    }

    public void setVmknicToBind(final String vmknicToBind) {
        this.vmknicToBind = vmknicToBind;
    }

    public Boolean getVmknicBound() {
        return vmknicBound;
    }

    public void setVmknicBound(final Boolean vmknicBound) {
        this.vmknicBound = vmknicBound;
    }

    public Integer getConnections() {
        return connections;
    }

    public void setConnections(final Integer connections) {
        this.connections = connections;
    }

}
