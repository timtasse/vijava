package com.vmware.vim25;

import java.util.Arrays;

/**
 * The ReplicationConfigSpec object type encapsulates the replication configuration parameters for a virtual machine.
 * It consists of two parts: 1) a set of virtual machine-wide replication properties; 2) a set of properties per replicated virtual disk.
 * ReplicationSetting is passed as an argument for initial replication configuration (@see vim.VirtualMachine.EnableReplication)
 * as well as for re-configuration of a replicated VM's properties (@see vim.VirtualMachine.ReconfigureReplication).
 * It is also returned to callers through a "get" interface (@see vim.VirtualMachine.ReplicationConfig).
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7
 * @since 6.0
 */
public class ReplicationConfigSpec extends DynamicData {

    private String destination;
    private ReplicationInfoDiskSettings[] disk;
    private String encryptionDestination;
    private Integer encryptionPort;
    private long generation;
    private Boolean netCompressionEnabled;
    private Boolean netEncryptionEnabled;
    private boolean oppUpdatesEnabled;
    private boolean paused;
    private int port;
    private boolean quiesceGuestEnabled;
    private String remoteCertificateThumbprint;
    private long rpo;
    private String vmReplicationId;

    @Override
    public String toString() {
        return "ReplicationConfigSpec{" +
                "destination='" + destination + '\'' +
                ", disk=" + Arrays.toString(disk) +
                ", encryptionDestination='" + encryptionDestination + '\'' +
                ", encryptionPort=" + encryptionPort +
                ", generation=" + generation +
                ", netCompressionEnabled=" + netCompressionEnabled +
                ", netEncryptionEnabled=" + netEncryptionEnabled +
                ", oppUpdatesEnabled=" + oppUpdatesEnabled +
                ", paused=" + paused +
                ", port=" + port +
                ", quiesceGuestEnabled=" + quiesceGuestEnabled +
                ", remoteCertificateThumbprint='" + remoteCertificateThumbprint + '\'' +
                ", rpo=" + rpo +
                ", vmReplicationId='" + vmReplicationId + '\'' +
                "} " + super.toString();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(final String destination) {
        this.destination = destination;
    }

    public ReplicationInfoDiskSettings[] getDisk() {
        return disk;
    }

    public void setDisk(final ReplicationInfoDiskSettings[] disk) {
        this.disk = disk;
    }

    public String getEncryptionDestination() {
        return encryptionDestination;
    }

    public void setEncryptionDestination(final String encryptionDestination) {
        this.encryptionDestination = encryptionDestination;
    }

    public Integer getEncryptionPort() {
        return encryptionPort;
    }

    public void setEncryptionPort(final Integer encryptionPort) {
        this.encryptionPort = encryptionPort;
    }

    public long getGeneration() {
        return generation;
    }

    public void setGeneration(final long generation) {
        this.generation = generation;
    }

    public Boolean getNetCompressionEnabled() {
        return netCompressionEnabled;
    }

    public void setNetCompressionEnabled(final Boolean netCompressionEnabled) {
        this.netCompressionEnabled = netCompressionEnabled;
    }

    public Boolean getNetEncryptionEnabled() {
        return netEncryptionEnabled;
    }

    public void setNetEncryptionEnabled(final Boolean netEncryptionEnabled) {
        this.netEncryptionEnabled = netEncryptionEnabled;
    }

    public boolean isOppUpdatesEnabled() {
        return oppUpdatesEnabled;
    }

    public void setOppUpdatesEnabled(final boolean oppUpdatesEnabled) {
        this.oppUpdatesEnabled = oppUpdatesEnabled;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(final boolean paused) {
        this.paused = paused;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public boolean isQuiesceGuestEnabled() {
        return quiesceGuestEnabled;
    }

    public void setQuiesceGuestEnabled(final boolean quiesceGuestEnabled) {
        this.quiesceGuestEnabled = quiesceGuestEnabled;
    }

    public String getRemoteCertificateThumbprint() {
        return remoteCertificateThumbprint;
    }

    public void setRemoteCertificateThumbprint(final String remoteCertificateThumbprint) {
        this.remoteCertificateThumbprint = remoteCertificateThumbprint;
    }

    public long getRpo() {
        return rpo;
    }

    public void setRpo(final long rpo) {
        this.rpo = rpo;
    }

    public String getVmReplicationId() {
        return vmReplicationId;
    }

    public void setVmReplicationId(final String vmReplicationId) {
        this.vmReplicationId = vmReplicationId;
    }

}
