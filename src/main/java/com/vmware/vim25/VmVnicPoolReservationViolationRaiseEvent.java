package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VmVnicPoolReservationViolationRaiseEvent extends DvsEvent {

    public String vmVnicResourcePoolKey;
    public String vmVnicResourcePoolName;

    public String getVmVnicResourcePoolKey() {
        return vmVnicResourcePoolKey;
    }

    public void setVmVnicResourcePoolKey(final String vmVnicResourcePoolKey) {
        this.vmVnicResourcePoolKey = vmVnicResourcePoolKey;
    }

    public String getVmVnicResourcePoolName() {
        return vmVnicResourcePoolName;
    }

    public void setVmVnicResourcePoolName(final String vmVnicResourcePoolName) {
        this.vmVnicResourcePoolName = vmVnicResourcePoolName;
    }
}
