package com.vmware.vim25;

import java.util.List;

/**
 * Configuration for System VMs deployment.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class ClusterSystemVMsConfigInfo extends DynamicData {

    private List<ManagedObjectReference> allowedDatastores;
    private List<ManagedObjectReference> notAllowedDatastores;
    private List<String> dsTagCategoriesToExclude;

    @Override
    public String toString() {
        return "ClusterSystemVMsConfigInfo{" +
                "allowedDatastores=" + allowedDatastores +
                ", notAllowedDatastores=" + notAllowedDatastores +
                ", dsTagCategoriesToExclude=" + dsTagCategoriesToExclude +
                "} " + super.toString();
    }

    public List<ManagedObjectReference> getAllowedDatastores() {
        return allowedDatastores;
    }

    public void setAllowedDatastores(final List<ManagedObjectReference> allowedDatastores) {
        this.allowedDatastores = allowedDatastores;
    }

    public List<ManagedObjectReference> getNotAllowedDatastores() {
        return notAllowedDatastores;
    }

    public void setNotAllowedDatastores(final List<ManagedObjectReference> notAllowedDatastores) {
        this.notAllowedDatastores = notAllowedDatastores;
    }

    public List<String> getDsTagCategoriesToExclude() {
        return dsTagCategoriesToExclude;
    }

    public void setDsTagCategoriesToExclude(final List<String> dsTagCategoriesToExclude) {
        this.dsTagCategoriesToExclude = dsTagCategoriesToExclude;
    }

}
