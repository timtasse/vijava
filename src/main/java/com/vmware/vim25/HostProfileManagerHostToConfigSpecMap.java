package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class HostProfileManagerHostToConfigSpecMap extends DynamicData {

    public ManagedObjectReference host;
    public AnswerFileCreateSpec configSpec;

    public AnswerFileCreateSpec getConfigSpec() {
        return configSpec;
    }

    public void setConfigSpec(final AnswerFileCreateSpec configSpec) {
        this.configSpec = configSpec;
    }

    public ManagedObjectReference getHost() {
        return host;
    }

    public void setHost(final ManagedObjectReference host) {
        this.host = host;
    }
}
