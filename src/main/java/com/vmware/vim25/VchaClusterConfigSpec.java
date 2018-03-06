package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class VchaClusterConfigSpec extends DynamicData {

    public String passiveIp;
    public String witnessIp;

    public String getPassiveIp() {
        return passiveIp;
    }

    public void setPassiveIp(final String passiveIp) {
        this.passiveIp = passiveIp;
    }

    public String getWitnessIp() {
        return witnessIp;
    }

    public void setWitnessIp(final String witnessIp) {
        this.witnessIp = witnessIp;
    }
}
