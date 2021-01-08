package com.vmware.vim25;

import java.util.Arrays;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 27.12.2020
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class AlarmFilterSpec extends DynamicData {

    private ManagedEntityStatus[] status;
    private String typeEntity;
    private String typeTrigger;

    @Override
    public String toString() {
        return "AlarmFilterSpec{" +
                "status=" + Arrays.toString(status) +
                ", typeEntity='" + typeEntity + '\'' +
                ", typeTrigger='" + typeTrigger + '\'' +
                "} " + super.toString();
    }

    public ManagedEntityStatus[] getStatus() {
        return status;
    }

    public void setStatus(final ManagedEntityStatus[] status) {
        this.status = status;
    }

    public String getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(final String typeEntity) {
        this.typeEntity = typeEntity;
    }

    public String getTypeTrigger() {
        return typeTrigger;
    }

    public void setTypeTrigger(final String typeTrigger) {
        this.typeTrigger = typeTrigger;
    }

}
