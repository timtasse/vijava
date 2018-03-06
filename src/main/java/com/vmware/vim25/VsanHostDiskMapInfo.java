package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanHostDiskMapInfo extends DynamicData {

    public VsanHostDiskMapping mapping;
    public boolean mounted;

    public VsanHostDiskMapping getMapping() {
        return mapping;
    }

    public void setMapping(final VsanHostDiskMapping mapping) {
        this.mapping = mapping;
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(final boolean mounted) {
        this.mounted = mounted;
    }
}
