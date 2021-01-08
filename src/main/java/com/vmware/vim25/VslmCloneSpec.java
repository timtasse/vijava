package com.vmware.vim25;

import java.util.Arrays;

/**
 * Specification of cloning a virtual storage object.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.2
 * @since 6.5
 */
public class VslmCloneSpec extends VslmMigrateSpec {

    private Boolean keepAfterDeleteVm;
    private KeyValue[] metadata;
    private String name;

    @Override
    public String toString() {
        return "VslmCloneSpec{" +
                "keepAfterDeleteVm=" + keepAfterDeleteVm +
                ", metadata=" + Arrays.toString(metadata) +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    public void setKeepAfterDeleteVm(final Boolean keepAfterDeleteVm) {
        this.keepAfterDeleteVm = keepAfterDeleteVm;
    }

    public KeyValue[] getMetadata() {
        return metadata;
    }

    public void setMetadata(final KeyValue[] metadata) {
        this.metadata = metadata;
    }
}
