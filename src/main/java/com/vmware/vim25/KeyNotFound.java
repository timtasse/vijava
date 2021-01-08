package com.vmware.vim25;

/**
 * An KeyNotFound fault is returned when the key does not exist among key value pairs.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.2
 */
public class KeyNotFound extends VimFault {

    private String key;

    @Override
    public String toString() {
        return "KeyNotFound{" +
                "key='" + key + '\'' +
                "} " + super.toString();
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

}
