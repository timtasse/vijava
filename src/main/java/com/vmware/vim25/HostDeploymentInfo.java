package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostDeploymentInfo extends DynamicData {

    public Boolean bootedFromStatelessCache;

    public Boolean isBootedFromStatelessCache() {
        return bootedFromStatelessCache;
    }

    public void setBootedFromStatelessCache(final Boolean bootedFromStatelessCache) {
        this.bootedFromStatelessCache = bootedFromStatelessCache;
    }
}
