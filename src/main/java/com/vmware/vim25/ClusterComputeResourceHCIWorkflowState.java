package com.vmware.vim25;

/**
 * HCIWorkflowState identifies the state of the cluser from the perspective of HCI workflow.
 * The workflow begins with in_progress mode and can transition to 'done' or 'invalid', both of which are terminal states.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.7.1
 */
public enum ClusterComputeResourceHCIWorkflowState {

    done,
    in_progress,
    invalid

}
