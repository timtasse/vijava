package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostNasVolumeUserInfo extends DynamicData {

    public String user;

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }
}
