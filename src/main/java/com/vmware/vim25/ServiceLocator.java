package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ServiceLocator extends DynamicData {

    public ServiceLocatorCredential credential;
    public String instanceUuid;
    public String sslThumbprint;
    public String url;

    public ServiceLocatorCredential getCredential() {
        return credential;
    }

    public void setCredential(final ServiceLocatorCredential credential) {
        this.credential = credential;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(final String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public String getSslThumbprint() {
        return sslThumbprint;
    }

    public void setSslThumbprint(final String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
