package com.vmware.vim25;

/**
 * The NsxHostVNicProfile data object is the base object for host Virtual NIC connected to NSX logic switch subprofiles.
 * If a profile plug-in defines additional policies or subprofiles, use the policy or property list to access the configuration data.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NsxHostVNicProfile extends ApplyProfile {

    private String key;
    private IpAddressProfile ipConfig;

    @Override
    public String toString() {
        return "NsxHostVNicProfile{" +
                "ipConfig=" + ipConfig +
                ", key='" + key + '\'' +
                "} " + super.toString();
    }

    public IpAddressProfile getIpConfig() {
        return ipConfig;
    }

    public void setIpConfig(final IpAddressProfile ipConfig) {
        this.ipConfig = ipConfig;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

}
