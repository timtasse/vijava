package com.vmware.vim25;

/**
 * Overall health state for a namespace
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public enum NvdimmNamespaceDetailsHealthStatus {

    interleaveBroken,
    labelInconsistent,
    labelMissing,
    missing,
    normal

}
