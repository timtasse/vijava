package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ChangesInfoEventArgument extends DynamicData {

    public String added;
    public String deleted;
    public String modified;

    public String getAdded() {
        return added;
    }

    public void setAdded(final String added) {
        this.added = added;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(final String deleted) {
        this.deleted = deleted;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(final String modified) {
        this.modified = modified;
    }
}
