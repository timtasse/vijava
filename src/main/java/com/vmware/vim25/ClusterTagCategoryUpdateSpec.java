package com.vmware.vim25;

/**
 * An incremental update to a TagCategory list.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.3
 */
public class ClusterTagCategoryUpdateSpec extends ArrayUpdateSpec {

    private String category;

    @Override
    public String toString() {
        return "ClusterTagCategoryUpdateSpec{" +
                "category='" + category + '\'' +
                "} " + super.toString();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

}
