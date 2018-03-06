package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class UsbScanCodeSpecModifierType extends DynamicData {

    public Boolean leftAlt;
    public Boolean leftControl;
    public Boolean leftGui;
    public Boolean leftShift;
    public Boolean rightAlt;
    public Boolean rightControl;
    public Boolean rightGui;
    public Boolean rightShift;

    public Boolean isLeftAlt() {
        return leftAlt;
    }

    public void setLeftAlt(final Boolean leftAlt) {
        this.leftAlt = leftAlt;
    }

    public Boolean isLeftControl() {
        return leftControl;
    }

    public void setLeftControl(final Boolean leftControl) {
        this.leftControl = leftControl;
    }

    public Boolean isLeftGui() {
        return leftGui;
    }

    public void setLeftGui(final Boolean leftGui) {
        this.leftGui = leftGui;
    }

    public Boolean isLeftShift() {
        return leftShift;
    }

    public void setLeftShift(final Boolean leftShift) {
        this.leftShift = leftShift;
    }

    public Boolean isRightAlt() {
        return rightAlt;
    }

    public void setRightAlt(final Boolean rightAlt) {
        this.rightAlt = rightAlt;
    }

    public Boolean isRightControl() {
        return rightControl;
    }

    public void setRightControl(final Boolean rightControl) {
        this.rightControl = rightControl;
    }

    public Boolean isRightGui() {
        return rightGui;
    }

    public void setRightGui(final Boolean rightGui) {
        this.rightGui = rightGui;
    }

    public Boolean isRightShift() {
        return rightShift;
    }

    public void setRightShift(final Boolean rightShift) {
        this.rightShift = rightShift;
    }
}
