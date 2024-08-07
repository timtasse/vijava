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

import java.util.List;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.5
 */
@SuppressWarnings("unused")
public class EventFilterSpec extends DynamicData {

    public EventFilterSpecByEntity entity;
    public EventFilterSpecByTime time;
    public EventFilterSpecByUsername userName;
    public Integer eventChainId;
    public ManagedObjectReference alarm;
    public ManagedObjectReference scheduledTask;
    public Boolean disableFullMessage;
    public List<String> category;
    @Deprecated
    public List<String> type;
    public List<String> tag;
    public List<String> eventTypeId;
    public Integer maxCount;

    public EventFilterSpecByEntity getEntity() {
        return this.entity;
    }

    public void setEntity(final EventFilterSpecByEntity entity) {
        this.entity = entity;
    }

    public EventFilterSpecByTime getTime() {
        return this.time;
    }

    public void setTime(final EventFilterSpecByTime time) {
        this.time = time;
    }

    public EventFilterSpecByUsername getUserName() {
        return this.userName;
    }

    public void setUserName(final EventFilterSpecByUsername userName) {
        this.userName = userName;
    }

    public int getEventChainId() {
        return this.eventChainId;
    }

    public void setEventChainId(final int eventChainId) {
        this.eventChainId = eventChainId;
    }

    public ManagedObjectReference getAlarm() {
        return this.alarm;
    }

    public void setAlarm(final ManagedObjectReference alarm) {
        this.alarm = alarm;
    }

    public ManagedObjectReference getScheduledTask() {
        return this.scheduledTask;
    }

    public void setScheduledTask(final ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    public List<String> getCategory() {
        return this.category;
    }

    public void setCategory(final List<String> category) {
        this.category = category;
    }

    @Deprecated
    public List<String> getType() {
        return this.type;
    }

    @Deprecated
    public void setType(final List<String> type) {
        this.type = type;
    }

    public List<String> getTag() {
        return this.tag;
    }

    public void setTag(final List<String> tag) {
        this.tag = tag;
    }

    public List<String> getEventTypeId() {
        return this.eventTypeId;
    }

    public void setEventTypeId(final List<String> eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public boolean isDisableFullMessage() {
        return disableFullMessage;
    }

    public void setDisableFullMessage(final boolean disableFullMessage) {
        this.disableFullMessage = disableFullMessage;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(final int maxCount) {
        this.maxCount = maxCount;
    }

}
