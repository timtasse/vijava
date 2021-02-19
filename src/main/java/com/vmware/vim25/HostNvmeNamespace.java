package com.vmware.vim25;

/**
 * This data object represents an NVM Express Namespace.
 * In the NVME model, the underlying non-volatile storage medium is exposed via namespaces. For further information, see:
 *
 * "NVM Express over Fabrics 1.0", Section 1.5.2, "NVM Subsystem".
 * "NVM Express 1.3", section 6.1, "Namespaces".
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeNamespace extends DynamicData {

    private String key;
    private String name;
    private int id;
    private int blockSize;
    private long capacityInBlocks;

    @Override
    public String toString() {
        return "HostNvmeNamespace{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", blockSize=" + blockSize +
                ", capacityInBlocks=" + capacityInBlocks +
                "} " + super.toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(final int blockSize) {
        this.blockSize = blockSize;
    }

    public long getCapacityInBlocks() {
        return capacityInBlocks;
    }

    public void setCapacityInBlocks(final long capacityInBlocks) {
        this.capacityInBlocks = capacityInBlocks;
    }

}
