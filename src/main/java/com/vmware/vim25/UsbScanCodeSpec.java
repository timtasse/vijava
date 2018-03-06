package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class UsbScanCodeSpec extends DynamicData {

    public UsbScanCodeSpecKeyEvent[] keyEvents;

    public UsbScanCodeSpecKeyEvent[] getKeyEvents() {
        return keyEvents;
    }

    public void setKeyEvents(final UsbScanCodeSpecKeyEvent[] keyEvents) {
        this.keyEvents = keyEvents;
    }
}
