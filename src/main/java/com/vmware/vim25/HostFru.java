package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.0
 */
@SuppressWarnings("unused")
public class HostFru extends DynamicData {

    private String type;
    private String partName;
    private String partNumber;
    private String manufacturer;
    private String serialNumber;
    private Calendar mfgTimeStamp;

    @Override
    public String toString() {
        return "HostFru{" +
                "type='" + type + '\'' +
                ", partName='" + partName + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", mfgTimeStamp=" + mfgTimeStamp +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(final String partName) {
        this.partName = partName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(final String partNumber) {
        this.partNumber = partNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Calendar getMfgTimeStamp() {
        return mfgTimeStamp;
    }

    public void setMfgTimeStamp(final Calendar mfgTimeStamp) {
        this.mfgTimeStamp = mfgTimeStamp;
    }

}
