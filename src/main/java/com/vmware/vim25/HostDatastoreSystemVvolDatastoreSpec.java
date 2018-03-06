package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class HostDatastoreSystemVvolDatastoreSpec extends DynamicData {

    public String name;
    public String scId;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getScId() {
        return scId;
    }

    public void setScId(final String scId) {
        this.scId = scId;
    }
}
