package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class NodeDeploymentSpec extends DynamicData {

    public ManagedObjectReference esxHost;
    public ManagedObjectReference datastore;
    public ManagedObjectReference publicNetworkPortGroup;
    public ManagedObjectReference clusterNetworkPortGroup;
    public ManagedObjectReference folder;
    public ManagedObjectReference resourcePool;
    public ServiceLocator managementVc;
    public String nodeName;
    public CustomizationIPSettings ipSettings;

    public ManagedObjectReference getClusterNetworkPortGroup() {
        return clusterNetworkPortGroup;
    }

    public void setClusterNetworkPortGroup(final ManagedObjectReference clusterNetworkPortGroup) {
        this.clusterNetworkPortGroup = clusterNetworkPortGroup;
    }

    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    public void setDatastore(final ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public ManagedObjectReference getEsxHost() {
        return esxHost;
    }

    public void setEsxHost(final ManagedObjectReference esxHost) {
        this.esxHost = esxHost;
    }

    public ManagedObjectReference getFolder() {
        return folder;
    }

    public void setFolder(final ManagedObjectReference folder) {
        this.folder = folder;
    }

    public CustomizationIPSettings getIpSettings() {
        return ipSettings;
    }

    public void setIpSettings(final CustomizationIPSettings ipSettings) {
        this.ipSettings = ipSettings;
    }

    public ServiceLocator getManagementVc() {
        return managementVc;
    }

    public void setManagementVc(final ServiceLocator managementVc) {
        this.managementVc = managementVc;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public ManagedObjectReference getPublicNetworkPortGroup() {
        return publicNetworkPortGroup;
    }

    public void setPublicNetworkPortGroup(final ManagedObjectReference publicNetworkPortGroup) {
        this.publicNetworkPortGroup = publicNetworkPortGroup;
    }

    public ManagedObjectReference getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(final ManagedObjectReference resourcePool) {
        this.resourcePool = resourcePool;
    }
}
