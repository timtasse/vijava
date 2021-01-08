package com.vmware.vim25;

import java.util.Arrays;

/**
 * The data object that contains the objects needed to remediate a host in host profile batch apply.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ApplyHostProfileConfigurationSpec extends ProfileExecuteResult {

    private ManagedObjectReference host;
    private String[] taskListRequirement;
    private LocalizableMessage[] taskDescription;
    private Boolean rebootStateless;
    private Boolean rebootHost;
    private LocalizedMethodFault faultData;

    @Override
    public String toString() {
        return "ApplyHostProfileConfigurationSpec{" +
                "host=" + host +
                ", taskListRequirement=" + Arrays.toString(taskListRequirement) +
                ", taskDescription=" + Arrays.toString(taskDescription) +
                ", rebootStateless=" + rebootStateless +
                ", rebootHost=" + rebootHost +
                ", faultData=" + faultData +
                "} " + super.toString();
    }

    public LocalizedMethodFault getFaultData() {
        return faultData;
    }

    public void setFaultData(final LocalizedMethodFault faultData) {
        this.faultData = faultData;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }

    public Boolean isRebootHost() {
        return rebootHost;
    }

    public void setRebootHost(final Boolean rebootHost) {
        this.rebootHost = rebootHost;
    }

    public Boolean isRebootStateless() {
        return rebootStateless;
    }

    public void setRebootStateless(final Boolean rebootStateless) {
        this.rebootStateless = rebootStateless;
    }

    public LocalizableMessage[] getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(final LocalizableMessage[] taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String[] getTaskListRequirement() {
        return taskListRequirement;
    }

    public void setTaskListRequirement(final String[] taskListRequirement) {
        this.taskListRequirement = taskListRequirement;
    }
}
