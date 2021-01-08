package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 27.12.2020
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public enum NvdimmRangeType {

    blockRange,
    controlRange,
    persistentRange,
    persistentVirtualCDRange,
    persistentVirtualDiskRange,
    volatileRange,
    volatileVirtualCDRange,
    volatileVirtualDiskRange;

}
