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

/**
 * A subset of virtual machine configuration.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 6.9.1
 */

@SuppressWarnings("all")
public class VirtualMachineConfigSummary extends DynamicData {

    private String annotation;
    private Integer cpuReservation;
    private FaultToleranceConfigInfo ftInfo;
    private String guestFullName;
    private String guestId;
    private String hwVersion;
    private Boolean installBootRequired;
    private String instanceUuid;
    private ManagedByInfo managedBy;
    private Integer memoryReservation;
    private Integer memorySizeMB;
    private String name;
    private Integer numCpu;
    private Integer numEthernetCards;
    private Integer numVirtualDisks;
    private Integer numVmiopBackings;
    private VAppProductInfo product;
    private boolean template;
    private Boolean tpmPresent;
    private String uuid;
    private String vmPathName;

    @Override
    public String toString() {
        return "VirtualMachineConfigSummary{" +
                "annotation='" + annotation + '\'' +
                ", cpuReservation=" + cpuReservation +
                ", ftInfo=" + ftInfo +
                ", guestFullName='" + guestFullName + '\'' +
                ", guestId='" + guestId + '\'' +
                ", hwVersion='" + hwVersion + '\'' +
                ", installBootRequired=" + installBootRequired +
                ", instanceUuid='" + instanceUuid + '\'' +
                ", managedBy=" + managedBy +
                ", memoryReservation=" + memoryReservation +
                ", memorySizeMB=" + memorySizeMB +
                ", name='" + name + '\'' +
                ", numCpu=" + numCpu +
                ", numEthernetCards=" + numEthernetCards +
                ", numVirtualDisks=" + numVirtualDisks +
                ", numVmiopBackings=" + numVmiopBackings +
                ", product=" + product +
                ", template=" + template +
                ", tpmPresent=" + tpmPresent +
                ", uuid='" + uuid + '\'' +
                ", vmPathName='" + vmPathName + '\'' +
                "} " + super.toString();
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(final String annotation) {
        this.annotation = annotation;
    }

    public Integer getCpuReservation() {
        return cpuReservation;
    }

    public void setCpuReservation(final Integer cpuReservation) {
        this.cpuReservation = cpuReservation;
    }

    public FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }

    public void setFtInfo(final FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public void setGuestFullName(final String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(final String guestId) {
        this.guestId = guestId;
    }

    public Boolean getInstallBootRequired() {
        return installBootRequired;
    }

    public void setInstallBootRequired(final Boolean installBootRequired) {
        this.installBootRequired = installBootRequired;
    }

    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(final String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public ManagedByInfo getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(final ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    public void setMemoryReservation(final Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public Integer getMemorySizeMB() {
        return memorySizeMB;
    }

    public void setMemorySizeMB(final Integer memorySizeMB) {
        this.memorySizeMB = memorySizeMB;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getNumCpu() {
        return numCpu;
    }

    public void setNumCpu(final Integer numCpu) {
        this.numCpu = numCpu;
    }

    public Integer getNumEthernetCards() {
        return numEthernetCards;
    }

    public void setNumEthernetCards(final Integer numEthernetCards) {
        this.numEthernetCards = numEthernetCards;
    }

    public Integer getNumVirtualDisks() {
        return numVirtualDisks;
    }

    public void setNumVirtualDisks(final Integer numVirtualDisks) {
        this.numVirtualDisks = numVirtualDisks;
    }

    public Integer getNumVmiopBackings() {
        return numVmiopBackings;
    }

    public void setNumVmiopBackings(final Integer numVmiopBackings) {
        this.numVmiopBackings = numVmiopBackings;
    }

    public VAppProductInfo getProduct() {
        return product;
    }

    public void setProduct(final VAppProductInfo product) {
        this.product = product;
    }

    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(final boolean template) {
        this.template = template;
    }

    public Boolean getTpmPresent() {
        return tpmPresent;
    }

    public void setTpmPresent(final Boolean tpmPresent) {
        this.tpmPresent = tpmPresent;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(final String uuid) {
        this.uuid = uuid;
    }

    public String getVmPathName() {
        return vmPathName;
    }

    public void setVmPathName(final String vmPathName) {
        this.vmPathName = vmPathName;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(final String hwVersion) {
        this.hwVersion = hwVersion;
    }
}
