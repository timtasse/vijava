package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class KmipServerSpec extends DynamicData {

    public KeyProviderId clusterId;
    public KmipServerInfo info;
    public String password;

    public KeyProviderId getClusterId() {
        return clusterId;
    }

    public void setClusterId(final KeyProviderId clusterId) {
        this.clusterId = clusterId;
    }

    public KmipServerInfo getInfo() {
        return info;
    }

    public void setInfo(final KmipServerInfo info) {
        this.info = info;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
