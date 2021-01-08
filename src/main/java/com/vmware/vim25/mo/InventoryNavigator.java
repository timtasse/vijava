package com.vmware.vim25.mo;

import com.vmware.vim25.*;
import com.vmware.vim25.mo.util.MorUtil;
import com.vmware.vim25.mo.util.PropertyCollectorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Helper Class for using the PropertyCollector methods
 *
 * @author Steve JIN (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 */
public class InventoryNavigator {

    private final static Logger LOGGER = LoggerFactory.getLogger(InventoryNavigator.class);

    private final ManagedEntity rootEntity;
    private SelectionSpec[] selectionSpecs = null;

    public InventoryNavigator(ManagedEntity rootEntity) {
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
    public ManagedEntity[] searchManagedEntities(boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException {
        String[][] typeinfo = new String[][]{new String[]{"ManagedEntity",}};
        return searchManagedEntities(typeinfo, recurse);
    }

    /**
     * Get the first ManagedObjectReference from current node for the specified type
     */
    public ManagedEntity[] searchManagedEntities(String type) throws InvalidProperty, RuntimeFault, RemoteException {
        String[][] typeinfo = new String[][]{new String[]{type, "name",},};
        return searchManagedEntities(typeinfo, true);
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
    public ManagedEntity[] searchManagedEntities(String[][] typeinfo, boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException {
        ObjectContent[] ocs = retrieveObjectContents(typeinfo, recurse);
        return createManagedEntities(ocs);
    }

    private ObjectContent[] retrieveObjectContents(String[][] typeinfo, boolean recurse) throws InvalidProperty, RuntimeFault, RemoteException {
        if (typeinfo == null || typeinfo.length == 0) {
            return null;
        }

        PropertyCollector pc = rootEntity.getServerConnection().getServiceInstance().getPropertyCollector();

        if (recurse && selectionSpecs == null) {
            AboutInfo ai = rootEntity.getServerConnection().getServiceInstance().getAboutInfo();
            // changed API Version to check only the first number, more future ready
            if (Integer.parseInt(String.valueOf(ai.getApiVersion().charAt(0))) >= 4) {
                selectionSpecs = PropertyCollectorUtil.buildFullTraversalV4();
            } else {
                selectionSpecs = PropertyCollectorUtil.buildFullTraversal();
            }
        }

        PropertySpec[] propertySpecs = PropertyCollectorUtil.buildPropertySpecArray(typeinfo);

        ObjectSpec os = new ObjectSpec();
        os.setObj(rootEntity.getMOR());
        os.setSkip(Boolean.FALSE);
        os.setSelectSet(selectionSpecs);

        PropertyFilterSpec spec = new PropertyFilterSpec();
        spec.setObjectSet(new ObjectSpec[]{os});
        spec.setPropSet(propertySpecs);

//        return pc.retrieveProperties(new PropertyFilterSpec[]{spec});
        final RetrieveOptions retrieveOptions = new RetrieveOptions();
        retrieveOptions.setMaxObjects(1000);

        final List<ObjectContent> allObjects = new ArrayList<>(5000);
        RetrieveResult result = pc.retrievePropertiesEx(new PropertyFilterSpec[]{spec}, retrieveOptions);
        allObjects.addAll(Arrays.asList(result.getObjects()));
        while (result.getToken() != null) {
            //LOGGER.debug("Objectcount: {}", result.getObjects().length);
            result = pc.continueRetrievePropertiesEx(result.getToken());
            allObjects.addAll(Arrays.asList(result.getObjects()));
        }
        return allObjects.toArray(new ObjectContent[]{});
    }

    private ManagedEntity[] createManagedEntities(ObjectContent[] ocs) {
        if (ocs == null) {
            return new ManagedEntity[]{};
        }
        ManagedEntity[] mes = new ManagedEntity[ocs.length];

        for (int i = 0; i < mes.length; i++) {
            //if (i < 10) {
            //    LOGGER.debug(ocs[i].toString());
            //}
            ManagedObjectReference mor = ocs[i].getObj();
            mes[i] = MorUtil.createExactManagedEntity(rootEntity.getServerConnection(), mor, (String) ocs[i].getPropSet()[0].getVal());
        }
        return mes;
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
    public ManagedEntity searchManagedEntity(String type, String name) throws InvalidProperty, RuntimeFault, RemoteException {
        if (name == null || name.length() == 0) {
            return null;
        }

        if (type == null) {
            type = "ManagedEntity";
        }

        String[][] typeinfo = new String[][]{new String[]{type, "name",},};
        ObjectContent[] ocs = retrieveObjectContents(typeinfo, true);

        if (ocs == null || ocs.length == 0) {
            return null;
        }

        for (final ObjectContent oc : ocs) {
            DynamicProperty[] propSet = oc.getPropSet();

            if (propSet.length > 0) {
                String nameInPropSet = (String) propSet[0].getVal();
                if (name.equalsIgnoreCase(nameInPropSet)) {
                    ManagedObjectReference mor = oc.getObj();
                    return MorUtil.createExactManagedEntity(rootEntity.getServerConnection(), mor, nameInPropSet);
                }
            }
        }
        return null;
    }

}
