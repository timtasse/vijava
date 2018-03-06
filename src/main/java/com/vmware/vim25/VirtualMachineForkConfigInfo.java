package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VirtualMachineForkConfigInfo extends DynamicData {

    public String childForkGroupId;
    public String childType;
    public Boolean parentEnabled;
    public String parentForkGroupId;

    public String getChildForkGroupId() {
        return childForkGroupId;
    }

    public void setChildForkGroupId(final String childForkGroupId) {
        this.childForkGroupId = childForkGroupId;
    }

    public String getChildType() {
        return childType;
    }

    public void setChildType(final String childType) {
        this.childType = childType;
    }

    public Boolean isParentEnabled() {
        return parentEnabled;
    }

    public void setParentEnabled(final Boolean parentEnabled) {
        this.parentEnabled = parentEnabled;
    }

    public String getParentForkGroupId() {
        return parentForkGroupId;
    }

    public void setParentForkGroupId(final String parentForkGroupId) {
        this.parentForkGroupId = parentForkGroupId;
    }
}
