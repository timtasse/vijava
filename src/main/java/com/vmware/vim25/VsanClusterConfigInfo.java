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
 * The VsanClusterConfigInfo data object contains configuration data for the VSAN service in a cluster.
 * This data object is used both for specifying cluster-wide settings when updating the VSAN service,
 * and as an output datatype when retrieving current cluster-wide VSAN service settings.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.0
 */
public class VsanClusterConfigInfo extends DynamicData {

    private Boolean enabled;
    private VsanClusterConfigInfoHostDefaultInfo defaultConfig;
    private Boolean vsanEsaEnabled;

    @Override
    public String toString() {
        return "VsanClusterConfigInfo{" +
                "enabled=" + enabled +
                ", defaultConfig=" + defaultConfig +
                ", vsanEsaEnabled=" + vsanEsaEnabled +
                '}';
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public VsanClusterConfigInfoHostDefaultInfo getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(final VsanClusterConfigInfoHostDefaultInfo defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    public Boolean getVsanEsaEnabled() {
        return vsanEsaEnabled;
    }

    public void setVsanEsaEnabled(final Boolean vsanEsaEnabled) {
        this.vsanEsaEnabled = vsanEsaEnabled;
    }

}
