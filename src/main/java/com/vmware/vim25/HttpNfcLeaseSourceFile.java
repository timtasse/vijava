package com.vmware.vim25;

import java.util.Arrays;

/**
 * Descriptor of the remote source file used in pull scenario.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class HttpNfcLeaseSourceFile extends DynamicData {

    private boolean create;
    private KeyValue[] httpHeaders;
    private String memberName;
    private Long size;
    private String sslThumbprint;
    private String targetDeviceId;
    private String url;

    @Override
    public String toString() {
        return "HttpNfcLeaseSourceFile{" +
                "create=" + create +
                ", httpHeaders=" + Arrays.toString(httpHeaders) +
                ", memberName='" + memberName + '\'' +
                ", size=" + size +
                ", sslThumbprint='" + sslThumbprint + '\'' +
                ", targetDeviceId='" + targetDeviceId + '\'' +
                ", url='" + url + '\'' +
                "} " + super.toString();
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(final boolean create) {
        this.create = create;
    }

    public KeyValue[] getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final KeyValue[] httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(final String memberName) {
        this.memberName = memberName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(final Long size) {
        this.size = size;
    }

    public String getSslThumbprint() {
        return sslThumbprint;
    }

    public void setSslThumbprint(final String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    public String getTargetDeviceId() {
        return targetDeviceId;
    }

    public void setTargetDeviceId(final String targetDeviceId) {
        this.targetDeviceId = targetDeviceId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

}
