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
 * The managed object class corresponding to the one defined in VI SDK API reference.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.7.2
 */

public class HostLocalAccountManager extends ManagedObject {

    public HostLocalAccountManager(ServerConnection serverConnection, ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    @Deprecated(since = "5.1")
    public void assignUserToGroup(String user, String group) throws AlreadyExists, UserNotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", String.class, user),
                new Argument("group", String.class, user));
        this.getVimService().getWsc().invokeWithoutReturn("AssignUserToGroup", params);
    }

    public void changePassword(final String user, final String oldPassword, final String newPassword) throws InvalidArgument, InvalidLogin, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", String.class, user),
                new Argument("oldPassword", String.class, oldPassword),
                new Argument("newPassword", String.class, newPassword));
        this.getVimService().getWsc().invokeWithoutReturn("ChangePassword", params);
    }

    @Deprecated(since = "5.1")
    public void createGroup(HostAccountSpec group) throws AlreadyExists, InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("group", HostAccountSpec.class, group));
        this.getVimService().getWsc().invokeWithoutReturn("CreateGroup", params);
    }

    public void createUser(HostAccountSpec user) throws AlreadyExists, InvalidArgument, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", HostAccountSpec.class, user));
        this.getVimService().getWsc().invokeWithoutReturn("CreateUser", params);
    }

    @Deprecated(since = "5.1")
    public void removeGroup(String groupName) throws UserNotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("groupName", String.class, groupName));
        this.getVimService().getWsc().invokeWithoutReturn("RemoveGroup", params);
    }

    public void removeUser(String userName) throws UserNotFound, RuntimeFault, SecurityError, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("userName", String.class, userName));
        this.getVimService().getWsc().invokeWithoutReturn("RemoveUser", params);
    }

    @Deprecated(since = "5.1")
    public void unassignUserFromGroup(String user, String group) throws NoPermission, UserNotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", String.class, user),
                new Argument("group", String.class, group));
        this.getVimService().getWsc().invokeWithoutReturn("UnassignUserFromGroup", params);
    }

    public void updateUser(HostAccountSpec user) throws AlreadyExists, InvalidArgument, UserNotFound, RuntimeFault, RemoteException {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("user", HostAccountSpec.class, user));
        this.getVimService().getWsc().invokeWithoutReturn("UpdateUser", params);
    }

}
