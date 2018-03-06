package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostAccessControlEntry extends DynamicData {

    public HostAccessMode accessMode;
    public boolean group;
    public String principal;

    public HostAccessMode getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(final HostAccessMode accessMode) {
        this.accessMode = accessMode;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(final boolean group) {
        this.group = group;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(final String principal) {
        this.principal = principal;
    }
}
