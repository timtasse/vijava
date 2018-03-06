package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class ClusterInfraUpdateHaConfigInfo extends DynamicData {

    public String behavior;
    public Boolean enabled;
    public String moderateRemediation;
    public String[] providers;
    public String severeRemediation;

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(final String behavior) {
        this.behavior = behavior;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public String getModerateRemediation() {
        return moderateRemediation;
    }

    public void setModerateRemediation(final String moderateRemediation) {
        this.moderateRemediation = moderateRemediation;
    }

    public String[] getProviders() {
        return providers;
    }

    public void setProviders(final String[] providers) {
        this.providers = providers;
    }

    public String getSevereRemediation() {
        return severeRemediation;
    }

    public void setSevereRemediation(final String severeRemediation) {
        this.severeRemediation = severeRemediation;
    }
}
