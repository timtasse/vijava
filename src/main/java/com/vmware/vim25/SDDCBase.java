package com.vmware.vim25;

/**
 * An empty data object which can be used as the base class for data objects outside VIM namespace which have to be proxied through vCenter opaquely.
 * For example, vSan configuration spec will extend from this which will allow HCI API to pass the spec to set up vSan on the cluster.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class SDDCBase extends DynamicData {
}
