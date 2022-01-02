package com.vmware.vim25;

import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostDateTimeSystemServiceTestResult extends DynamicData {

    private boolean workingNormally;
    private List<String> report;

    @Override
    public String toString() {
        return "HostDateTimeSystemServiceTestResult{" +
                "workingNormally=" + workingNormally +
                ", report=" + report +
                "} " + super.toString();
    }

    public boolean isWorkingNormally() {
        return workingNormally;
    }

    public void setWorkingNormally(final boolean workingNormally) {
        this.workingNormally = workingNormally;
    }

    public List<String> getReport() {
        return report;
    }

    public void setReport(final List<String> report) {
        this.report = report;
    }

}
