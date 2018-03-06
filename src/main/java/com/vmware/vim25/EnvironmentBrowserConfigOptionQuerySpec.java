package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class EnvironmentBrowserConfigOptionQuerySpec extends DynamicData {

    public String key;
    public ManagedObjectReference host;
    public String[] guestId;

    public String[] getGuestId() {
        return guestId;
    }

    public void setGuestId(final String[] guestId) {
        this.guestId = guestId;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }
}
