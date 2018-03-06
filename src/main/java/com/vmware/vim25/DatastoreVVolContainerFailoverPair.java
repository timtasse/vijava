package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class DatastoreVVolContainerFailoverPair extends DynamicData {

    public String srcContainer;
    public String tgtContainer;
    public KeyValue[] vvolMapping;

    public String getSrcContainer() {
        return srcContainer;
    }

    public void setSrcContainer(final String srcContainer) {
        this.srcContainer = srcContainer;
    }

    public String getTgtContainer() {
        return tgtContainer;
    }

    public void setTgtContainer(final String tgtContainer) {
        this.tgtContainer = tgtContainer;
    }

    public KeyValue[] getVvolMapping() {
        return vvolMapping;
    }

    public void setVvolMapping(final KeyValue[] vvolMapping) {
        this.vvolMapping = vvolMapping;
    }
}
