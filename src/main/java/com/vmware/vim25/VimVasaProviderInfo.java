package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VimVasaProviderInfo extends DynamicData {

    public VimVasaProviderStatePerArray[] arrayState;
    public VimVasaProvider provider;

    public VimVasaProviderStatePerArray[] getArrayState() {
        return arrayState;
    }

    public void setArrayState(final VimVasaProviderStatePerArray[] arrayState) {
        this.arrayState = arrayState;
    }

    public VimVasaProvider getProvider() {
        return provider;
    }

    public void setProvider(final VimVasaProvider provider) {
        this.provider = provider;
    }
}
