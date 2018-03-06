package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 22.05.18.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanPolicySatisfiability extends DynamicData {

    public VsanPolicyCost cost;
    public boolean isSatisfiable;
    public LocalizableMessage reason;
    public String uuid;

    public VsanPolicyCost getCost() {
        return cost;
    }

    public void setCost(final VsanPolicyCost cost) {
        this.cost = cost;
    }

    public boolean isSatisfiable() {
        return isSatisfiable;
    }

    public void setSatisfiable(final boolean satisfiable) {
        isSatisfiable = satisfiable;
    }

    public LocalizableMessage getReason() {
        return reason;
    }

    public void setReason(final LocalizableMessage reason) {
        this.reason = reason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }
}
