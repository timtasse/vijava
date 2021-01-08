package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public class FolderFailedHostResult extends DynamicData {

    private LocalizableMessage context;
    private LocalizedMethodFault fault;
    private ManagedObjectReference host;
    private String hostName;

    @Override
    public String toString() {
        return "FolderFailedHostResult{" +
                "context=" + context +
                ", fault=" + fault +
                ", host=" + host +
                ", hostName='" + hostName + '\'' +
                "} " + super.toString();
    }

    public LocalizableMessage getContext() {
        return context;
    }

    public void setContext(final LocalizableMessage context) {
        this.context = context;
    }

    public LocalizedMethodFault getFault() {
        return fault;
    }

    public void setFault(final LocalizedMethodFault fault) {
        this.fault = fault;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }
}
