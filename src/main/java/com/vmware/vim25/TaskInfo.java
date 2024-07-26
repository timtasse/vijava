/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

import java.util.Calendar;
import java.util.List;

/**
 * This data object type contains all information about a task. A task represents an operation performed by VirtualCenter or ESX
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 8.0.1
 */
@SuppressWarnings("unused")
public class TaskInfo extends DynamicData {

    private String key;
    private ManagedObjectReference task;
    private LocalizableMessage description;
    private String name;
    private String descriptionId;
    private ManagedObjectReference entity;
    private String entityName;
    private List<ManagedObjectReference> locked;
    private TaskInfoState state;
    private boolean cancelled;
    private boolean cancelable;
    private LocalizedMethodFault error;
    private Object result;
    private Integer progress;
    private List<KeyAnyValue> progressDetails;
    private TaskReason reason;
    private Calendar queueTime;
    private Calendar startTime;
    private Calendar completeTime;
    private int eventChainId;
    private String changeTag;
    private String parentTaskKey;
    private String rootTaskKey;
    private String activationId;

    @Override
    public String toString() {
        return "TaskInfo{" +
                "key='" + key + '\'' +
                ", task=" + task +
                ", description=" + description +
                ", name='" + name + '\'' +
                ", descriptionId='" + descriptionId + '\'' +
                ", entity=" + entity +
                ", entityName='" + entityName + '\'' +
                ", locked=" + locked +
                ", state=" + state +
                ", cancelled=" + cancelled +
                ", cancelable=" + cancelable +
                ", error=" + error +
                ", result=" + result +
                ", progress=" + progress +
                ", progressDetails=" + progressDetails +
                ", reason=" + reason +
                ", queueTime=" + queueTime +
                ", startTime=" + startTime +
                ", completeTime=" + completeTime +
                ", eventChainId=" + eventChainId +
                ", changeTag='" + changeTag + '\'' +
                ", parentTaskKey='" + parentTaskKey + '\'' +
                ", rootTaskKey='" + rootTaskKey + '\'' +
                ", activationId='" + activationId + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ManagedObjectReference getTask() {
        return task;
    }

    public void setTask(final ManagedObjectReference task) {
        this.task = task;
    }

    public LocalizableMessage getDescription() {
        return description;
    }

    public void setDescription(final LocalizableMessage description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(final String descriptionId) {
        this.descriptionId = descriptionId;
    }

    public ManagedObjectReference getEntity() {
        return entity;
    }

    public void setEntity(final ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(final String entityName) {
        this.entityName = entityName;
    }

    public List<ManagedObjectReference> getLocked() {
        return locked;
    }

    public void setLocked(final List<ManagedObjectReference> locked) {
        this.locked = locked;
    }

    public TaskInfoState getState() {
        return state;
    }

    public void setState(final TaskInfoState state) {
        this.state = state;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelable() {
        return cancelable;
    }

    public void setCancelable(final boolean cancelable) {
        this.cancelable = cancelable;
    }

    public LocalizedMethodFault getError() {
        return error;
    }

    public void setError(final LocalizedMethodFault error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(final Object result) {
        this.result = result;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(final Integer progress) {
        this.progress = progress;
    }

    public List<KeyAnyValue> getProgressDetails() {
        return progressDetails;
    }

    public void setProgressDetails(final List<KeyAnyValue> progressDetails) {
        this.progressDetails = progressDetails;
    }

    public TaskReason getReason() {
        return reason;
    }

    public void setReason(final TaskReason reason) {
        this.reason = reason;
    }

    public Calendar getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(final Calendar queueTime) {
        this.queueTime = queueTime;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(final Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(final Calendar completeTime) {
        this.completeTime = completeTime;
    }

    public int getEventChainId() {
        return eventChainId;
    }

    public void setEventChainId(final int eventChainId) {
        this.eventChainId = eventChainId;
    }

    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(final String changeTag) {
        this.changeTag = changeTag;
    }

    public String getParentTaskKey() {
        return parentTaskKey;
    }

    public void setParentTaskKey(final String parentTaskKey) {
        this.parentTaskKey = parentTaskKey;
    }

    public String getRootTaskKey() {
        return rootTaskKey;
    }

    public void setRootTaskKey(final String rootTaskKey) {
        this.rootTaskKey = rootTaskKey;
    }

    public String getActivationId() {
        return activationId;
    }

    public void setActivationId(final String activationId) {
        this.activationId = activationId;
    }

}
