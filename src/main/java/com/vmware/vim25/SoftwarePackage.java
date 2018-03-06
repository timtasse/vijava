package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class SoftwarePackage extends DynamicData {

    public String acceptanceLevel;
    public SoftwarePackageCapability capability;
    public Relation[] conflicts;
    public Calendar creationDate;
    public Relation[] depends;
    public String description;
    public String[] hardwarePlatformsRequired;
    public Boolean maintenanceModeRequired;
    public String name;
    public String[] payload;
    public String[] provides;
    public String[] referenceURL;
    public Relation[] replaces;
    public String summary;
    public String[] tag;
    public String type;
    public String vendor;
    public String version;

    public String getAcceptanceLevel() {
        return acceptanceLevel;
    }

    public void setAcceptanceLevel(final String acceptanceLevel) {
        this.acceptanceLevel = acceptanceLevel;
    }

    public SoftwarePackageCapability getCapability() {
        return capability;
    }

    public void setCapability(final SoftwarePackageCapability capability) {
        this.capability = capability;
    }

    public Relation[] getConflicts() {
        return conflicts;
    }

    public void setConflicts(final Relation[] conflicts) {
        this.conflicts = conflicts;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public Relation[] getDepends() {
        return depends;
    }

    public void setDepends(final Relation[] depends) {
        this.depends = depends;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String[] getHardwarePlatformsRequired() {
        return hardwarePlatformsRequired;
    }

    public void setHardwarePlatformsRequired(final String[] hardwarePlatformsRequired) {
        this.hardwarePlatformsRequired = hardwarePlatformsRequired;
    }

    public Boolean isMaintenanceModeRequired() {
        return maintenanceModeRequired;
    }

    public void setMaintenanceModeRequired(final Boolean maintenanceModeRequired) {
        this.maintenanceModeRequired = maintenanceModeRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String[] getPayload() {
        return payload;
    }

    public void setPayload(final String[] payload) {
        this.payload = payload;
    }

    public String[] getProvides() {
        return provides;
    }

    public void setProvides(final String[] provides) {
        this.provides = provides;
    }

    public String[] getReferenceURL() {
        return referenceURL;
    }

    public void setReferenceURL(final String[] referenceURL) {
        this.referenceURL = referenceURL;
    }

    public Relation[] getReplaces() {
        return replaces;
    }

    public void setReplaces(final Relation[] replaces) {
        this.replaces = replaces;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(final String[] tag) {
        this.tag = tag;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(final String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }
}
