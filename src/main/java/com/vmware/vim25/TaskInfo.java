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

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */

@SuppressWarnings("all")
public class TaskInfo extends DynamicData {

    public String key;
    public ManagedObjectReference task;
    public LocalizableMessage description;
    public String name;
    public String descriptionId;
    public ManagedObjectReference entity;
    public String entityName;
    public ManagedObjectReference[] locked;
    public TaskInfoState state;
    public boolean cancelled;
    public boolean cancelable;
    public LocalizedMethodFault error;
    public Object result;
    public Integer progress;
    public TaskReason reason;
    public Calendar queueTime;
    public Calendar startTime;
    public Calendar completeTime;
    public int eventChainId;
    public String changeTag;
    public String parentTaskKey;
    public String rootTaskKey;
    public String activationId;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ManagedObjectReference getTask() {
        return this.task;
    }

    public void setTask(ManagedObjectReference task) {
        this.task = task;
    }

    public LocalizableMessage getDescription() {
        return this.description;
    }

    public void setDescription(LocalizableMessage description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionId() {
        return this.descriptionId;
    }

    public void setDescriptionId(String descriptionId) {
        this.descriptionId = descriptionId;
    }

    public ManagedObjectReference getEntity() {
        return this.entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public ManagedObjectReference[] getLocked() {
        return this.locked;
    }

    public void setLocked(ManagedObjectReference[] locked) {
        this.locked = locked;
    }

    public TaskInfoState getState() {
        return this.state;
    }

    public void setState(TaskInfoState state) {
        this.state = state;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelable() {
        return this.cancelable;
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }

    public LocalizedMethodFault getError() {
        return this.error;
    }

    public void setError(LocalizedMethodFault error) {
        this.error = error;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public TaskReason getReason() {
        return this.reason;
    }

    public void setReason(TaskReason reason) {
        this.reason = reason;
    }

    public Calendar getQueueTime() {
        return this.queueTime;
    }

    public void setQueueTime(Calendar queueTime) {
        this.queueTime = queueTime;
    }

    public Calendar getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getCompleteTime() {
        return this.completeTime;
    }

    public void setCompleteTime(Calendar completeTime) {
        this.completeTime = completeTime;
    }

    public int getEventChainId() {
        return this.eventChainId;
    }

    public void setEventChainId(int eventChainId) {
        this.eventChainId = eventChainId;
    }

    public String getChangeTag() {
        return this.changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }

    public String getParentTaskKey() {
        return this.parentTaskKey;
    }

    public void setParentTaskKey(String parentTaskKey) {
        this.parentTaskKey = parentTaskKey;
    }

    public String getRootTaskKey() {
        return this.rootTaskKey;
    }

    public void setRootTaskKey(String rootTaskKey) {
        this.rootTaskKey = rootTaskKey;
    }

    public String getActivationId() {
        return activationId;
    }

    public void setActivationId(final String activationId) {
        this.activationId = activationId;
    }
}