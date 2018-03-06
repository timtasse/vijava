package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class MemoryFileFormatNotSupportedByDatastore extends UnsupportedDatastore {

    public String datastoreName;
    public String type;

    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(final String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
