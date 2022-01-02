package com.vmware.vim25;

import java.util.List;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class DiagnosticManagerAuditRecordResult extends DynamicData {

    private List<String> records;
    private String nextToken;

    @Override
    public String toString() {
        return "DiagnosticManagerAuditRecordResult{" +
                "records=" + records +
                ", nextToken='" + nextToken + '\'' +
                "} " + super.toString();
    }

    public List<String> getRecords() {
        return records;
    }

    public void setRecords(final List<String> records) {
        this.records = records;
    }

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(final String nextToken) {
        this.nextToken = nextToken;
    }

}
