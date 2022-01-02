package com.vmware.vim25;

/**
 * This data object describes a qualified name of the host used to identify it in a particular context.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class HostQualifiedName extends DynamicData {

    private String value;
    private HostQualifiedNameType type;

    @Override
    public String toString() {
        return "HostQualifiedName{" +
                "value='" + value + '\'' +
                ", type=" + type +
                "} " + super.toString();
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public HostQualifiedNameType getType() {
        return type;
    }

    public void setType(final HostQualifiedNameType type) {
        this.type = type;
    }

}
