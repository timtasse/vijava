package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VimVasaProvider extends DynamicData {

    public String name;
    public String selfSignedCertificate;
    public String url;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSelfSignedCertificate() {
        return selfSignedCertificate;
    }

    public void setSelfSignedCertificate(final String selfSignedCertificate) {
        this.selfSignedCertificate = selfSignedCertificate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
