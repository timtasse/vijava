package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestAuthAliasInfo extends DynamicData {

    public String comment;
    public GuestAuthSubject subject;

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public GuestAuthSubject getSubject() {
        return subject;
    }

    public void setSubject(final GuestAuthSubject subject) {
        this.subject = subject;
    }
}
