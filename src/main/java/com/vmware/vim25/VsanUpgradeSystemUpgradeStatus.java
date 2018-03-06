package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 01.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.0
 */
public class VsanUpgradeSystemUpgradeStatus extends DynamicData {

    public Boolean aborted;
    public Boolean completed;
    public VsanUpgradeSystemUpgradeHistoryItem[] history;
    public Boolean inProgress;
    public Integer progress;

    public Boolean isAborted() {
        return aborted;
    }

    public void setAborted(final Boolean aborted) {
        this.aborted = aborted;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public void setCompleted(final Boolean completed) {
        this.completed = completed;
    }

    public VsanUpgradeSystemUpgradeHistoryItem[] getHistory() {
        return history;
    }

    public void setHistory(final VsanUpgradeSystemUpgradeHistoryItem[] history) {
        this.history = history;
    }

    public Boolean isInProgress() {
        return inProgress;
    }

    public void setInProgress(final Boolean inProgress) {
        this.inProgress = inProgress;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(final Integer progress) {
        this.progress = progress;
    }
}
