package com.vmware.vim25;

/**
 * An AttributeOverride provides a name-value pair that overrides for a particular instance node
 * a configurable Attribute defined by that device.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostAssignableHardwareConfigAttributeOverride extends DynamicData {

    private String instanceId;
    private String name;
    private Object value;

    @Override
    public String toString() {
        return "HostAssignableHardwareConfigAttributeOverride{" +
                "instanceId='" + instanceId + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                "} " + super.toString();
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(final String instanceId) {
        this.instanceId = instanceId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(final Object value) {
        this.value = value;
    }

}
