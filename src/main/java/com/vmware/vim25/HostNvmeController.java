package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object represents an NVME controller.
 * Some terminology is borrowed from the NVM Express over Fabrics and the NVM Express 1.3 specifications,
 * which are available at the following address: https://nvmexpress.org/resources/specifications/
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeController extends DynamicData {

    private String key;
    private int controllerNumber;
    private String subnqn;
    private String name;
    private String associatedAdapter;
    private String transportType;
    private boolean fusedOperationSupported;
    private int numberOfQueues;
    private int queueSize;
    private HostNvmeNamespace[] attachedNamespace;
    private String vendorId;
    private String model;
    private String serialNumber;
    private String firmwareVersion;

    @Override
    public String toString() {
        return "HostNvmeController{" +
                "key='" + key + '\'' +
                ", controllerNumber=" + controllerNumber +
                ", subnqn='" + subnqn + '\'' +
                ", name='" + name + '\'' +
                ", associatedAdapter='" + associatedAdapter + '\'' +
                ", transportType='" + transportType + '\'' +
                ", fusedOperationSupported=" + fusedOperationSupported +
                ", numberOfQueues=" + numberOfQueues +
                ", queueSize=" + queueSize +
                ", attachedNamespace=" + Arrays.toString(attachedNamespace) +
                ", vendorId='" + vendorId + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public int getControllerNumber() {
        return controllerNumber;
    }

    public void setControllerNumber(final int controllerNumber) {
        this.controllerNumber = controllerNumber;
    }

    public String getSubnqn() {
        return subnqn;
    }

    public void setSubnqn(final String subnqn) {
        this.subnqn = subnqn;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAssociatedAdapter() {
        return associatedAdapter;
    }

    public void setAssociatedAdapter(final String associatedAdapter) {
        this.associatedAdapter = associatedAdapter;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(final String transportType) {
        this.transportType = transportType;
    }

    public boolean isFusedOperationSupported() {
        return fusedOperationSupported;
    }

    public void setFusedOperationSupported(final boolean fusedOperationSupported) {
        this.fusedOperationSupported = fusedOperationSupported;
    }

    public int getNumberOfQueues() {
        return numberOfQueues;
    }

    public void setNumberOfQueues(final int numberOfQueues) {
        this.numberOfQueues = numberOfQueues;
    }

    public int getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(final int queueSize) {
        this.queueSize = queueSize;
    }

    public HostNvmeNamespace[] getAttachedNamespace() {
        return attachedNamespace;
    }

    public void setAttachedNamespace(final HostNvmeNamespace[] attachedNamespace) {
        this.attachedNamespace = attachedNamespace;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(final String vendorId) {
        this.vendorId = vendorId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(final String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

}
