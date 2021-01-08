package com.vmware.vim25;

/**
 * This data object type describes MAC learning policy of a port.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class DVSMacLearningPolicy extends InheritablePolicy {

    private Boolean allowUnicastFlooding;
    private boolean enabled;
    private Integer limit;
    private String  limitPolicy;

    @Override
    public String toString() {
        return "DVSMacLearningPolicy{" +
                "allowUnicastFlooding=" + allowUnicastFlooding +
                ", enabled=" + enabled +
                ", limit=" + limit +
                ", limitPolicy='" + limitPolicy + '\'' +
                "} " + super.toString();
    }

    public Boolean getAllowUnicastFlooding() {
        return allowUnicastFlooding;
    }

    public void setAllowUnicastFlooding(final Boolean allowUnicastFlooding) {
        this.allowUnicastFlooding = allowUnicastFlooding;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public String getLimitPolicy() {
        return limitPolicy;
    }

    public void setLimitPolicy(final String limitPolicy) {
        this.limitPolicy = limitPolicy;
    }

}
