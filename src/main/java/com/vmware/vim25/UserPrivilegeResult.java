package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class UserPrivilegeResult extends DynamicData {

    public ManagedObjectReference entity;
    public String[] privileges;

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(final ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(final String[] privileges) {
        this.privileges = privileges;
    }
}
