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

package com.vmware.vim25.ws;

import com.vmware.vim25.*;

import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 5.1
 */
public class VimStub {

    private final WSClient wsc;

    public VimStub(final URL url, final boolean ignoreCert, final int connectTimeout, final int socketTimeout) {
        this.wsc = WSClientFactory.getClient(url, ignoreCert, connectTimeout, socketTimeout);
    }

    public VimStub(final WSClient wsc) {
        this.wsc = wsc;
    }

    public WSClient getWsc() {
        return wsc;
    }

    public void destroyPropertyFilter(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DestroyPropertyFilter", paras, null);
    }

    public CustomFieldDef addCustomFieldDef(final ManagedObjectReference _this, final String name, final String moType, final PrivilegePolicyDef fieldDefPolicy, final PrivilegePolicyDef fieldPolicy) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("moType", "String", moType);
        paras[3] = new Argument("fieldDefPolicy", "PrivilegePolicyDef", fieldDefPolicy);
        paras[4] = new Argument("fieldPolicy", "PrivilegePolicyDef", fieldPolicy);
        return (CustomFieldDef) wsc.invoke("AddCustomFieldDef", paras, "CustomFieldDef");
    }

    public void removeCustomFieldDef(final ManagedObjectReference _this, final int key) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "int", key);
        wsc.invoke("RemoveCustomFieldDef", paras, null);
    }

    public void renameCustomFieldDef(final ManagedObjectReference _this, final int key, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "int", key);
        paras[2] = new Argument("name", "String", name);
        wsc.invoke("RenameCustomFieldDef", paras, null);
    }

    public void setField(final ManagedObjectReference _this, final ManagedObjectReference entity, final int key, final String value) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        paras[2] = new Argument("key", "int", key);
        paras[3] = new Argument("value", "String", value);
        wsc.invoke("SetField", paras, null);
    }

    public boolean doesCustomizationSpecExist(final ManagedObjectReference _this, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        return (Boolean) wsc.invoke("DoesCustomizationSpecExist", paras, "boolean");
    }

    public CustomizationSpecItem getCustomizationSpec(final ManagedObjectReference _this, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        return (CustomizationSpecItem) wsc.invoke("GetCustomizationSpec", paras, "CustomizationSpecItem");
    }

    public void createCustomizationSpec(final ManagedObjectReference _this, final CustomizationSpecItem item) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("item", "CustomizationSpecItem", item);
        wsc.invoke("CreateCustomizationSpec", paras, null);
    }

    public void overwriteCustomizationSpec(final ManagedObjectReference _this, final CustomizationSpecItem item) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("item", "CustomizationSpecItem", item);
        wsc.invoke("OverwriteCustomizationSpec", paras, null);
    }

    public void deleteCustomizationSpec(final ManagedObjectReference _this, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        wsc.invoke("DeleteCustomizationSpec", paras, null);
    }

    public void duplicateCustomizationSpec(final ManagedObjectReference _this, final String name, final String newName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("newName", "String", newName);
        wsc.invoke("DuplicateCustomizationSpec", paras, null);
    }

    public void renameCustomizationSpec(final ManagedObjectReference _this, final String name, final String newName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("newName", "String", newName);
        wsc.invoke("RenameCustomizationSpec", paras, null);
    }

    public String customizationSpecItemToXml(final ManagedObjectReference _this, final CustomizationSpecItem item) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("item", "CustomizationSpecItem", item);
        return (String) wsc.invoke("CustomizationSpecItemToXml", paras, "String");
    }

    public CustomizationSpecItem xmlToCustomizationSpecItem(final ManagedObjectReference _this, final String specItemXml) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("specItemXml", "String", specItemXml);
        return (CustomizationSpecItem) wsc.invoke("XmlToCustomizationSpecItem", paras, "CustomizationSpecItem");
    }

    public void checkCustomizationResources(final ManagedObjectReference _this, final String guestOs) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("guestOs", "String", guestOs);
        wsc.invoke("CheckCustomizationResources", paras, null);
    }

    public VirtualMachineConfigOptionDescriptor[] queryConfigOptionDescriptor(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (VirtualMachineConfigOptionDescriptor[]) wsc.invoke("QueryConfigOptionDescriptor", paras, "VirtualMachineConfigOptionDescriptor[]");
    }

    public VirtualMachineConfigOption queryConfigOption(final ManagedObjectReference _this, final String key, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "String", key);
        paras[2] = new Argument("host", "ManagedObjectReference", host);
        return (VirtualMachineConfigOption) wsc.invoke("QueryConfigOption", paras, "VirtualMachineConfigOption");
    }

    public ConfigTarget queryConfigTarget(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (ConfigTarget) wsc.invoke("QueryConfigTarget", paras, "ConfigTarget");
    }

    public HostCapability queryTargetCapabilities(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (HostCapability) wsc.invoke("QueryTargetCapabilities", paras, "HostCapability");
    }

    public void unregisterExtension(final ManagedObjectReference _this, final String extensionKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        wsc.invoke("UnregisterExtension", paras, null);
    }

    public Extension findExtension(final ManagedObjectReference _this, final String extensionKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        return (Extension) wsc.invoke("FindExtension", paras, "Extension");
    }

    public void registerExtension(final ManagedObjectReference _this, final Extension extension) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extension", "Extension", extension);
        wsc.invoke("RegisterExtension", paras, null);
    }

    public void updateExtension(final ManagedObjectReference _this, final Extension extension) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extension", "Extension", extension);
        wsc.invoke("UpdateExtension", paras, null);
    }

    public void setPublicKey(final ManagedObjectReference _this, final String extensionKey, final String publicKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        paras[2] = new Argument("publicKey", "String", publicKey);
        wsc.invoke("SetPublicKey", paras, null);
    }

    public void setExtensionCertificate(final ManagedObjectReference _this, final String extensionKey, final String certificatePem) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        paras[2] = new Argument("certificatePem", "String", certificatePem);
        wsc.invoke("SetExtensionCertificate", paras, null);
    }

    public ManagedObjectReference[] queryManagedBy(final ManagedObjectReference _this, final String extensionKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        return (ManagedObjectReference[]) wsc.invoke("QueryManagedBy", paras, "ManagedObjectReference[]");
    }

    public ExtensionManagerIpAllocationUsage[] queryExtensionIpAllocationUsage(final ManagedObjectReference _this, final String[] extensionKeys) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKeys", "String[]", extensionKeys);
        return (ExtensionManagerIpAllocationUsage[]) wsc.invoke("QueryExtensionIpAllocationUsage", paras, "ExtensionManagerIpAllocationUsage[]");
    }

    public ManagedObjectReference moveDatastoreFile_Task(final ManagedObjectReference _this, final String sourceName, final ManagedObjectReference sourceDatacenter, final String destinationName, final ManagedObjectReference destinationDatacenter, final Boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("sourceName", "String", sourceName);
        paras[2] = new Argument("sourceDatacenter", "ManagedObjectReference", sourceDatacenter);
        paras[3] = new Argument("destinationName", "String", destinationName);
        paras[4] = new Argument("destinationDatacenter", "ManagedObjectReference", destinationDatacenter);
        paras[5] = new Argument("force", "Boolean", force);
        return (ManagedObjectReference) wsc.invoke("MoveDatastoreFile_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference copyDatastoreFile_Task(final ManagedObjectReference _this, final String sourceName, final ManagedObjectReference sourceDatacenter, final String destinationName, final ManagedObjectReference destinationDatacenter, final Boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("sourceName", "String", sourceName);
        paras[2] = new Argument("sourceDatacenter", "ManagedObjectReference", sourceDatacenter);
        paras[3] = new Argument("destinationName", "String", destinationName);
        paras[4] = new Argument("destinationDatacenter", "ManagedObjectReference", destinationDatacenter);
        paras[5] = new Argument("force", "Boolean", force);
        return (ManagedObjectReference) wsc.invoke("CopyDatastoreFile_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference deleteDatastoreFile_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (ManagedObjectReference) wsc.invoke("DeleteDatastoreFile_Task", paras, "ManagedObjectReference");
    }

    public void makeDirectory(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter, final Boolean createParentDirectories) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[3] = new Argument("createParentDirectories", "Boolean", createParentDirectories);
        wsc.invoke("MakeDirectory", paras, null);
    }

    public void changeOwner(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter, final String owner) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[3] = new Argument("owner", "String", owner);
        wsc.invoke("ChangeOwner", paras, null);
    }

    public void setCollectorPageSize(final ManagedObjectReference _this, final int maxCount) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("maxCount", "int", maxCount);
        wsc.invoke("SetCollectorPageSize", paras, null);
    }

    public void rewindCollector(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("RewindCollector", paras, null);
    }

    public void resetCollector(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("ResetCollector", paras, null);
    }

    public void destroyCollector(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DestroyCollector", paras, null);
    }

    public HttpNfcLeaseManifestEntry[] httpNfcLeaseGetManifest(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (HttpNfcLeaseManifestEntry[]) wsc.invoke("HttpNfcLeaseGetManifest", paras, "HttpNfcLeaseManifestEntry[]");
    }

    public void httpNfcLeaseComplete(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("HttpNfcLeaseComplete", paras, null);
    }

    public void httpNfcLeaseAbort(final ManagedObjectReference _this, final LocalizedMethodFault fault) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("fault", "LocalizedMethodFault", fault);
        wsc.invoke("HttpNfcLeaseAbort", paras, null);
    }

    public void httpNfcLeaseProgress(final ManagedObjectReference _this, final int percent) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("percent", "int", percent);
        wsc.invoke("HttpNfcLeaseProgress", paras, null);
    }

    public IpPool[] queryIpPools(final ManagedObjectReference _this, final ManagedObjectReference dc) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        return (IpPool[]) wsc.invoke("QueryIpPools", paras, "IpPool[]");
    }

    public int createIpPool(final ManagedObjectReference _this, final ManagedObjectReference dc, final IpPool pool) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("pool", "IpPool", pool);
        return (Integer) wsc.invoke("CreateIpPool", paras, "int");
    }

    public void updateIpPool(final ManagedObjectReference _this, final ManagedObjectReference dc, final IpPool pool) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("pool", "IpPool", pool);
        wsc.invoke("UpdateIpPool", paras, null);
    }

    public void destroyIpPool(final ManagedObjectReference _this, final ManagedObjectReference dc, final int id, final boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("id", "int", id);
        paras[3] = new Argument("force", "boolean", force);
        wsc.invoke("DestroyIpPool", paras, null);
    }

    public String allocateIpv4Address(final ManagedObjectReference _this, final ManagedObjectReference dc, final int poolId, final String allocationId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("poolId", "int", poolId);
        paras[3] = new Argument("allocationId", "String", allocationId);
        return (String) wsc.invoke("AllocateIpv4Address", paras, "String");
    }

    public String allocateIpv6Address(final ManagedObjectReference _this, final ManagedObjectReference dc, final int poolId, final String allocationId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("poolId", "int", poolId);
        paras[3] = new Argument("allocationId", "String", allocationId);
        return (String) wsc.invoke("AllocateIpv6Address", paras, "String");
    }

    public void releaseIpAllocation(final ManagedObjectReference _this, final ManagedObjectReference dc, final int poolId, final String allocationId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("poolId", "int", poolId);
        paras[3] = new Argument("allocationId", "String", allocationId);
        wsc.invoke("ReleaseIpAllocation", paras, null);
    }

    public IpPoolManagerIpAllocation[] queryIPAllocations(final ManagedObjectReference _this, final ManagedObjectReference dc, final int poolId, final String extensionKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dc", "ManagedObjectReference", dc);
        paras[2] = new Argument("poolId", "int", poolId);
        paras[3] = new Argument("extensionKey", "String", extensionKey);
        return (IpPoolManagerIpAllocation[]) wsc.invoke("QueryIPAllocations", paras, "IpPoolManagerIpAllocation[]");
    }

    public LicenseManagerLicenseInfo updateAssignedLicense(final ManagedObjectReference _this, final String entity, final String licenseKey, final String entityDisplayName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "String", entity);
        paras[2] = new Argument("licenseKey", "String", licenseKey);
        paras[3] = new Argument("entityDisplayName", "String", entityDisplayName);
        return (LicenseManagerLicenseInfo) wsc.invoke("UpdateAssignedLicense", paras, "LicenseManagerLicenseInfo");
    }

    public void removeAssignedLicense(final ManagedObjectReference _this, final String entityId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entityId", "String", entityId);
        wsc.invoke("RemoveAssignedLicense", paras, null);
    }

    public LicenseAssignmentManagerLicenseAssignment[] queryAssignedLicenses(final ManagedObjectReference _this, final String entityId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entityId", "String", entityId);
        return (LicenseAssignmentManagerLicenseAssignment[]) wsc.invoke("QueryAssignedLicenses", paras, "LicenseAssignmentManagerLicenseAssignment[]");
    }

    public LicenseFeatureInfo[] querySupportedFeatures(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (LicenseFeatureInfo[]) wsc.invoke("QuerySupportedFeatures", paras, "LicenseFeatureInfo[]");
    }

    public LicenseAvailabilityInfo[] queryLicenseSourceAvailability(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (LicenseAvailabilityInfo[]) wsc.invoke("QueryLicenseSourceAvailability", paras, "LicenseAvailabilityInfo[]");
    }

    public LicenseUsageInfo queryLicenseUsage(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (LicenseUsageInfo) wsc.invoke("QueryLicenseUsage", paras, "LicenseUsageInfo");
    }

    public void setLicenseEdition(final ManagedObjectReference _this, final ManagedObjectReference host, final String featureKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("featureKey", "String", featureKey);
        wsc.invoke("SetLicenseEdition", paras, null);
    }

    public boolean checkLicenseFeature(final ManagedObjectReference _this, final ManagedObjectReference host, final String featureKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("featureKey", "String", featureKey);
        return (Boolean) wsc.invoke("CheckLicenseFeature", paras, "boolean");
    }

    public boolean enableFeature(final ManagedObjectReference _this, final ManagedObjectReference host, final String featureKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("featureKey", "String", featureKey);
        return (Boolean) wsc.invoke("EnableFeature", paras, "boolean");
    }

    public boolean disableFeature(final ManagedObjectReference _this, final ManagedObjectReference host, final String featureKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("featureKey", "String", featureKey);
        return (Boolean) wsc.invoke("DisableFeature", paras, "boolean");
    }

    public void configureLicenseSource(final ManagedObjectReference _this, final ManagedObjectReference host, final LicenseSource licenseSource) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("licenseSource", "LicenseSource", licenseSource);
        wsc.invoke("ConfigureLicenseSource", paras, null);
    }

    public LicenseManagerLicenseInfo updateLicense(final ManagedObjectReference _this, final String licenseKey, final KeyValue[] labels) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("licenseKey", "String", licenseKey);
        paras[2] = new Argument("labels", "KeyValue[]", labels);
        return (LicenseManagerLicenseInfo) wsc.invoke("UpdateLicense", paras, "LicenseManagerLicenseInfo");
    }

    public LicenseManagerLicenseInfo addLicense(final ManagedObjectReference _this, final String licenseKey, final KeyValue[] labels) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("licenseKey", "String", licenseKey);
        paras[2] = new Argument("labels", "KeyValue[]", labels);
        return (LicenseManagerLicenseInfo) wsc.invoke("AddLicense", paras, "LicenseManagerLicenseInfo");
    }

    public void removeLicense(final ManagedObjectReference _this, final String licenseKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("licenseKey", "String", licenseKey);
        wsc.invoke("RemoveLicense", paras, null);
    }

    public LicenseManagerLicenseInfo decodeLicense(final ManagedObjectReference _this, final String licenseKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("licenseKey", "String", licenseKey);
        return (LicenseManagerLicenseInfo) wsc.invoke("DecodeLicense", paras, "LicenseManagerLicenseInfo");
    }

    public void updateLicenseLabel(final ManagedObjectReference _this, final String licenseKey, final String labelKey, final String labelValue) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("licenseKey", "String", licenseKey);
        paras[2] = new Argument("labelKey", "String", labelKey);
        paras[3] = new Argument("labelValue", "String", labelValue);
        wsc.invoke("UpdateLicenseLabel", paras, null);
    }

    public void removeLicenseLabel(final ManagedObjectReference _this, final String licenseKey, final String labelKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("licenseKey", "String", licenseKey);
        paras[2] = new Argument("labelKey", "String", labelKey);
        wsc.invoke("RemoveLicenseLabel", paras, null);
    }

    public void destroyNetwork(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DestroyNetwork", paras, null);
    }

    public OvfValidateHostResult validateHost(final ManagedObjectReference _this, final String ovfDescriptor, final ManagedObjectReference host, final OvfValidateHostParams vhp) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("ovfDescriptor", "String", ovfDescriptor);
        paras[2] = new Argument("host", "ManagedObjectReference", host);
        paras[3] = new Argument("vhp", "OvfValidateHostParams", vhp);
        return (OvfValidateHostResult) wsc.invoke("ValidateHost", paras, "OvfValidateHostResult");
    }

    public OvfParseDescriptorResult parseDescriptor(final ManagedObjectReference _this, final String ovfDescriptor, final OvfParseDescriptorParams pdp) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("ovfDescriptor", "String", ovfDescriptor);
        paras[2] = new Argument("pdp", "OvfParseDescriptorParams", pdp);
        return (OvfParseDescriptorResult) wsc.invoke("ParseDescriptor", paras, "OvfParseDescriptorResult");
    }

    public OvfCreateImportSpecResult createImportSpec(final ManagedObjectReference _this, final String ovfDescriptor, final ManagedObjectReference resourcePool, final ManagedObjectReference datastore, final OvfCreateImportSpecParams cisp) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("ovfDescriptor", "String", ovfDescriptor);
        paras[2] = new Argument("resourcePool", "ManagedObjectReference", resourcePool);
        paras[3] = new Argument("datastore", "ManagedObjectReference", datastore);
        paras[4] = new Argument("cisp", "OvfCreateImportSpecParams", cisp);
        return (OvfCreateImportSpecResult) wsc.invoke("CreateImportSpec", paras, "OvfCreateImportSpecResult");
    }

    public OvfCreateDescriptorResult createDescriptor(final ManagedObjectReference _this, final ManagedObjectReference obj, final OvfCreateDescriptorParams cdp) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("obj", "ManagedObjectReference", obj);
        paras[2] = new Argument("cdp", "OvfCreateDescriptorParams", cdp);
        return (OvfCreateDescriptorResult) wsc.invoke("CreateDescriptor", paras, "OvfCreateDescriptorResult");
    }

    public PerfProviderSummary queryPerfProviderSummary(final ManagedObjectReference _this, final ManagedObjectReference entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        return (PerfProviderSummary) wsc.invoke("QueryPerfProviderSummary", paras, "PerfProviderSummary");
    }

    public PerfMetricId[] queryAvailablePerfMetric(final ManagedObjectReference _this, final ManagedObjectReference entity, final Calendar beginTime, final Calendar endTime, final int intervalId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        paras[2] = new Argument("beginTime", "Calendar", beginTime);
        paras[3] = new Argument("endTime", "Calendar", endTime);
        paras[4] = new Argument("intervalId", "int", intervalId);
        return (PerfMetricId[]) wsc.invoke("QueryAvailablePerfMetric", paras, "PerfMetricId[]");
    }

    public PerfCounterInfo[] queryPerfCounter(final ManagedObjectReference _this, final int[] counterId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("counterId", "int[]", counterId);
        return (PerfCounterInfo[]) wsc.invoke("QueryPerfCounter", paras, "PerfCounterInfo[]");
    }

    public PerfCounterInfo[] queryPerfCounterByLevel(final ManagedObjectReference _this, final int level) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("level", "int", level);
        return (PerfCounterInfo[]) wsc.invoke("QueryPerfCounterByLevel", paras, "PerfCounterInfo[]");
    }

    public PerfEntityMetricBase[] queryPerf(final ManagedObjectReference _this, final PerfQuerySpec[] querySpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("querySpec", "PerfQuerySpec[]", querySpec);
        return (PerfEntityMetricBase[]) wsc.invoke("QueryPerf", paras, "PerfEntityMetricBase[]");
    }

    public PerfCompositeMetric queryPerfComposite(final ManagedObjectReference _this, final PerfQuerySpec querySpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("querySpec", "PerfQuerySpec", querySpec);
        return (PerfCompositeMetric) wsc.invoke("QueryPerfComposite", paras, "PerfCompositeMetric");
    }

    public void createPerfInterval(final ManagedObjectReference _this, final PerfInterval intervalId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("intervalId", "PerfInterval", intervalId);
        wsc.invoke("CreatePerfInterval", paras, null);
    }

    public void removePerfInterval(final ManagedObjectReference _this, final int samplePeriod) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("samplePeriod", "int", samplePeriod);
        wsc.invoke("RemovePerfInterval", paras, null);
    }

    public void updatePerfInterval(final ManagedObjectReference _this, final PerfInterval interval) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("interval", "PerfInterval", interval);
        wsc.invoke("UpdatePerfInterval", paras, null);
    }

    public DatabaseSizeEstimate estimateDatabaseSize(final ManagedObjectReference _this, final DatabaseSizeParam dbSizeParam) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("dbSizeParam", "DatabaseSizeParam", dbSizeParam);
        return (DatabaseSizeEstimate) wsc.invoke("EstimateDatabaseSize", paras, "DatabaseSizeEstimate");
    }

    public ManagedObjectReference findByUuid(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String uuid, final boolean vmSearch, final Boolean instanceUuid) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("uuid", "String", uuid);
        paras[3] = new Argument("vmSearch", "boolean", vmSearch);
        paras[4] = new Argument("instanceUuid", "Boolean", instanceUuid);
        return (ManagedObjectReference) wsc.invoke("FindByUuid", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference findByDatastorePath(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String path) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("path", "String", path);
        return (ManagedObjectReference) wsc.invoke("FindByDatastorePath", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference findByDnsName(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String dnsName, final boolean vmSearch) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("dnsName", "String", dnsName);
        paras[3] = new Argument("vmSearch", "boolean", vmSearch);
        return (ManagedObjectReference) wsc.invoke("FindByDnsName", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference findByIp(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String ip, final boolean vmSearch) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("ip", "String", ip);
        paras[3] = new Argument("vmSearch", "boolean", vmSearch);
        return (ManagedObjectReference) wsc.invoke("FindByIp", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference findByInventoryPath(final ManagedObjectReference _this, final String inventoryPath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("inventoryPath", "String", inventoryPath);
        return (ManagedObjectReference) wsc.invoke("FindByInventoryPath", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference findChild(final ManagedObjectReference _this, final ManagedObjectReference entity, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        paras[2] = new Argument("name", "String", name);
        return (ManagedObjectReference) wsc.invoke("FindChild", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference[] findAllByUuid(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String uuid, final boolean vmSearch, final Boolean instanceUuid) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("uuid", "String", uuid);
        paras[3] = new Argument("vmSearch", "boolean", vmSearch);
        paras[4] = new Argument("instanceUuid", "Boolean", instanceUuid);
        return (ManagedObjectReference[]) wsc.invoke("FindAllByUuid", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference[] findAllByDnsName(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String dnsName, final boolean vmSearch) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("dnsName", "String", dnsName);
        paras[3] = new Argument("vmSearch", "boolean", vmSearch);
        return (ManagedObjectReference[]) wsc.invoke("FindAllByDnsName", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference[] findAllByIp(final ManagedObjectReference _this, final ManagedObjectReference datacenter, final String ip, final boolean vmSearch) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[2] = new Argument("ip", "String", ip);
        paras[3] = new Argument("vmSearch", "boolean", vmSearch);
        return (ManagedObjectReference[]) wsc.invoke("FindAllByIp", paras, "ManagedObjectReference[]");
    }

    public Calendar currentTime(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (Calendar) wsc.invoke("CurrentTime", paras, "Calendar");
    }

    public ServiceContent retrieveServiceContent(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ServiceContent) wsc.invoke("RetrieveServiceContent", paras, "ServiceContent");
    }

    public Event[] validateMigration(final ManagedObjectReference _this, final ManagedObjectReference[] vm, final VirtualMachinePowerState state, final String[] testType, final ManagedObjectReference pool, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference[]", vm);
        paras[2] = new Argument("state", "VirtualMachinePowerState", state);
        paras[3] = new Argument("testType", "String[]", testType);
        paras[4] = new Argument("pool", "ManagedObjectReference", pool);
        paras[5] = new Argument("host", "ManagedObjectReference", host);
        return (Event[]) wsc.invoke("ValidateMigration", paras, "Event[]");
    }

    public HostVMotionCompatibility[] queryVMotionCompatibility(final ManagedObjectReference _this, final ManagedObjectReference vm, final ManagedObjectReference[] host, final String[] compatibility) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("host", "ManagedObjectReference[]", host);
        paras[3] = new Argument("compatibility", "String[]", compatibility);
        return (HostVMotionCompatibility[]) wsc.invoke("QueryVMotionCompatibility", paras, "HostVMotionCompatibility[]");
    }

    public ProductComponentInfo[] retrieveProductComponents(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ProductComponentInfo[]) wsc.invoke("RetrieveProductComponents", paras, "ProductComponentInfo[]");
    }

    public void updateServiceMessage(final ManagedObjectReference _this, final String message) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("message", "String", message);
        wsc.invoke("UpdateServiceMessage", paras, null);
    }

    public UserSession loginByToken(final ManagedObjectReference _this, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("locale", "String", locale);
        return (UserSession) wsc.invoke("LoginByToken", paras, "UserSession");
    }

    public UserSession login(final ManagedObjectReference _this, final String userName, final String password, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("userName", "String", userName);
        paras[2] = new Argument("password", "String", password);
        paras[3] = new Argument("locale", "String", locale);
        return (UserSession) wsc.invoke("Login", paras, "UserSession");
    }

    public UserSession loginBySSPI(final ManagedObjectReference _this, final String base64Token, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("base64Token", "String", base64Token);
        paras[2] = new Argument("locale", "String", locale);
        return (UserSession) wsc.invoke("LoginBySSPI", paras, "UserSession");
    }

    public void logout(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("Logout", paras, null);
    }

    public SessionManagerLocalTicket acquireLocalTicket(final ManagedObjectReference _this, final String userName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("userName", "String", userName);
        return (SessionManagerLocalTicket) wsc.invoke("AcquireLocalTicket", paras, "SessionManagerLocalTicket");
    }

    public SessionManagerGenericServiceTicket acquireGenericServiceTicket(final ManagedObjectReference _this, final SessionManagerServiceRequestSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "SessionManagerServiceRequestSpec", spec);
        return (SessionManagerGenericServiceTicket) wsc.invoke("AcquireGenericServiceTicket", paras, "SessionManagerGenericServiceTicket");
    }

    public void terminateSession(final ManagedObjectReference _this, final String[] sessionId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("sessionId", "String[]", sessionId);
        wsc.invoke("TerminateSession", paras, null);
    }

    public void setLocale(final ManagedObjectReference _this, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("locale", "String", locale);
        wsc.invoke("SetLocale", paras, null);
    }

    public UserSession loginExtensionBySubjectName(final ManagedObjectReference _this, final String extensionKey, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        paras[2] = new Argument("locale", "String", locale);
        return (UserSession) wsc.invoke("LoginExtensionBySubjectName", paras, "UserSession");
    }

    public UserSession loginExtensionByCertificate(final ManagedObjectReference _this, final String extensionKey, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("extensionKey", "String", extensionKey);
        paras[2] = new Argument("locale", "String", locale);
        return (UserSession) wsc.invoke("LoginExtensionByCertificate", paras, "UserSession");
    }

    public UserSession impersonateUser(final ManagedObjectReference _this, final String userName, final String locale) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("userName", "String", userName);
        paras[2] = new Argument("locale", "String", locale);
        return (UserSession) wsc.invoke("ImpersonateUser", paras, "UserSession");
    }

    public boolean sessionIsActive(final ManagedObjectReference _this, final String sessionID, final String userName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("sessionID", "String", sessionID);
        paras[2] = new Argument("userName", "String", userName);
        return (Boolean) wsc.invoke("SessionIsActive", paras, "boolean");
    }

    public String acquireCloneTicket(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (String) wsc.invoke("AcquireCloneTicket", paras, "String");
    }

    public UserSession cloneSession(final ManagedObjectReference _this, final String cloneTicket) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("cloneTicket", "String", cloneTicket);
        return (UserSession) wsc.invoke("CloneSession", paras, "UserSession");
    }

    public ManagedObjectReference configureDatastoreIORM_Task(final ManagedObjectReference _this, final ManagedObjectReference datastore, final StorageIORMConfigSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datastore", "ManagedObjectReference", datastore);
        paras[2] = new Argument("spec", "StorageIORMConfigSpec", spec);
        return (ManagedObjectReference) wsc.invoke("ConfigureDatastoreIORM_Task", paras, "ManagedObjectReference");
    }

    public StorageIORMConfigOption queryIORMConfigOption(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (StorageIORMConfigOption) wsc.invoke("QueryIORMConfigOption", paras, "StorageIORMConfigOption");
    }

    public StoragePerformanceSummary[] queryDatastorePerformanceSummary(final ManagedObjectReference _this, final ManagedObjectReference datastore) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datastore", "ManagedObjectReference", datastore);
        return (StoragePerformanceSummary[]) wsc.invoke("QueryDatastorePerformanceSummary", paras, "StoragePerformanceSummary[]");
    }

    public ManagedObjectReference applyStorageDrsRecommendationToPod_Task(final ManagedObjectReference _this, final ManagedObjectReference pod, final String key) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("pod", "ManagedObjectReference", pod);
        paras[2] = new Argument("key", "String", key);
        return (ManagedObjectReference) wsc.invoke("ApplyStorageDrsRecommendationToPod_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference applyStorageDrsRecommendation_Task(final ManagedObjectReference _this, final String[] key) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "String[]", key);
        return (ManagedObjectReference) wsc.invoke("ApplyStorageDrsRecommendation_Task", paras, "ManagedObjectReference");
    }

    public void cancelStorageDrsRecommendation(final ManagedObjectReference _this, final String[] key) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "String[]", key);
        wsc.invoke("CancelStorageDrsRecommendation", paras, null);
    }

    public void refreshStorageDrsRecommendation(final ManagedObjectReference _this, final ManagedObjectReference pod) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("pod", "ManagedObjectReference", pod);
        wsc.invoke("RefreshStorageDrsRecommendation", paras, null);
    }

    public ManagedObjectReference configureStorageDrsForPod_Task(final ManagedObjectReference _this, final ManagedObjectReference pod, final StorageDrsConfigSpec spec, final boolean modify) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("pod", "ManagedObjectReference", pod);
        paras[2] = new Argument("spec", "StorageDrsConfigSpec", spec);
        paras[3] = new Argument("modify", "boolean", modify);
        return (ManagedObjectReference) wsc.invoke("ConfigureStorageDrsForPod_Task", paras, "ManagedObjectReference");
    }

    public StoragePlacementResult recommendDatastores(final ManagedObjectReference _this, final StoragePlacementSpec storageSpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("storageSpec", "StoragePlacementSpec", storageSpec);
        return (StoragePlacementResult) wsc.invoke("RecommendDatastores", paras, "StoragePlacementResult");
    }

    public TaskInfo[] readNextTasks(final ManagedObjectReference _this, final int maxCount) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("maxCount", "int", maxCount);
        return (TaskInfo[]) wsc.invoke("ReadNextTasks", paras, "TaskInfo[]");
    }

    public TaskInfo[] readPreviousTasks(final ManagedObjectReference _this, final int maxCount) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("maxCount", "int", maxCount);
        return (TaskInfo[]) wsc.invoke("ReadPreviousTasks", paras, "TaskInfo[]");
    }

    public ManagedObjectReference createCollectorForTasks(final ManagedObjectReference _this, final TaskFilterSpec filter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("filter", "TaskFilterSpec", filter);
        return (ManagedObjectReference) wsc.invoke("CreateCollectorForTasks", paras, "ManagedObjectReference");
    }

    public TaskInfo createTask(final ManagedObjectReference _this, final ManagedObjectReference obj, final String taskTypeId, final String initiatedBy, final boolean cancelable, final String parentTaskKey) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("obj", "ManagedObjectReference", obj);
        paras[2] = new Argument("taskTypeId", "String", taskTypeId);
        paras[3] = new Argument("initiatedBy", "String", initiatedBy);
        paras[4] = new Argument("cancelable", "boolean", cancelable);
        paras[5] = new Argument("parentTaskKey", "String", parentTaskKey);
        return (TaskInfo) wsc.invoke("CreateTask", paras, "TaskInfo");
    }

    public UserSearchResult[] retrieveUserGroups(final ManagedObjectReference _this, final String domain, final String searchStr, final String belongsToGroup, final String belongsToUser, final boolean exactMatch, final boolean findUsers, final boolean findGroups) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[8];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("domain", "String", domain);
        paras[2] = new Argument("searchStr", "String", searchStr);
        paras[3] = new Argument("belongsToGroup", "String", belongsToGroup);
        paras[4] = new Argument("belongsToUser", "String", belongsToUser);
        paras[5] = new Argument("exactMatch", "boolean", exactMatch);
        paras[6] = new Argument("findUsers", "boolean", findUsers);
        paras[7] = new Argument("findGroups", "boolean", findGroups);
        return (UserSearchResult[]) wsc.invoke("RetrieveUserGroups", paras, "UserSearchResult[]");
    }

    public void updateVAppConfig(final ManagedObjectReference _this, final VAppConfigSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "VAppConfigSpec", spec);
        wsc.invoke("UpdateVAppConfig", paras, null);
    }

    public void updateLinkedChildren(final ManagedObjectReference _this, final VirtualAppLinkInfo[] addChangeSet, final ManagedObjectReference[] removeSet) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("addChangeSet", "VirtualAppLinkInfo[]", addChangeSet);
        paras[2] = new Argument("removeSet", "ManagedObjectReference[]", removeSet);
        wsc.invoke("UpdateLinkedChildren", paras, null);
    }

    public ManagedObjectReference cloneVApp_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference target, final VAppCloneSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("target", "ManagedObjectReference", target);
        paras[3] = new Argument("spec", "VAppCloneSpec", spec);
        return (ManagedObjectReference) wsc.invoke("CloneVApp_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference exportVApp(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("ExportVApp", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference powerOnVApp_Task(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("PowerOnVApp_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference powerOffVApp_Task(final ManagedObjectReference _this, final boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("force", "boolean", force);
        return (ManagedObjectReference) wsc.invoke("PowerOffVApp_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference suspendVApp_Task(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("SuspendVApp_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference unregisterVApp_Task(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("unregisterVApp_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference createVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter, final VirtualDiskSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[3] = new Argument("spec", "VirtualDiskSpec", spec);
        return (ManagedObjectReference) wsc.invoke("CreateVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference deleteVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (ManagedObjectReference) wsc.invoke("DeleteVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference moveVirtualDisk_Task(final ManagedObjectReference _this, final String sourceName, final ManagedObjectReference sourceDatacenter, final String destName, final ManagedObjectReference destDatacenter, final Boolean force, final VirtualMachineProfileSpec[] profile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[7];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("sourceName", "String", sourceName);
        paras[2] = new Argument("sourceDatacenter", "ManagedObjectReference", sourceDatacenter);
        paras[3] = new Argument("destName", "String", destName);
        paras[4] = new Argument("destDatacenter", "ManagedObjectReference", destDatacenter);
        paras[5] = new Argument("force", "Boolean", force);
        paras[6] = new Argument("profile", "VirtualMachineProfileSpec[]", profile);
        return (ManagedObjectReference) wsc.invoke("MoveVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference copyVirtualDisk_Task(final ManagedObjectReference _this, final String sourceName, final ManagedObjectReference sourceDatacenter, final String destName, final ManagedObjectReference destDatacenter, final VirtualDiskSpec destSpec, final Boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[7];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("sourceName", "String", sourceName);
        paras[2] = new Argument("sourceDatacenter", "ManagedObjectReference", sourceDatacenter);
        paras[3] = new Argument("destName", "String", destName);
        paras[4] = new Argument("destDatacenter", "ManagedObjectReference", destDatacenter);
        paras[5] = new Argument("destSpec", "VirtualDiskSpec", destSpec);
        paras[6] = new Argument("force", "Boolean", force);
        return (ManagedObjectReference) wsc.invoke("CopyVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference extendVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter, final long newCapacityKb, final Boolean eagerZero) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[3] = new Argument("newCapacityKb", "long", newCapacityKb);
        paras[4] = new Argument("eagerZero", "Boolean", eagerZero);
        return (ManagedObjectReference) wsc.invoke("ExtendVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public int queryVirtualDiskFragmentation(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (Integer) wsc.invoke("QueryVirtualDiskFragmentation", paras, "int");
    }

    public ManagedObjectReference defragmentVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (ManagedObjectReference) wsc.invoke("DefragmentVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference shrinkVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter, final Boolean copy) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[3] = new Argument("copy", "Boolean", copy);
        return (ManagedObjectReference) wsc.invoke("ShrinkVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference inflateVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (ManagedObjectReference) wsc.invoke("InflateVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference eagerZeroVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (ManagedObjectReference) wsc.invoke("EagerZeroVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference zeroFillVirtualDisk_Task(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (ManagedObjectReference) wsc.invoke("ZeroFillVirtualDisk_Task", paras, "ManagedObjectReference");
    }

    public void setVirtualDiskUuid(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter, final String uuid) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        paras[3] = new Argument("uuid", "String", uuid);
        wsc.invoke("SetVirtualDiskUuid", paras, null);
    }

    public String queryVirtualDiskUuid(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (String) wsc.invoke("QueryVirtualDiskUuid", paras, "String");
    }

    public HostDiskDimensionsChs queryVirtualDiskGeometry(final ManagedObjectReference _this, final String name, final ManagedObjectReference datacenter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("datacenter", "ManagedObjectReference", datacenter);
        return (HostDiskDimensionsChs) wsc.invoke("QueryVirtualDiskGeometry", paras, "HostDiskDimensionsChs");
    }

    public ManagedObjectReference reconfigureDVPortgroup_Task(final ManagedObjectReference _this, final DVPortgroupConfigSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "DVPortgroupConfigSpec", spec);
        return (ManagedObjectReference) wsc.invoke("ReconfigureDVPortgroup_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference dVPortgroupRollback_Task(final ManagedObjectReference _this, final EntityBackupConfig entityBackup) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entityBackup", "EntityBackupConfig", entityBackup);
        return (ManagedObjectReference) wsc.invoke("DVPortgroupRollback_Task", paras, "ManagedObjectReference");
    }

    public Event[] readNextEvents(final ManagedObjectReference _this, final int maxCount) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("maxCount", "int", maxCount);
        return (Event[]) wsc.invoke("ReadNextEvents", paras, "Event[]");
    }

    public Event[] readPreviousEvents(final ManagedObjectReference _this, final int maxCount) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("maxCount", "int", maxCount);
        return (Event[]) wsc.invoke("ReadPreviousEvents", paras, "Event[]");
    }

    public EventArgDesc[] retrieveArgumentDescription(final ManagedObjectReference _this, final String eventTypeId) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("eventTypeId", "String", eventTypeId);
        return (EventArgDesc[]) wsc.invoke("RetrieveArgumentDescription", paras, "EventArgDesc[]");
    }

    public ManagedObjectReference createCollectorForEvents(final ManagedObjectReference _this, final EventFilterSpec filter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("filter", "EventFilterSpec", filter);
        return (ManagedObjectReference) wsc.invoke("CreateCollectorForEvents", Arrays.asList(paras), "ManagedObjectReference");
    }

    public void logUserEvent(final ManagedObjectReference _this, final ManagedObjectReference entity, final String msg) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        paras[2] = new Argument("msg", "String", msg);
        wsc.invoke("LogUserEvent", paras, null);
    }

    public Event[] queryEvents(final ManagedObjectReference _this, final EventFilterSpec filter) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("filter", "EventFilterSpec", filter);
        return (Event[]) wsc.invoke("QueryEvents", Arrays.asList(paras), "Event[]");
    }

    public void postEvent(final ManagedObjectReference _this, final Event eventToPost, final TaskInfo taskInfo) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("eventToPost", "Event", eventToPost);
        paras[2] = new Argument("taskInfo", "TaskInfo", taskInfo);
        wsc.invoke("PostEvent", paras, null);
    }

    public HostBootDeviceInfo queryBootDevices(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (HostBootDeviceInfo) wsc.invoke("QueryBootDevices", paras, "HostBootDeviceInfo");
    }

    public void updateBootDevice(final ManagedObjectReference _this, final String key) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "String", key);
        wsc.invoke("UpdateBootDevice", paras, null);
    }

    public ManagedObjectReference configureHostCache_Task(final ManagedObjectReference _this, final HostCacheConfigurationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "HostCacheConfigurationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("ConfigureHostCache_Task", paras, "ManagedObjectReference");
    }

    public void enableHyperThreading(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("EnableHyperThreading", paras, null);
    }

    public void disableHyperThreading(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DisableHyperThreading", paras, null);
    }

    public ManagedObjectReference searchDatastore_Task(final ManagedObjectReference _this, final String datastorePath, final HostDatastoreBrowserSearchSpec searchSpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datastorePath", "String", datastorePath);
        paras[2] = new Argument("searchSpec", "HostDatastoreBrowserSearchSpec", searchSpec);
        return (ManagedObjectReference) wsc.invoke("SearchDatastore_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference searchDatastoreSubFolders_Task(final ManagedObjectReference _this, final String datastorePath, final HostDatastoreBrowserSearchSpec searchSpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datastorePath", "String", datastorePath);
        paras[2] = new Argument("searchSpec", "HostDatastoreBrowserSearchSpec", searchSpec);
        return (ManagedObjectReference) wsc.invoke("SearchDatastoreSubFolders_Task", paras, "ManagedObjectReference");
    }

    public void deleteFile(final ManagedObjectReference _this, final String datastorePath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("datastorePath", "String", datastorePath);
        wsc.invoke("DeleteFile", paras, null);
    }

    public HostDiagnosticPartition[] queryAvailablePartition(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (HostDiagnosticPartition[]) wsc.invoke("QueryAvailablePartition", paras, "HostDiagnosticPartition[]");
    }

    public void selectActivePartition(final ManagedObjectReference _this, final HostScsiDiskPartition partition) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("partition", "HostScsiDiskPartition", partition);
        wsc.invoke("SelectActivePartition", paras, null);
    }

    public HostDiagnosticPartitionCreateOption[] queryPartitionCreateOptions(final ManagedObjectReference _this, final String storageType, final String diagnosticType) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("storageType", "String", storageType);
        paras[2] = new Argument("diagnosticType", "String", diagnosticType);
        return (HostDiagnosticPartitionCreateOption[]) wsc.invoke("QueryPartitionCreateOptions", paras, "HostDiagnosticPartitionCreateOption[]");
    }

    public HostDiagnosticPartitionCreateDescription queryPartitionCreateDesc(final ManagedObjectReference _this, final String diskUuid, final String diagnosticType) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("diskUuid", "String", diskUuid);
        paras[2] = new Argument("diagnosticType", "String", diagnosticType);
        return (HostDiagnosticPartitionCreateDescription) wsc.invoke("QueryPartitionCreateDesc", paras, "HostDiagnosticPartitionCreateDescription");
    }

    public void createDiagnosticPartition(final ManagedObjectReference _this, final HostDiagnosticPartitionCreateSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "HostDiagnosticPartitionCreateSpec", spec);
        wsc.invoke("CreateDiagnosticPartition", paras, null);
    }

    public void esxAgentHostManagerUpdateConfig(final ManagedObjectReference _this, final HostEsxAgentHostManagerConfigInfo configInfo) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("configInfo", "HostEsxAgentHostManagerConfigInfo", configInfo);
        wsc.invoke("EsxAgentHostManagerUpdateConfig", paras, null);
    }

    public void updateDefaultPolicy(final ManagedObjectReference _this, final HostFirewallDefaultPolicy defaultPolicy) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("defaultPolicy", "HostFirewallDefaultPolicy", defaultPolicy);
        wsc.invoke("UpdateDefaultPolicy", paras, null);
    }

    public void enableRuleset(final ManagedObjectReference _this, final String id) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        wsc.invoke("EnableRuleset", paras, null);
    }

    public void disableRuleset(final ManagedObjectReference _this, final String id) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        wsc.invoke("DisableRuleset", paras, null);
    }

    public void updateRuleset(final ManagedObjectReference _this, final String id, final HostFirewallRulesetRulesetSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        paras[2] = new Argument("spec", "HostFirewallRulesetRulesetSpec", spec);
        wsc.invoke("UpdateRuleset", paras, null);
    }

    public void refreshFirewall(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("RefreshFirewall", paras, null);
    }

    public void resetFirmwareToFactoryDefaults(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("ResetFirmwareToFactoryDefaults", paras, null);
    }

    public String backupFirmwareConfiguration(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (String) wsc.invoke("BackupFirmwareConfiguration", paras, "String");
    }

    public String queryFirmwareConfigUploadURL(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (String) wsc.invoke("QueryFirmwareConfigUploadURL", paras, "String");
    }

    public void restoreFirmwareConfiguration(final ManagedObjectReference _this, final boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("force", "boolean", force);
        wsc.invoke("RestoreFirmwareConfiguration", paras, null);
    }

    public void refreshHealthStatusSystem(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("RefreshHealthStatusSystem", paras, null);
    }

    public void resetSystemHealthInfo(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("ResetSystemHealthInfo", paras, null);
    }

    public String hostImageConfigGetAcceptance(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (String) wsc.invoke("HostImageConfigGetAcceptance", paras, "String");
    }

    public HostImageProfileSummary hostImageConfigGetProfile(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (HostImageProfileSummary) wsc.invoke("HostImageConfigGetProfile", paras, "HostImageProfileSummary");
    }

    public void updateHostImageAcceptanceLevel(final ManagedObjectReference _this, final String newAcceptanceLevel) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("newAcceptanceLevel", "String", newAcceptanceLevel);
        wsc.invoke("UpdateHostImageAcceptanceLevel", paras, null);
    }

    public IscsiStatus queryVnicStatus(final ManagedObjectReference _this, final String vnicDevice) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vnicDevice", "String", vnicDevice);
        return (IscsiStatus) wsc.invoke("QueryVnicStatus", paras, "IscsiStatus");
    }

    public IscsiStatus queryPnicStatus(final ManagedObjectReference _this, final String pnicDevice) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("pnicDevice", "String", pnicDevice);
        return (IscsiStatus) wsc.invoke("QueryPnicStatus", paras, "IscsiStatus");
    }

    public IscsiPortInfo[] queryBoundVnics(final ManagedObjectReference _this, final String iScsiHbaName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("iScsiHbaName", "String", iScsiHbaName);
        return (IscsiPortInfo[]) wsc.invoke("QueryBoundVnics", paras, "IscsiPortInfo[]");
    }

    public IscsiPortInfo[] queryCandidateNics(final ManagedObjectReference _this, final String iScsiHbaName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("iScsiHbaName", "String", iScsiHbaName);
        return (IscsiPortInfo[]) wsc.invoke("QueryCandidateNics", paras, "IscsiPortInfo[]");
    }

    public void bindVnic(final ManagedObjectReference _this, final String iScsiHbaName, final String vnicDevice) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("iScsiHbaName", "String", iScsiHbaName);
        paras[2] = new Argument("vnicDevice", "String", vnicDevice);
        wsc.invoke("BindVnic", paras, null);
    }

    public void unbindVnic(final ManagedObjectReference _this, final String iScsiHbaName, final String vnicDevice, final boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("iScsiHbaName", "String", iScsiHbaName);
        paras[2] = new Argument("vnicDevice", "String", vnicDevice);
        paras[3] = new Argument("force", "boolean", force);
        wsc.invoke("UnbindVnic", paras, null);
    }

    public IscsiMigrationDependency queryMigrationDependencies(final ManagedObjectReference _this, final String[] pnicDevice) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("pnicDevice", "String[]", pnicDevice);
        return (IscsiMigrationDependency) wsc.invoke("QueryMigrationDependencies", paras, "IscsiMigrationDependency");
    }

    public KernelModuleInfo[] queryModules(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (KernelModuleInfo[]) wsc.invoke("QueryModules", paras, "KernelModuleInfo[]");
    }

    public void updateModuleOptionString(final ManagedObjectReference _this, final String name, final String options) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("options", "String", options);
        wsc.invoke("UpdateModuleOptionString", paras, null);
    }

    public String queryConfiguredModuleOptionString(final ManagedObjectReference _this, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        return (String) wsc.invoke("QueryConfiguredModuleOptionString", paras, "String");
    }

    public void reconfigureServiceConsoleReservation(final ManagedObjectReference _this, final long cfgBytes) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("cfgBytes", "long", cfgBytes);
        wsc.invoke("ReconfigureServiceConsoleReservation", paras, null);
    }

    public void reconfigureVirtualMachineReservation(final ManagedObjectReference _this, final VirtualMachineMemoryReservationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "VirtualMachineMemoryReservationSpec", spec);
        wsc.invoke("ReconfigureVirtualMachineReservation", paras, null);
    }

    public ManagedObjectReference checkHostPatch_Task(final ManagedObjectReference _this, final String[] metaUrls, final String[] bundleUrls, final HostPatchManagerPatchManagerOperationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("metaUrls", "String[]", metaUrls);
        paras[2] = new Argument("bundleUrls", "String[]", bundleUrls);
        paras[3] = new Argument("spec", "HostPatchManagerPatchManagerOperationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("CheckHostPatch_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference scanHostPatch_Task(final ManagedObjectReference _this, final HostPatchManagerLocator repository, final String[] updateID) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("repository", "HostPatchManagerLocator", repository);
        paras[2] = new Argument("updateID", "String[]", updateID);
        return (ManagedObjectReference) wsc.invoke("ScanHostPatch_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference scanHostPatchV2_Task(final ManagedObjectReference _this, final String[] metaUrls, final String[] bundleUrls, final HostPatchManagerPatchManagerOperationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("metaUrls", "String[]", metaUrls);
        paras[2] = new Argument("bundleUrls", "String[]", bundleUrls);
        paras[3] = new Argument("spec", "HostPatchManagerPatchManagerOperationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("ScanHostPatchV2_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference stageHostPatch_Task(final ManagedObjectReference _this, final String[] metaUrls, final String[] bundleUrls, final String[] vibUrls, final HostPatchManagerPatchManagerOperationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("metaUrls", "String[]", metaUrls);
        paras[2] = new Argument("bundleUrls", "String[]", bundleUrls);
        paras[3] = new Argument("vibUrls", "String[]", vibUrls);
        paras[4] = new Argument("spec", "HostPatchManagerPatchManagerOperationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("StageHostPatch_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference installHostPatch_Task(final ManagedObjectReference _this, final HostPatchManagerLocator repository, final String updateID, final Boolean force) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("repository", "HostPatchManagerLocator", repository);
        paras[2] = new Argument("updateID", "String", updateID);
        paras[3] = new Argument("force", "Boolean", force);
        return (ManagedObjectReference) wsc.invoke("InstallHostPatch_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference installHostPatchV2_Task(final ManagedObjectReference _this, final String[] metaUrls, final String[] bundleUrls, final String[] vibUrls, final HostPatchManagerPatchManagerOperationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("metaUrls", "String[]", metaUrls);
        paras[2] = new Argument("bundleUrls", "String[]", bundleUrls);
        paras[3] = new Argument("vibUrls", "String[]", vibUrls);
        paras[4] = new Argument("spec", "HostPatchManagerPatchManagerOperationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("InstallHostPatchV2_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference uninstallHostPatch_Task(final ManagedObjectReference _this, final String[] bulletinIds, final HostPatchManagerPatchManagerOperationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("bulletinIds", "String[]", bulletinIds);
        paras[2] = new Argument("spec", "HostPatchManagerPatchManagerOperationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("UninstallHostPatch_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference queryHostPatch_Task(final ManagedObjectReference _this, final HostPatchManagerPatchManagerOperationSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "HostPatchManagerPatchManagerOperationSpec", spec);
        return (ManagedObjectReference) wsc.invoke("QueryHostPatch_Task", paras, "ManagedObjectReference");
    }

    public void refresh(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("Refresh", paras, null);
    }

    public void updatePassthruConfig(final ManagedObjectReference _this, final HostPciPassthruConfig[] config) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("config", "HostPciPassthruConfig[]", config);
        wsc.invoke("UpdatePassthruConfig", paras, null);
    }

    public void configurePowerPolicy(final ManagedObjectReference _this, final int key) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("key", "int", key);
        wsc.invoke("ConfigurePowerPolicy", paras, null);
    }

    public void updateServicePolicy(final ManagedObjectReference _this, final String id, final String policy) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        paras[2] = new Argument("policy", "String", policy);
        wsc.invoke("UpdateServicePolicy", paras, null);
    }

    public void startService(final ManagedObjectReference _this, final String id) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        wsc.invoke("StartService", paras, null);
    }

    public void stopService(final ManagedObjectReference _this, final String id) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        wsc.invoke("StopService", paras, null);
    }

    public void restartService(final ManagedObjectReference _this, final String id) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        wsc.invoke("RestartService", paras, null);
    }

    public void uninstallService(final ManagedObjectReference _this, final String id) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("id", "String", id);
        wsc.invoke("UninstallService", paras, null);
    }

    public void refreshServices(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("RefreshServices", paras, null);
    }

    public ManagedObjectReference configureVFlashResourceEx_Task(final ManagedObjectReference _this, final String[] devicePath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("devicePath", "String[]", devicePath);
        return (ManagedObjectReference) wsc.invoke("ConfigureVFlashResourceEx_Task", paras, "ManagedObjectReference");
    }

    public void hostConfigureVFlashResource(final ManagedObjectReference _this, final HostVFlashManagerVFlashResourceConfigSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "HostVFlashManagerVFlashResourceConfigSpec", spec);
        wsc.invoke("HostConfigureVFlashResource", paras, null);
    }

    public void hostRemoveVFlashResource(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("HostRemoveVFlashResource", paras, null);
    }

    public void hostConfigVFlashCache(final ManagedObjectReference _this, final HostVFlashManagerVFlashCacheConfigSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "HostVFlashManagerVFlashCacheConfigSpec", spec);
        wsc.invoke("HostConfigVFlashCache", paras, null);
    }

    public VirtualDiskVFlashCacheConfigInfo hostGetVFlashModuleDefaultConfig(final ManagedObjectReference _this, final String vFlashModule) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vFlashModule", "String", vFlashModule);
        return (VirtualDiskVFlashCacheConfigInfo) wsc.invoke("HostGetVFlashModuleDefaultConfig", paras, "VirtualDiskVFlashCacheConfigInfo");
    }

    public void updateIpConfig(final ManagedObjectReference _this, final HostIpConfig ipConfig) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("ipConfig", "HostIpConfig", ipConfig);
        wsc.invoke("UpdateIpConfig", paras, null);
    }

    public void selectVnic(final ManagedObjectReference _this, final String device) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("device", "String", device);
        wsc.invoke("SelectVnic", paras, null);
    }

    public void deselectVnic(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DeselectVnic", paras, null);
    }

    public VirtualNicManagerNetConfig queryNetConfig(final ManagedObjectReference _this, final String nicType) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("nicType", "String", nicType);
        return (VirtualNicManagerNetConfig) wsc.invoke("QueryNetConfig", paras, "VirtualNicManagerNetConfig");
    }

    public void selectVnicForNicType(final ManagedObjectReference _this, final String nicType, final String device) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("nicType", "String", nicType);
        paras[2] = new Argument("device", "String", device);
        wsc.invoke("SelectVnicForNicType", paras, null);
    }

    public void deselectVnicForNicType(final ManagedObjectReference _this, final String nicType, final String device) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("nicType", "String", nicType);
        paras[2] = new Argument("device", "String", device);
        wsc.invoke("DeselectVnicForNicType", paras, null);
    }

    public VsanHostDiskResult[] queryDisksForVsan(final ManagedObjectReference _this, final String[] canonicalName) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("canonicalName", "String[]", canonicalName);
        return (VsanHostDiskResult[]) wsc.invoke("QueryDisksForVsan", paras, "VsanHostDiskResult[]");
    }

    public ManagedObjectReference addDisks_Task(final ManagedObjectReference _this, final HostScsiDisk[] disk) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("disk", "HostScsiDisk[]", disk);
        return (ManagedObjectReference) wsc.invoke("AddDisks_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference initializeDisks_Task(final ManagedObjectReference _this, final VsanHostDiskMapping[] mapping) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("mapping", "VsanHostDiskMapping[]", mapping);
        return (ManagedObjectReference) wsc.invoke("InitializeDisks_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference removeDisk_Task(final ManagedObjectReference _this, final HostScsiDisk[] disk) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("disk", "HostScsiDisk[]", disk);
        return (ManagedObjectReference) wsc.invoke("RemoveDisk_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference removeDiskMapping_Task(final ManagedObjectReference _this, final VsanHostDiskMapping[] mapping) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("mapping", "VsanHostDiskMapping[]", mapping);
        return (ManagedObjectReference) wsc.invoke("RemoveDiskMapping_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference updateVsan_Task(final ManagedObjectReference _this, final VsanHostConfigInfo config) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("config", "VsanHostConfigInfo", config);
        return (ManagedObjectReference) wsc.invoke("UpdateVsan_Task", paras, "ManagedObjectReference");
    }

    public VsanHostClusterStatus queryHostStatus(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (VsanHostClusterStatus) wsc.invoke("QueryHostStatus", paras, "VsanHostClusterStatus");
    }

    public OptionValue[] queryOptions(final ManagedObjectReference _this, final String name) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        return (OptionValue[]) wsc.invoke("QueryOptions", paras, "OptionValue[]");
    }

    public void updateOptions(final ManagedObjectReference _this, final OptionValue[] changedValue) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("changedValue", "OptionValue[]", changedValue);
        wsc.invoke("UpdateOptions", paras, null);
    }

    public ManagedObjectReference checkCompliance_Task(final ManagedObjectReference _this, final ManagedObjectReference[] profile, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profile", "ManagedObjectReference[]", profile);
        paras[2] = new Argument("entity", "ManagedObjectReference[]", entity);
        return (ManagedObjectReference) wsc.invoke("CheckCompliance_Task", paras, "ManagedObjectReference");
    }

    public ComplianceResult[] queryComplianceStatus(final ManagedObjectReference _this, final ManagedObjectReference[] profile, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profile", "ManagedObjectReference[]", profile);
        paras[2] = new Argument("entity", "ManagedObjectReference[]", entity);
        return (ComplianceResult[]) wsc.invoke("QueryComplianceStatus", paras, "ComplianceResult[]");
    }

    public void clearComplianceStatus(final ManagedObjectReference _this, final ManagedObjectReference[] profile, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profile", "ManagedObjectReference[]", profile);
        paras[2] = new Argument("entity", "ManagedObjectReference[]", entity);
        wsc.invoke("ClearComplianceStatus", paras, null);
    }

    public ProfileExpressionMetadata[] queryExpressionMetadata(final ManagedObjectReference _this, final String[] expressionName, final ManagedObjectReference profile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("expressionName", "String[]", expressionName);
        paras[2] = new Argument("profile", "ManagedObjectReference", profile);
        return (ProfileExpressionMetadata[]) wsc.invoke("QueryExpressionMetadata", paras, "ProfileExpressionMetadata[]");
    }

    public ProfileDescription retrieveDescription(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ProfileDescription) wsc.invoke("RetrieveDescription", paras, "ProfileDescription");
    }

    public void destroyProfile(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DestroyProfile", paras, null);
    }

    public void associateProfile(final ManagedObjectReference _this, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference[]", entity);
        wsc.invoke("AssociateProfile", paras, null);
    }

    public void dissociateProfile(final ManagedObjectReference _this, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference[]", entity);
        wsc.invoke("DissociateProfile", paras, null);
    }

    public ManagedObjectReference checkProfileCompliance_Task(final ManagedObjectReference _this, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference[]", entity);
        return (ManagedObjectReference) wsc.invoke("CheckProfileCompliance_Task", paras, "ManagedObjectReference");
    }

    public String exportProfile(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (String) wsc.invoke("ExportProfile", paras, "String");
    }

    public ManagedObjectReference createProfile(final ManagedObjectReference _this, final ProfileCreateSpec createSpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("createSpec", "ProfileCreateSpec", createSpec);
        return (ManagedObjectReference) wsc.invoke("CreateProfile", paras, "ManagedObjectReference");
    }

    public ProfilePolicyMetadata[] queryPolicyMetadata(final ManagedObjectReference _this, final String[] policyName, final ManagedObjectReference profile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("policyName", "String[]", policyName);
        paras[2] = new Argument("profile", "ManagedObjectReference", profile);
        return (ProfilePolicyMetadata[]) wsc.invoke("QueryPolicyMetadata", paras, "ProfilePolicyMetadata[]");
    }

    public ManagedObjectReference[] findAssociatedProfile(final ManagedObjectReference _this, final ManagedObjectReference entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        return (ManagedObjectReference[]) wsc.invoke("FindAssociatedProfile", paras, "ManagedObjectReference[]");
    }

    public void updateClusterProfile(final ManagedObjectReference _this, final ClusterProfileConfigSpec config) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("config", "ClusterProfileConfigSpec", config);
        wsc.invoke("UpdateClusterProfile", paras, null);
    }

    public ManagedObjectReference applyHostConfig_Task(final ManagedObjectReference _this, final ManagedObjectReference host, final HostConfigSpec configSpec, final ProfileDeferredPolicyOptionParameter[] userInput) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("configSpec", "HostConfigSpec", configSpec);
        paras[3] = new Argument("userInput", "ProfileDeferredPolicyOptionParameter[]", userInput);
        return (ManagedObjectReference) wsc.invoke("ApplyHostConfig_Task", paras, "ManagedObjectReference");
    }

    public HostProfileManagerConfigTaskList generateConfigTaskList(final ManagedObjectReference _this, final HostConfigSpec configSpec, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("configSpec", "HostConfigSpec", configSpec);
        paras[2] = new Argument("host", "ManagedObjectReference", host);
        return (HostProfileManagerConfigTaskList) wsc.invoke("GenerateConfigTaskList", paras, "HostProfileManagerConfigTaskList");
    }

    public ManagedObjectReference generateHostProfileTaskList_Task(final ManagedObjectReference _this, final HostConfigSpec configSpec, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("configSpec", "HostConfigSpec", configSpec);
        paras[2] = new Argument("host", "ManagedObjectReference", host);
        return (ManagedObjectReference) wsc.invoke("GenerateHostProfileTaskList_Task", paras, "ManagedObjectReference");
    }

    public ProfileMetadata[] queryHostProfileMetadata(final ManagedObjectReference _this, final String[] profileName, final ManagedObjectReference profile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profileName", "String[]", profileName);
        paras[2] = new Argument("profile", "ManagedObjectReference", profile);
        return (ProfileMetadata[]) wsc.invoke("QueryHostProfileMetadata", paras, "ProfileMetadata[]");
    }

    public ProfileProfileStructure queryProfileStructure(final ManagedObjectReference _this, final ManagedObjectReference profile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profile", "ManagedObjectReference", profile);
        return (ProfileProfileStructure) wsc.invoke("QueryProfileStructure", paras, "ProfileProfileStructure");
    }

    public ApplyProfile createDefaultProfile(final ManagedObjectReference _this, final String profileType, final String profileTypeName, final ManagedObjectReference profile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("profileType", "String", profileType);
        paras[2] = new Argument("profileTypeName", "String", profileTypeName);
        paras[3] = new Argument("profile", "ManagedObjectReference", profile);
        return (ApplyProfile) wsc.invoke("CreateDefaultProfile", paras, "ApplyProfile");
    }

    public ManagedObjectReference updateAnswerFile_Task(final ManagedObjectReference _this, final ManagedObjectReference host, final AnswerFileCreateSpec configSpec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("configSpec", "AnswerFileCreateSpec", configSpec);
        return (ManagedObjectReference) wsc.invoke("UpdateAnswerFile_Task", paras, "ManagedObjectReference");
    }

    public AnswerFile retrieveAnswerFile(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (AnswerFile) wsc.invoke("RetrieveAnswerFile", paras, "AnswerFile");
    }

    public AnswerFile retrieveAnswerFileForProfile(final ManagedObjectReference _this, final ManagedObjectReference host, final HostApplyProfile applyProfile) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("applyProfile", "HostApplyProfile", applyProfile);
        return (AnswerFile) wsc.invoke("RetrieveAnswerFileForProfile", paras, "AnswerFile");
    }

    public ManagedObjectReference exportAnswerFile_Task(final ManagedObjectReference _this, final ManagedObjectReference host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        return (ManagedObjectReference) wsc.invoke("ExportAnswerFile_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference checkAnswerFileStatus_Task(final ManagedObjectReference _this, final ManagedObjectReference[] host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference[]", host);
        return (ManagedObjectReference) wsc.invoke("CheckAnswerFileStatus_Task", paras, "ManagedObjectReference");
    }

    public AnswerFileStatusResult[] queryAnswerFileStatus(final ManagedObjectReference _this, final ManagedObjectReference[] host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference[]", host);
        return (AnswerFileStatusResult[]) wsc.invoke("QueryAnswerFileStatus", paras, "AnswerFileStatusResult[]");
    }

    public void removeScheduledTask(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("RemoveScheduledTask", paras, null);
    }

    public void reconfigureScheduledTask(final ManagedObjectReference _this, final ScheduledTaskSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("spec", "ScheduledTaskSpec", spec);
        wsc.invoke("ReconfigureScheduledTask", paras, null);
    }

    public void runScheduledTask(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("RunScheduledTask", paras, null);
    }

    public ManagedObjectReference createScheduledTask(final ManagedObjectReference _this, final ManagedObjectReference entity, final ScheduledTaskSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        paras[2] = new Argument("spec", "ScheduledTaskSpec", spec);
        return (ManagedObjectReference) wsc.invoke("CreateScheduledTask", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference[] retrieveEntityScheduledTask(final ManagedObjectReference _this, final ManagedObjectReference entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference", entity);
        return (ManagedObjectReference[]) wsc.invoke("RetrieveEntityScheduledTask", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference createObjectScheduledTask(final ManagedObjectReference _this, final ManagedObjectReference obj, final ScheduledTaskSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("obj", "ManagedObjectReference", obj);
        paras[2] = new Argument("spec", "ScheduledTaskSpec", spec);
        return (ManagedObjectReference) wsc.invoke("CreateObjectScheduledTask", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference[] retrieveObjectScheduledTask(final ManagedObjectReference _this, final ManagedObjectReference obj) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("obj", "ManagedObjectReference", obj);
        return (ManagedObjectReference[]) wsc.invoke("RetrieveObjectScheduledTask", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference[] openInventoryViewFolder(final ManagedObjectReference _this, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference[]", entity);
        return (ManagedObjectReference[]) wsc.invoke("OpenInventoryViewFolder", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference[] closeInventoryViewFolder(final ManagedObjectReference _this, final ManagedObjectReference[] entity) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("entity", "ManagedObjectReference[]", entity);
        return (ManagedObjectReference[]) wsc.invoke("CloseInventoryViewFolder", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference[] modifyListView(final ManagedObjectReference _this, final ManagedObjectReference[] add, final ManagedObjectReference[] remove) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("add", "ManagedObjectReference[]", add);
        paras[2] = new Argument("remove", "ManagedObjectReference[]", remove);
        return (ManagedObjectReference[]) wsc.invoke("ModifyListView", paras, "ManagedObjectReference[]");
    }

    public ManagedObjectReference[] resetListView(final ManagedObjectReference _this, final ManagedObjectReference[] obj) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("obj", "ManagedObjectReference[]", obj);
        return (ManagedObjectReference[]) wsc.invoke("ResetListView", paras, "ManagedObjectReference[]");
    }

    public void resetListViewFromView(final ManagedObjectReference _this, final ManagedObjectReference view) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("view", "ManagedObjectReference", view);
        wsc.invoke("ResetListViewFromView", paras, null);
    }

    public void destroyView(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        wsc.invoke("DestroyView", paras, null);
    }

    public ManagedObjectReference createInventoryView(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("CreateInventoryView", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference createContainerView(final ManagedObjectReference _this, final ManagedObjectReference container, final String[] type, final boolean recursive) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("container", "ManagedObjectReference", container);
        paras[2] = new Argument("type", "String[]", type);
        paras[3] = new Argument("recursive", "boolean", recursive);
        return (ManagedObjectReference) wsc.invoke("CreateContainerView", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference createListView(final ManagedObjectReference _this, final ManagedObjectReference[] obj) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("obj", "ManagedObjectReference[]", obj);
        return (ManagedObjectReference) wsc.invoke("CreateListView", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference createListViewFromView(final ManagedObjectReference _this, final ManagedObjectReference view) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[2];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("view", "ManagedObjectReference", view);
        return (ManagedObjectReference) wsc.invoke("CreateListViewFromView", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference revertToSnapshot_Task(final ManagedObjectReference _this, final ManagedObjectReference host, final Boolean suppressPowerOn) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("host", "ManagedObjectReference", host);
        paras[2] = new Argument("suppressPowerOn", "Boolean", suppressPowerOn);
        return (ManagedObjectReference) wsc.invoke("RevertToSnapshot_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference removeSnapshot_Task(final ManagedObjectReference _this, final boolean removeChildren, final Boolean consolidate) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("removeChildren", "boolean", removeChildren);
        paras[2] = new Argument("consolidate", "Boolean", consolidate);
        return (ManagedObjectReference) wsc.invoke("RemoveSnapshot_Task", paras, "ManagedObjectReference");
    }

    public void renameSnapshot(final ManagedObjectReference _this, final String name, final String description) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("name", "String", name);
        paras[2] = new Argument("description", "String", description);
        wsc.invoke("RenameSnapshot", paras, null);
    }

    public ManagedObjectReference exportSnapshot(final ManagedObjectReference _this) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[1];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        return (ManagedObjectReference) wsc.invoke("ExportSnapshot", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference checkCompatibility_Task(final ManagedObjectReference _this, final ManagedObjectReference vm, final ManagedObjectReference host, final ManagedObjectReference pool, final String[] testType) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("host", "ManagedObjectReference", host);
        paras[3] = new Argument("pool", "ManagedObjectReference", pool);
        paras[4] = new Argument("testType", "String[]", testType);
        return (ManagedObjectReference) wsc.invoke("CheckCompatibility_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference queryVMotionCompatibilityEx_Task(final ManagedObjectReference _this, final ManagedObjectReference[] vm, final ManagedObjectReference[] host) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference[]", vm);
        paras[2] = new Argument("host", "ManagedObjectReference[]", host);
        return (ManagedObjectReference) wsc.invoke("QueryVMotionCompatibilityEx_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference checkMigrate_Task(final ManagedObjectReference _this, final ManagedObjectReference vm, final ManagedObjectReference host, final ManagedObjectReference pool, final VirtualMachinePowerState state, final String[] testType) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("host", "ManagedObjectReference", host);
        paras[3] = new Argument("pool", "ManagedObjectReference", pool);
        paras[4] = new Argument("state", "VirtualMachinePowerState", state);
        paras[5] = new Argument("testType", "String[]", testType);
        return (ManagedObjectReference) wsc.invoke("CheckMigrate_Task", paras, "ManagedObjectReference");
    }

    public ManagedObjectReference checkRelocate_Task(final ManagedObjectReference _this, final ManagedObjectReference vm, final VirtualMachineRelocateSpec spec, final String[] testType) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("spec", "VirtualMachineRelocateSpec", spec);
        paras[3] = new Argument("testType", "String[]", testType);
        return (ManagedObjectReference) wsc.invoke("CheckRelocate_Task", paras, "ManagedObjectReference");
    }

    public void validateCredentialsInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        wsc.invoke("ValidateCredentialsInGuest", paras, null);
    }

    public GuestAuthentication acquireCredentialsInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication requestedAuth, final long sessionID) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("requestedAuth", "GuestAuthentication", requestedAuth);
        paras[3] = new Argument("sessionID", "long", sessionID);
        return (GuestAuthentication) wsc.invoke("AcquireCredentialsInGuest", paras, "GuestAuthentication");
    }

    public void releaseCredentialsInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[3];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        wsc.invoke("ReleaseCredentialsInGuest", paras, null);
    }

    public void makeDirectoryInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String directoryPath, final boolean createParentDirectories) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("directoryPath", "String", directoryPath);
        paras[4] = new Argument("createParentDirectories", "boolean", createParentDirectories);
        wsc.invoke("MakeDirectoryInGuest", paras, null);
    }

    public void deleteFileInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String filePath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("filePath", "String", filePath);
        wsc.invoke("DeleteFileInGuest", paras, null);
    }

    public void deleteDirectoryInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String directoryPath, final boolean recursive) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("directoryPath", "String", directoryPath);
        paras[4] = new Argument("recursive", "boolean", recursive);
        wsc.invoke("DeleteDirectoryInGuest", paras, null);
    }

    public void moveDirectoryInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String srcDirectoryPath, final String dstDirectoryPath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("srcDirectoryPath", "String", srcDirectoryPath);
        paras[4] = new Argument("dstDirectoryPath", "String", dstDirectoryPath);
        wsc.invoke("MoveDirectoryInGuest", paras, null);
    }

    public void moveFileInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String srcFilePath, final String dstFilePath, final boolean overwrite) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("srcFilePath", "String", srcFilePath);
        paras[4] = new Argument("dstFilePath", "String", dstFilePath);
        paras[5] = new Argument("overwrite", "boolean", overwrite);
        wsc.invoke("MoveFileInGuest", paras, null);
    }

    public String createTemporaryFileInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String prefix, final String suffix, final String directoryPath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("prefix", "String", prefix);
        paras[4] = new Argument("suffix", "String", suffix);
        paras[5] = new Argument("directoryPath", "String", directoryPath);
        return (String) wsc.invoke("CreateTemporaryFileInGuest", paras, "String");
    }

    public String createTemporaryDirectoryInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String prefix, final String suffix, final String directoryPath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[6];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("prefix", "String", prefix);
        paras[4] = new Argument("suffix", "String", suffix);
        paras[5] = new Argument("directoryPath", "String", directoryPath);
        return (String) wsc.invoke("CreateTemporaryDirectoryInGuest", paras, "String");
    }

    public GuestListFileInfo listFilesInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String filePath, final int index, final int maxResults, final String matchPattern) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[7];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("filePath", "String", filePath);
        paras[4] = new Argument("index", "int", index);
        paras[5] = new Argument("maxResults", "int", maxResults);
        paras[6] = new Argument("matchPattern", "String", matchPattern);
        return (GuestListFileInfo) wsc.invoke("ListFilesInGuest", paras, "GuestListFileInfo");
    }

    public void changeFileAttributesInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String guestFilePath, final GuestFileAttributes fileAttributes) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[5];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("guestFilePath", "String", guestFilePath);
        paras[4] = new Argument("fileAttributes", "GuestFileAttributes", fileAttributes);
        wsc.invoke("ChangeFileAttributesInGuest", paras, null);
    }

    public FileTransferInformation initiateFileTransferFromGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String guestFilePath) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("guestFilePath", "String", guestFilePath);
        return (FileTransferInformation) wsc.invoke("InitiateFileTransferFromGuest", paras, "FileTransferInformation");
    }

    public String initiateFileTransferToGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String guestFilePath, final GuestFileAttributes fileAttributes, final long fileSize, final boolean overwrite) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[7];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("guestFilePath", "String", guestFilePath);
        paras[4] = new Argument("fileAttributes", "GuestFileAttributes", fileAttributes);
        paras[5] = new Argument("fileSize", "long", fileSize);
        paras[6] = new Argument("overwrite", "boolean", overwrite);
        return (String) wsc.invoke("InitiateFileTransferToGuest", paras, "String");
    }

    public long startProgramInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final GuestProgramSpec spec) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("spec", "GuestProgramSpec", spec);
        return (Long) wsc.invoke("StartProgramInGuest", paras, "long");
    }

    public GuestProcessInfo[] listProcessesInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final long[] pids) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("pids", "long[]", pids);
        return (GuestProcessInfo[]) wsc.invoke("ListProcessesInGuest", paras, "GuestProcessInfo[]");
    }

    public void terminateProcessInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final long pid) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("pid", "long", pid);
        wsc.invoke("TerminateProcessInGuest", paras, null);
    }

    public String[] readEnvironmentVariableInGuest(final ManagedObjectReference _this, final ManagedObjectReference vm, final GuestAuthentication auth, final String[] names) throws java.rmi.RemoteException {
        final Argument[] paras = new Argument[4];
        paras[0] = new Argument("_this", "ManagedObjectReference", _this);
        paras[1] = new Argument("vm", "ManagedObjectReference", vm);
        paras[2] = new Argument("auth", "GuestAuthentication", auth);
        paras[3] = new Argument("names", "String[]", names);
        return (String[]) wsc.invoke("ReadEnvironmentVariableInGuest", paras, "String[]");
    }

}
