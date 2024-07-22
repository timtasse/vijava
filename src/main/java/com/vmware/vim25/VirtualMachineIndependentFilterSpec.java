package com.vmware.vim25;

import java.util.Arrays;
import java.util.List;

import static org.doublecloud.ws.util.TypeUtil.asNullSafeList;

/**
 * The IndependentFilterSpec data object is used to specify the independent filters to be associated with virtual machine disks.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.2.1
 */
@SuppressWarnings("unused")
public class VirtualMachineIndependentFilterSpec extends VirtualMachineBaseIndependentFilterSpec {

    private String filterName;
    private String filterClass;
    private KeyValue[] filterCapabilities;

    @Override
    public String toString() {
        return "VirtualMachineIndependentFilterSpec{" +
                "filterName='" + filterName + '\'' +
                ", filterClass='" + filterClass + '\'' +
                ", filterCapabilities=" + Arrays.toString(filterCapabilities) +
                "} " + super.toString();
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(final String filterName) {
        this.filterName = filterName;
    }

    public String getFilterClass() {
        return filterClass;
    }

    public void setFilterClass(final String filterClass) {
        this.filterClass = filterClass;
    }

    public List<KeyValue> getFilterCapabilities() {
        return asNullSafeList(filterCapabilities);
    }

    public void setFilterCapabilities(final List<KeyValue> filterCapabilities) {
        this.filterCapabilities = filterCapabilities.toArray(new KeyValue[0]);
    }

}
