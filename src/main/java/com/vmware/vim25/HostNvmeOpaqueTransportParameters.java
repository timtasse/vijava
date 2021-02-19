package com.vmware.vim25;

import java.util.Arrays;

/**
 * This data object represents the raw transport specific parameters returned in a Discovery Log Page Entry,
 * when they cannot be interpreted as one of the known common types of parameters.
 * For details, see:
 *
 * "NVM Express over Fabrics 1.0", Section 5.3, Discovery Log Page
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0
 */
public class HostNvmeOpaqueTransportParameters extends HostNvmeTransportParameters {

    private String trtype;
    private String traddr;
    private String adrfam;
    private String trsvcid;
    private byte[] tsas;

    @Override
    public String toString() {
        return "HostNvmeOpaqueTransportParameters{" +
                "trtype='" + trtype + '\'' +
                ", traddr='" + traddr + '\'' +
                ", adrfam='" + adrfam + '\'' +
                ", trsvcid='" + trsvcid + '\'' +
                ", tsas=" + Arrays.toString(tsas) +
                "} " + super.toString();
    }

    public String getTrtype() {
        return trtype;
    }

    public void setTrtype(final String trtype) {
        this.trtype = trtype;
    }

    public String getTraddr() {
        return traddr;
    }

    public void setTraddr(final String traddr) {
        this.traddr = traddr;
    }

    public String getAdrfam() {
        return adrfam;
    }

    public void setAdrfam(final String adrfam) {
        this.adrfam = adrfam;
    }

    public String getTrsvcid() {
        return trsvcid;
    }

    public void setTrsvcid(final String trsvcid) {
        this.trsvcid = trsvcid;
    }

    public byte[] getTsas() {
        return tsas;
    }

    public void setTsas(final byte[] tsas) {
        this.tsas = tsas;
    }

}
