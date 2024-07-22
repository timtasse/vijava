package com.vmware.vim25.ws;

import java.util.Collections;
import java.util.List;

/**
 * Helper for the Type Information for the PropertySpecs
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
@SuppressWarnings("unused")
public class TypeInfo {

    private final String type;
    private final List<String> properties;

    private TypeInfo(final String type, final List<String> properties) {
        this.type = type;
        this.properties = Collections.unmodifiableList(properties);
    }

    public static TypeInfo create(final String type, final List<String> properties) {
        return new TypeInfo(type, properties);
    }

    public static TypeInfo create(final String type, final String property) {
        return new TypeInfo(type, List.of(property));
    }

    @Override
    public String toString() {
        return "TypeInfo{" +
                "type='" + type + '\'' +
                ", properties=" + properties +
                '}';
    }

    public String getType() {
        return type;
    }

    public List<String> getProperties() {
        return properties;
    }

}
