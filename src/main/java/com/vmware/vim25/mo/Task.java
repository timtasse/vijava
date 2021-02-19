/*================================================================================
Copyright (c) 2008 VMware, Inc. All Rights Reserved.

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

package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * A task is used to monitor and potentially cancel long running operations.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
@SuppressWarnings("unused")
public class Task extends ExtensibleManagedObject {

    public static final String PROPNAME_INFO = "info";
    public static final String SUCCESS = "success";

    public Task(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public TaskInfo getTaskInfo() {
        return getCurrentProperty(PROPNAME_INFO, TaskInfo.class);
    }

    public ManagedEntity getAssociatedManagedEntity() {
        return (ManagedEntity) getManagedObject("info.entity");
    }

    public ManagedEntity[] getLockedManagedEntities() {
        return (ManagedEntity[]) getManagedObjects("info.locked");
    }

    public void cancelTask() throws InvalidState, RuntimeFault {
        try {
            this.getVimService().getWsc().invokeWithoutReturn("CancelTask", this.getSingleSelfArgumentList());
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setTaskDescription(final LocalizableMessage description) throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("description", LocalizableMessage.class, description));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetTaskDescription", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setTaskState(final TaskInfoState state, final Object result, final MethodFault fault)
            throws InvalidState, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("state", TaskInfoState.class, state),
                new Argument("result", Object.class, result),
                new Argument("fault", MethodFault.class, fault));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetTaskState", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateProgress(final int percentDone) throws InvalidState, OutOfBounds, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("percentDone", percentDone));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateProgress", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof OutOfBounds) {
                throw (OutOfBounds) cause;
            }
            if (cause instanceof InvalidState) {
                throw (InvalidState) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    /**
     * Copyright 2009 NetApp, contribution by Eric Forgette
     * <p>
     * This is a "drop-in" replacement for waitForMe() that uses a timed polling
     * in place of waitForValues.
     * <p>
     * This method will eat 3 exceptions while trying to get TaskInfo and TaskState.
     * On the fourth try, the captured exception is thrown.
     *
     * @return String based on TaskInfoState
     * @throws RuntimeFault
     * @throws RemoteException
     * @throws InterruptedException
     * @throws RuntimeException     if the third exception is not RuntimeFault or RemoteException
     * @author Eric Forgette (forgette@netapp.com)
     */
    public String waitForTask() throws RuntimeFault, RemoteException, InterruptedException {
        return waitForTask(500, 1000);
    }

    /**
     * Copyright 2009 NetApp, contribution by Eric Forgette
     * <p>
     * This is a replacement for waitForMe() that uses a timed polling
     * in place of waitForValues.  The delay between each poll is
     * configurable based on the last seen task state.  The method will sleep
     * for the number of milliseconds specified in runningDelayInMillSecond
     * while the task is in the running state.
     * The method will sleep for the number of milliseconds specified
     * in queuedDelayInMillSecond while the task is in the queued state.
     * <p>
     * This method will eat 3 exceptions while trying to get TaskInfo and TaskState.
     * On the fourth try, the captured exception is thrown.
     *
     * @param runningDelayInMillSecond - number of milliseconds to sleep between polls for a running task
     * @param queuedDelayInMillSecond  - number of milliseconds to sleep between polls for a queued task
     * @return String based on TaskInfoState
     * @throws RuntimeFault
     * @throws RemoteException
     * @throws InterruptedException
     * @throws RuntimeException     if the third exception is not RuntimeFault or RemoteException
     * @author Eric Forgette (forgette@netapp.com)
     */
    public String waitForTask(final int runningDelayInMillSecond, final int queuedDelayInMillSecond)
            throws RuntimeFault, RemoteException, InterruptedException {
        TaskInfoState tState = null;
        int tries;
        final int maxTries = 3;
        Exception getInfoException;

        while ((tState == null) || tState.equals(TaskInfoState.running) || tState.equals(TaskInfoState.queued)) {
            tState = null;
            getInfoException = null;
            tries = 0;
            // under load getTaskInfo may return null when there really is valid task info, so we try 3 times to get it.
            while (tState == null) {
                tries++;
                if (tries > maxTries) {
                    if (getInfoException == null) {
                        throw new NullPointerException();
                    } else if (getInfoException instanceof RuntimeFault) {
                        throw (RuntimeFault) getInfoException;
                    } else if (getInfoException instanceof RemoteException) {
                        throw (RemoteException) getInfoException;
                    } else {
                        throw new RuntimeException(getInfoException);
                    }
                }

                try {
                    tState = getTaskInfo().getState();
                } catch (final Exception e) {
                    //silently catch 3 exceptions
                    getInfoException = e;
                }
            }

            // sleep for a specified time based on task state.
            if (tState.equals(TaskInfoState.running)) {
                Thread.sleep(runningDelayInMillSecond);
            } else {
                Thread.sleep(queuedDelayInMillSecond);
            }
        }
        return tState.toString();
    }
}
