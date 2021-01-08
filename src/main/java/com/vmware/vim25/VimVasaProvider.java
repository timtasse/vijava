package com.vmware.vim25;

/**
 * Data object representing VASA Provider.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.0
 */
public class VimVasaProvider extends DynamicData {

    private String name;
    private String selfSignedCertificate;
    private String uid;
    private String url;

    @Override
    public String toString() {
        return "VimVasaProvider{" +
                "name='" + name + '\'' +
                ", selfSignedCertificate='" + selfSignedCertificate + '\'' +
                ", uid='" + uid + '\'' +
                ", url='" + url + '\'' +
                "} " + super.toString();
    }

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

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

}
