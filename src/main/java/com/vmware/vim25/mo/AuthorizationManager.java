/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.
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
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.ws.Argument;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This managed object provides operations to query and update roles and permissions.
 * Privileges are the basic individual rights required to perform operations.
 * They are statically defined and never change for a single version of a product.
 * Examples of privileges are "Power on a virtual machine" or "Configure a host."
 *
 * Roles are aggregations of privileges, used for convenience.
 * For user-defined roles, the system-defined privileges, "System.Anonymous", "System.View", and "System.Read" are always present.
 *
 * Permissions are the actual access-control rules.
 * A permission is defined on a ManagedEntity and specifies the user or group ("principal") to which the rule applies.
 * The role specifies the privileges to apply,
 * and the propagate flag specifies whether or not the rule applies to sub-objects of the managed entity.
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
@SuppressWarnings("unused")
public class AuthorizationManager extends ManagedObject {

    public AuthorizationManager(final ServerConnection sc, final ManagedObjectReference mor) {
        super(sc, mor);
    }

    public AuthorizationDescription getDescription() {
        return getCurrentProperty("description", AuthorizationDescription.class);

    }

    public List<AuthorizationPrivilege> getPrivilegeList() {
        return Arrays.asList(getCurrentProperty("privilegeList", AuthorizationPrivilege[].class));

    }

    public List<AuthorizationRole> getRoleList() {
        return Arrays.asList(getCurrentProperty("roleList", AuthorizationRole[].class));

    }

    public int addAuthorizationRole(final String name, final List<String> privIds) throws InvalidName, AlreadyExists, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("name", String.class, name),
                new Argument("privIds", String[].class, privIds));
        try {
            return this.getVimService().getWsc().invoke("AddAuthorizationRole", params, Integer.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<UserPrivilegeResult> fetchUserPrivilegeOnEntities(final List<ManagedObjectReference> entities, final String userName)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entities", ManagedObjectReference[].class, entities),
                new Argument("userName", String.class, userName));
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("FetchUserPrivilegeOnEntities", params, UserPrivilegeResult.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }
    public List<Boolean> hasPrivilegeOnEntity(final ManagedEntity entity, final String sessionId, final List<String> privId)
            throws RuntimeFault {
        if (entity == null) {
            throw new IllegalArgumentException("entity cannot be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity.getMOR()),
                new Argument("sessionId", String.class, sessionId),
                new Argument("privIds", String[].class, privId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("HasPrivilegeOnEntity", params, Boolean.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<EntityPrivilege> hasPrivilegeOnEntities(final List<ManagedEntity> entity, final String sessionId, final List<String> privId)
            throws RuntimeFault {
        if (entity == null) {
            throw new IllegalArgumentException("entity cannot be null");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entities", ManagedObjectReference[].class, entity.stream().map(ManagedEntity::getMOR).collect(Collectors.toList())),
                new Argument("sessionId", String.class, sessionId),
                new Argument("privIds", String[].class, privId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("HasPrivilegeOnEntities", params, EntityPrivilege.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<EntityPrivilege> hasUserPrivilegeOnEntities(final List<ManagedObjectReference> entities,
                                                            final String userName,
                                                            final List<String> privId)
            throws RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entities", ManagedObjectReference[].class, entities),
                new Argument("userName", String.class, userName),
                new Argument("privIds", String[].class, privId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("HasUserPrivilegeOnEntities", params, EntityPrivilege.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void mergePermissions(final int srcRoleId, final int dstRoleId) throws AuthMinimumAdminPermission, NotFound, RuntimeFault {
        final List<Argument> parmas = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("srcRoleId", srcRoleId),
                Argument.fromBasicType("dstRoleId", dstRoleId));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("MergePermissions", parmas);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeAuthorizationRole(final int roleId, final boolean failIfUsed) throws RemoveFailed, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("roleId", roleId),
                Argument.fromBasicType("failIfUsed", failIfUsed));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveAuthorizationRole", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RemoveFailed) {
                throw (RemoveFailed) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void removeEntityPermission(final ManagedEntity entity, final String user, final boolean isGroup)
            throws AuthMinimumAdminPermission, NotFound, RuntimeFault {
        if (entity == null) {
            throw new IllegalArgumentException("entity must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity.getMOR()),
                new Argument("user", String.class, user),
                Argument.fromBasicType("isGroup", isGroup));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("RemoveEntityPermission", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void resetEntityPermissions(final ManagedEntity entity, final List<Permission> permission)
            throws AuthMinimumAdminPermission, NotFound, UserNotFound, RuntimeFault {
        if (entity == null) {
            throw new IllegalArgumentException("entity must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity.getMOR()),
                new Argument("permissions", Permission[].class, permission));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("ResetEntityPermissions", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof UserNotFound) {
                throw (UserNotFound) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<Permission> retrieveEntityPermissions(final ManagedEntity entity, final boolean inherited) throws RuntimeFault {
        if (entity == null) {
            throw new IllegalArgumentException("entity must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity.getMOR()),
                Argument.fromBasicType("inherited", inherited));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveEntityPermissions", params, Permission.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<Permission> retrieveAllPermissions() throws RuntimeFault {
        try {
            return this.getVimService().getWsc()
                    .invokeWithListReturn("RetrieveAllPermissions", this.getSingleSelfArgumentList(), Permission.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public List<Permission> retrieveRolePermissions(final int roleId) throws NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("roleId", roleId));
        try {
            return this.getVimService().getWsc().invokeWithListReturn("RetrieveRolePermissions", params, Permission.class);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void setEntityPermissions(final ManagedEntity entity, final List<Permission> permission)
            throws AuthMinimumAdminPermission, NotFound, UserNotFound, RuntimeFault {
        if (entity == null) {
            throw new IllegalArgumentException("entity must not be null.");
        }
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                new Argument("entity", ManagedObjectReference.class, entity.getMOR()),
                new Argument("permissions", Permission[].class, permission));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("SetEntityPermissions", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof UserNotFound) {
                throw (UserNotFound) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof AuthMinimumAdminPermission) {
                throw (AuthMinimumAdminPermission) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

    public void updateAuthorizationRole(final int roleId, final String newName, final List<String> privIds)
            throws InvalidName, AlreadyExists, NotFound, RuntimeFault {
        final List<Argument> params = Arrays.asList(this.getSelfArgument(),
                Argument.fromBasicType("roleId", roleId),
                new Argument("newName", String.class, newName),
                new Argument("privIds", String[].class, privIds));
        try {
            this.getVimService().getWsc().invokeWithoutReturn("UpdateAuthorizationRole", params);
        } catch (final RemoteException e) {
            final Throwable cause = e.getCause();
            if (cause instanceof AlreadyExists) {
                throw (AlreadyExists) cause;
            }
            if (cause instanceof NotFound) {
                throw (NotFound) cause;
            }
            if (cause instanceof InvalidName) {
                throw (InvalidName) cause;
            }
            if (cause instanceof RuntimeFault) {
                throw (RuntimeFault) cause;
            }
            throw new IllegalStateException(EXCEPTION_NOT_KNOWN, e);
        }
    }

}
