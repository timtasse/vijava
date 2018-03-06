package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 02.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class ReplicationConfigSpec extends DynamicData {

    public long generation;
    public String vmReplicationId;
    public String destination;
    public int port;
    public long rpo;
    public boolean quiesceGuestEnabled;
    public boolean paused;
    public boolean oppUpdatesEnabled;
    public Boolean netCompressionEnabled;
    public ReplicationInfoDiskSettings[] disk;

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

    public long getGeneration() {
        return generation;
    }

    public void setGeneration(final long generation) {
        this.generation = generation;
    }

    public boolean isNetCompressionEnabled() {
        return netCompressionEnabled;
    }

    public void setNetCompressionEnabled(final boolean netCompressionEnabled) {
        this.netCompressionEnabled = netCompressionEnabled;
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
