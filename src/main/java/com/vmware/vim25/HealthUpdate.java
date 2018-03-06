package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HealthUpdate extends DynamicData {

    public ManagedObjectReference entity;
    public String healthUpdateInfoId;
    public String id;
    public String remediation;
    public ManagedEntityStatus status;

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(final ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String getHealthUpdateInfoId() {
        return healthUpdateInfoId;
    }

    public void setHealthUpdateInfoId(final String healthUpdateInfoId) {
        this.healthUpdateInfoId = healthUpdateInfoId;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getRemediation() {
        return remediation;
    }

    public void setRemediation(final String remediation) {
        this.remediation = remediation;
    }

    public ManagedEntityStatus getStatus() {
        return status;
    }

    public void setStatus(final ManagedEntityStatus status) {
        this.status = status;
    }
}
