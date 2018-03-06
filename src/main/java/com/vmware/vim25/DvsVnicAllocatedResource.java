package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class DvsVnicAllocatedResource extends DynamicData {

    public Long reservation;
    public ManagedObjectReference vm;
    public String vnicKey;

    public long getReservation() {
        return reservation;
    }

    public void setReservation(final long reservation) {
        this.reservation = reservation;
    }

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(final ManagedObjectReference vm) {
        this.vm = vm;
    }

    public String getVnicKey() {
        return vnicKey;
    }

    public void setVnicKey(final String vnicKey) {
        this.vnicKey = vnicKey;
    }
}
