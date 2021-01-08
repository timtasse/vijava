package com.vmware.vim25;

import java.util.Arrays;

/**
 * Data object which represents relations between a property and its target value and the required values of any other properties in the vm configuration so that the target value can be set.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualMachinePropertyRelation extends DynamicData {

    private DynamicProperty key;
    private DynamicProperty[] relations;

    @Override
    public String toString() {
        return "VirtualMachinePropertyRelation{" +
                "key=" + key +
                ", relations=" + Arrays.toString(relations) +
                "} " + super.toString();
    }

    public DynamicProperty getKey() {
        return key;
    }

    public void setKey(final DynamicProperty key) {
        this.key = key;
    }

    public DynamicProperty[] getRelations() {
        return relations;
    }

    public void setRelations(final DynamicProperty[] relations) {
        this.relations = relations;
    }

}
