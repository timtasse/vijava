package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 31.03.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class IoFilterHostIssue extends DynamicData {

    public ManagedObjectReference host;
    public LocalizedMethodFault issue;

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public LocalizedMethodFault getIssue() {
        return issue;
    }

    public void setIssue(final LocalizedMethodFault issue) {
        this.issue = issue;
    }
}
