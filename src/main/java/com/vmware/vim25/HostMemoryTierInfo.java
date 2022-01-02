package com.vmware.vim25;

import java.util.List;

/**
 * Information about a memory tier on this host.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostMemoryTierInfo extends DynamicData {

    private String name;
    private HostMemoryTierType type;
    private List<HostMemoryTierFlags> flags;
    private long size;

    @Override
    public String toString() {
        return "HostMemoryTierInfo{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", flags=" + flags +
                ", size=" + size +
                "} " + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(final long size) {
        this.size = size;
    }

    public HostMemoryTierType getType() {
        return type;
    }

    public void setType(final HostMemoryTierType type) {
        this.type = type;
    }

    public List<HostMemoryTierFlags> getFlags() {
        return flags;
    }

    public void setFlags(final List<HostMemoryTierFlags> flags) {
        this.flags = flags;
    }

}
