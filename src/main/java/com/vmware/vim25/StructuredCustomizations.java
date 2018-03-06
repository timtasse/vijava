package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class StructuredCustomizations extends HostProfilesEntityCustomizations {

    public AnswerFile customizations;
    public ManagedObjectReference entity;

    public AnswerFile getCustomizations() {
        return customizations;
    }

    public void setCustomizations(final AnswerFile customizations) {
        this.customizations = customizations;
    }

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(final ManagedObjectReference entity) {
        this.entity = entity;
    }
}
