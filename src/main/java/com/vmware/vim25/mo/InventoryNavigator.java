package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.mo.util.PropertyCollectorUtil;
import com.vmware.vim25.ws.TypeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Helper Class for using the PropertyCollector methods
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public class InventoryNavigator {

    private final ManagedEntity rootEntity;
    private List<TraversalSpec> selectionSpecs = null;

    public InventoryNavigator(final ManagedEntity rootEntity) {
        this.rootEntity = rootEntity;
    }

    /**
     * Retrieve container contents from specified parent recursively if requested.
     *
     * @param recurse retrieve contents recursively from the root down
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws InvalidProperty
     */
    public List<ManagedEntity> searchManagedEntities(final boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException {
        return searchManagedEntities(List.of(TypeInfo.create("ManagedEntity", "name")), recurse);
    }

    /**
     * Get the first ManagedObjectReference from current node for the specified type
     */
    public List<ManagedEntity> searchManagedEntities(final String type) throws InvalidProperty, RuntimeFault, RemoteException {
        return searchManagedEntities(List.of(TypeInfo.create(type, "name")), true);
    }

    public <T extends ManagedEntity> List<T> searchManagedEntities(final Class<T> type) throws InvalidProperty, RuntimeFault, RemoteException {
        return searchManagedEntities(List.of(TypeInfo.create(type.getSimpleName(), "name")), true)
                .stream()
                .filter(m -> type.isAssignableFrom(m.getClass()))
                .map(type::cast)
                .collect(Collectors.toList());
    }

    /**
     * Retrieve content recursively with multiple properties.
     * the typeinfo array contains typename + properties to retrieve.
     *
     * @param typeinfo 2D array of properties for each typename
     * @param recurse  retrieve contents recursively from the root down
     * @return retrieved object contents
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws InvalidProperty
     */
    public List<ManagedEntity> searchManagedEntities(final List<TypeInfo> typeinfo, final boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException {
        final List<ObjectContent> ocs = retrieveObjectContents(typeinfo, recurse);
        return createManagedEntities(ocs);
    }

    private List<ObjectContent> retrieveObjectContents(final List<TypeInfo> typeinfo, final boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException {
        if (typeinfo == null || typeinfo.isEmpty()) {
            return List.of();
        }

        final PropertyCollector pc = rootEntity.getServerConnection().getServiceInstance().getPropertyCollector();

        if (recurse && selectionSpecs == null) {
            final AboutInfo ai = rootEntity.getServerConnection().getServiceInstance().getAboutInfo();
            // changed API Version to check only the first number, more future ready
            if (Integer.parseInt(ai.getApiVersion().split("\\.", 2)[0]) >= 4) {
                selectionSpecs = PropertyCollectorUtil.buildFullTraversalV4();
            } else {
                selectionSpecs = PropertyCollectorUtil.buildFullTraversal();
            }
        }

        final List<PropertySpec> propertySpecs = PropertyCollectorUtil.buildPropertySpecArray(typeinfo);

        final ObjectSpec os = ObjectSpec.create(rootEntity.getMOR(), Boolean.FALSE, selectionSpecs);

        final PropertyFilterSpec spec = PropertyFilterSpec.create(os, propertySpecs);

        final RetrieveOptions retrieveOptions = new RetrieveOptions();
        retrieveOptions.setMaxObjects(1000);

        final List<ObjectContent> allObjects = new ArrayList<>(5000);
        RetrieveResult result = pc.retrievePropertiesEx(List.of(spec), retrieveOptions);
        allObjects.addAll(result.getObjectList());
        while (result.getToken() != null) {
            result = pc.continueRetrievePropertiesEx(result.getToken());
            allObjects.addAll(result.getObjectList());
        }
        return allObjects;
    }

    private List<ManagedEntity> createManagedEntities(final List<ObjectContent> ocs) {
        if (ocs == null || ocs.isEmpty()) {
            return List.of();
        }
        return ocs.stream().map(o -> Map.entry(o.getObj(), o.tryGetName()))
                .map(e -> MorUtil.createExactManagedEntity(this.rootEntity.getServerConnection(), e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Get the ManagedObjectReference for an item under the
     * specified parent node that has the type and name specified.
     *
     * @param type type of the managed object
     * @param name name to match
     * @return First ManagedEntity object of the type / name pair found
     * @throws RemoteException
     * @throws RuntimeFault
     * @throws InvalidProperty
     */
    public ManagedEntity searchManagedEntity(final String type, final String name) throws InvalidProperty, RuntimeFault, RemoteException {
        if (name == null || name.isEmpty() || type == null || type.isEmpty()) {
            return null;
        }

        final List<ObjectContent> ocs = retrieveObjectContents(List.of(
                TypeInfo.create(type, "name")), true);

        if (ocs.isEmpty()) {
            return null;
        }

        for (final ObjectContent oc : ocs) {
            final String nameInPropSet = oc.tryGetName();

            if (nameInPropSet != null && !nameInPropSet.isEmpty() && name.equalsIgnoreCase(nameInPropSet)) {
                final ManagedObjectReference mor = oc.getObj();
                return MorUtil.createExactManagedEntity(rootEntity.getServerConnection(), mor, nameInPropSet);

            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public <T extends ManagedEntity> T searchManagedEntity(final Class<T> type, final String name) throws RemoteException {
        return (T) this.searchManagedEntity(type.getSimpleName(), name);
    }

}
