package com.vmware.vim25;

/**
 * VirtualNVDIMMControllerOption is the data object that contains the options for a virtual NVDIMM controller.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class VirtualNVDIMMControllerOption extends VirtualControllerOption {

    private IntOption numNVDIMMControllers;

    @Override
    public String toString() {
        return "VirtualNVDIMMControllerOption{" +
                "numNVDIMMControllers=" + numNVDIMMControllers +
                "} " + super.toString();
    }

    public IntOption getNumNVDIMMControllers() {
        return numNVDIMMControllers;
    }

    public void setNumNVDIMMControllers(final IntOption numNVDIMMControllers) {
        this.numNVDIMMControllers = numNVDIMMControllers;
    }

}
