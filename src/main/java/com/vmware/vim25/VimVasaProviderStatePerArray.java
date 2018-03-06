package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VimVasaProviderStatePerArray extends DynamicData {

    public boolean active;
    public String arrayId;
    public int priority;

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public String getArrayId() {
        return arrayId;
    }

    public void setArrayId(final String arrayId) {
        this.arrayId = arrayId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(final int priority) {
        this.priority = priority;
    }
}
