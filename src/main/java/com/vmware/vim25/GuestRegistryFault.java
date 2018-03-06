package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class GuestRegistryFault extends GuestOperationsFault {

    public long windowsSystemErrorCode;

    public long getWindowsSystemErrorCode() {
        return windowsSystemErrorCode;
    }

    public void setWindowsSystemErrorCode(final long windowsSystemErrorCode) {
        this.windowsSystemErrorCode = windowsSystemErrorCode;
    }
}
