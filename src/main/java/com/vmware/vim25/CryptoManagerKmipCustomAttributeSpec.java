package com.vmware.vim25;

import java.util.List;

/**
 * Crypto key custom attribute spec
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.1
 */
@SuppressWarnings("unused")
public class CryptoManagerKmipCustomAttributeSpec extends DynamicData {

    private List<KeyValue> attributes;

    @Override
    public String toString() {
        return "CryptoManagerKmipCustomAttributeSpec{" +
                "attributes=" + attributes +
                '}';
    }

    public List<KeyValue> getAttributes() {
        return attributes;
    }

    public void setAttributes(final List<KeyValue> attributes) {
        this.attributes = attributes;
    }

}
