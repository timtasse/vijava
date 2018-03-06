package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestMappedAliases extends DynamicData {

    public String base64Cert;
    public GuestAuthSubject[] subjects;
    public String username;

    public String getBase64Cert() {
        return base64Cert;
    }

    public void setBase64Cert(final String base64Cert) {
        this.base64Cert = base64Cert;
    }

    public GuestAuthSubject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(final GuestAuthSubject[] subjects) {
        this.subjects = subjects;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }
}
