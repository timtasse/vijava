package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegKeyNameSpec extends DynamicData {

    public String registryPath;
    public String wowBitness;

    public String getRegistryPath() {
        return registryPath;
    }

    public void setRegistryPath(final String registryPath) {
        this.registryPath = registryPath;
    }

    public String getWowBitness() {
        return wowBitness;
    }

    public void setWowBitness(final String wowBitness) {
        this.wowBitness = wowBitness;
    }
}
