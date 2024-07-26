package com.vmware.vim25;

/**
 * Data object representing VASA Provider.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 * @since 6.0
 */
public class VimVasaProvider extends DynamicData {

    private String uid;
    private String url;
    private String name;
    private String selfSignedCertificate;
    private VimVasaProviderVirtualHostConfig vhostConfig;
    private Integer versionId;

    @Override
    public String toString() {
        return "VimVasaProvider{" +
                "uid='" + uid + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", selfSignedCertificate='" + selfSignedCertificate + '\'' +
                ", vhostConfig=" + vhostConfig +
                ", versionId=" + versionId +
                '}';
    }

    public VimVasaProviderVirtualHostConfig getVhostConfig() {
        return vhostConfig;
    }

    public void setVhostConfig(final VimVasaProviderVirtualHostConfig vhostConfig) {
        this.vhostConfig = vhostConfig;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(final Integer versionId) {
        this.versionId = versionId;
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
