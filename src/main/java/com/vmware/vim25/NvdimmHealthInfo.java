package com.vmware.vim25;

import java.util.Arrays;

/**
 * brief NVDIMM health information
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.7
 */
public class NvdimmHealthInfo extends DynamicData {

    private int dimmLifespanPercentage;
    private int dimmTemperature;
    private int dimmTemperatureThreshold;
    private Integer esLifespanPercentage;
    private Integer esTemperature;
    private Integer esTemperatureThreshold;
    private String healthInformation;
    private String healthStatus;
    private int spareBlocksPercentage;
    private int spareBlockThreshold;
    private String[] stateFlagInfo;

    @Override
    public String toString() {
        return "NvdimmHealthInfo{" +
                "dimmLifespanPercentage=" + dimmLifespanPercentage +
                ", dimmTemperature=" + dimmTemperature +
                ", dimmTemperatureThreshold=" + dimmTemperatureThreshold +
                ", esLifespanPercentage=" + esLifespanPercentage +
                ", esTemperature=" + esTemperature +
                ", esTemperatureThreshold=" + esTemperatureThreshold +
                ", healthInformation='" + healthInformation + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                ", spareBlocksPercentage=" + spareBlocksPercentage +
                ", spareBlockThreshold=" + spareBlockThreshold +
                ", stateFlagInfo=" + Arrays.toString(stateFlagInfo) +
                "} " + super.toString();
    }

    public int getDimmLifespanPercentage() {
        return dimmLifespanPercentage;
    }

    public void setDimmLifespanPercentage(final int dimmLifespanPercentage) {
        this.dimmLifespanPercentage = dimmLifespanPercentage;
    }

    public int getDimmTemperature() {
        return dimmTemperature;
    }

    public void setDimmTemperature(final int dimmTemperature) {
        this.dimmTemperature = dimmTemperature;
    }

    public int getDimmTemperatureThreshold() {
        return dimmTemperatureThreshold;
    }

    public void setDimmTemperatureThreshold(final int dimmTemperatureThreshold) {
        this.dimmTemperatureThreshold = dimmTemperatureThreshold;
    }

    public Integer getEsLifespanPercentage() {
        return esLifespanPercentage;
    }

    public void setEsLifespanPercentage(final Integer esLifespanPercentage) {
        this.esLifespanPercentage = esLifespanPercentage;
    }

    public Integer getEsTemperature() {
        return esTemperature;
    }

    public void setEsTemperature(final Integer esTemperature) {
        this.esTemperature = esTemperature;
    }

    public Integer getEsTemperatureThreshold() {
        return esTemperatureThreshold;
    }

    public void setEsTemperatureThreshold(final Integer esTemperatureThreshold) {
        this.esTemperatureThreshold = esTemperatureThreshold;
    }

    public String getHealthInformation() {
        return healthInformation;
    }

    public void setHealthInformation(final String healthInformation) {
        this.healthInformation = healthInformation;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(final String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getSpareBlocksPercentage() {
        return spareBlocksPercentage;
    }

    public void setSpareBlocksPercentage(final int spareBlocksPercentage) {
        this.spareBlocksPercentage = spareBlocksPercentage;
    }

    public int getSpareBlockThreshold() {
        return spareBlockThreshold;
    }

    public void setSpareBlockThreshold(final int spareBlockThreshold) {
        this.spareBlockThreshold = spareBlockThreshold;
    }

    public String[] getStateFlagInfo() {
        return stateFlagInfo;
    }

    public void setStateFlagInfo(final String[] stateFlagInfo) {
        this.stateFlagInfo = stateFlagInfo;
    }

}
