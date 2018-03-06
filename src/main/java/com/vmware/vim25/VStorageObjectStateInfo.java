package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VStorageObjectStateInfo extends DynamicData {

    public Boolean tentative;

    public Boolean isTentative() {
        return tentative;
    }

    public void setTentative(final Boolean tentative) {
        this.tentative = tentative;
    }
}
