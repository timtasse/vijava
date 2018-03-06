package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestAliases extends DynamicData {

    public GuestAuthAliasInfo[] aliases;
    public String base64Cert;

    public GuestAuthAliasInfo[] getAliases() {
        return aliases;
    }

    public void setAliases(final GuestAuthAliasInfo[] aliases) {
        this.aliases = aliases;
    }

    public String getBase64Cert() {
        return base64Cert;
    }

    public void setBase64Cert(final String base64Cert) {
        this.base64Cert = base64Cert;
    }
}
