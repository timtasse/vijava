package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class UsbScanCodeSpecKeyEvent extends DynamicData {

    public UsbScanCodeSpecModifierType modifiers;
    public int usbHidCode;

    public UsbScanCodeSpecModifierType getModifiers() {
        return modifiers;
    }

    public void setModifiers(final UsbScanCodeSpecModifierType modifiers) {
        this.modifiers = modifiers;
    }

    public int getUsbHidCode() {
        return usbHidCode;
    }

    public void setUsbHidCode(final int usbHidCode) {
        this.usbHidCode = usbHidCode;
    }
}
