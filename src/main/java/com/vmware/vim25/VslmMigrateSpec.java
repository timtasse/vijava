package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VslmMigrateSpec extends DynamicData {

    public VslmCreateSpecBackingSpec backingSpec;
    public Boolean consolidate;

    public VslmCreateSpecBackingSpec getBackingSpec() {
        return backingSpec;
    }

    public void setBackingSpec(final VslmCreateSpecBackingSpec backingSpec) {
        this.backingSpec = backingSpec;
    }

    public Boolean isConsolidate() {
        return consolidate;
    }

    public void setConsolidate(final Boolean consolidate) {
        this.consolidate = consolidate;
    }
}
