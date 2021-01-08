package com.vmware.vim25;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Host sub specification data are the data used when create a virtual device, and/or configure the virtual device and its related host services.
 * A typical example of host sub specification data is the DVS host view specification,
 * which is used when create DVS host view on an ESXi host and configure the virtual switch on the host.
 * The introduction of this type of data is for improving the availability of the ESXi host management.
 * For example, when the VirtualCenter server is not available,
 * an ESXi host will have enough information to reconfigure DVS host view properly when the ESXi host is booted from stateless or stateless caching.
 * Host sub specification data are data for VMware internal data structure used in virtual device creation and configuration.
 * They are different to AnswerFile which are from public knowledge domain or the public API of VMware ESXi host services.
 * When the host sub specification data for a single feature are stored in multiple host sub specification data objects,
 * it is the responsibility of the host specification source in this feature to guarantee the completeness and consistency of these host sub specification objects.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.5
 */
public class HostSubSpecification extends DynamicData {

    private byte[] binaryData;
    private Calendar createdTime;
    private byte[] data;
    private String name;

    @Override
    public String toString() {
        return "HostSubSpecification{" +
                "binaryData=" + Arrays.toString(binaryData) +
                ", createdTime=" + createdTime +
                ", data=" + Arrays.toString(data) +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    public Calendar getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(final Calendar createdTime) {
        this.createdTime = createdTime;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(final byte[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public byte[] getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(final byte[] binaryData) {
        this.binaryData = binaryData;
    }

}
