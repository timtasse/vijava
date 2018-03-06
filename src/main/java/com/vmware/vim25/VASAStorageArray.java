package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VASAStorageArray extends DynamicData {

    public String modelId;
    public String name;
    public String uuid;
    public String vendorId;

    public String getModelId() {
        return modelId;
    }

    public void setModelId(final String modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(final String vendorId) {
        this.vendorId = vendorId;
    }
}
