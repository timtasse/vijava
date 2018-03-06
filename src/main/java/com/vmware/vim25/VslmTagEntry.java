package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VslmTagEntry extends DynamicData {

    public String parentCategoryName;
    public String tagName;

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(final String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(final String tagName) {
        this.tagName = tagName;
    }
}
