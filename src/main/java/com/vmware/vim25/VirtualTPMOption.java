package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object type contains the options for the virtual TPM class.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualTPMOption extends VirtualDeviceOption {

    private String[] supportedFirmware;

    @Override
    public String toString() {
        return "VirtualTPMOption{" +
                "supportedFirmware=" + Arrays.toString(supportedFirmware) +
                "} " + super.toString();
    }

    public String[] getSupportedFirmware() {
        return supportedFirmware;
    }

    public void setSupportedFirmware(final String[] supportedFirmware) {
        this.supportedFirmware = supportedFirmware;
    }

}
