package com.vmware.vim25;

import java.util.List;

/**
 * Configuration for System VMs deployment.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class ClusterSystemVMsConfigSpec extends DynamicData {

    private List<ClusterDatastoreUpdateSpec> allowedDatastores;
    private List<ClusterDatastoreUpdateSpec> notAllowedDatastores;
    private List<ClusterTagCategoryUpdateSpec> dsTagCategoriesToExclude;

    @Override
    public String toString() {
        return "ClusterSystemVMsConfigSpec{" +
                "allowedDatastores=" + allowedDatastores +
                ", notAllowedDatastores=" + notAllowedDatastores +
                ", dsTagCategoriesToExclude=" + dsTagCategoriesToExclude +
                "} " + super.toString();
    }

    public List<ClusterDatastoreUpdateSpec> getAllowedDatastores() {
        return allowedDatastores;
    }

    public void setAllowedDatastores(final List<ClusterDatastoreUpdateSpec> allowedDatastores) {
        this.allowedDatastores = allowedDatastores;
    }

    public List<ClusterDatastoreUpdateSpec> getNotAllowedDatastores() {
        return notAllowedDatastores;
    }

    public void setNotAllowedDatastores(final List<ClusterDatastoreUpdateSpec> notAllowedDatastores) {
        this.notAllowedDatastores = notAllowedDatastores;
    }

    public List<ClusterTagCategoryUpdateSpec> getDsTagCategoriesToExclude() {
        return dsTagCategoriesToExclude;
    }

    public void setDsTagCategoriesToExclude(final List<ClusterTagCategoryUpdateSpec> dsTagCategoriesToExclude) {
        this.dsTagCategoriesToExclude = dsTagCategoriesToExclude;
    }

}
