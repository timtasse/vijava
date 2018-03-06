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
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk
 * @version 6.7
 */
public enum VirtualMachineGuestOsIdentifier {

    asianux3Guest("asianux3Guest"),
    asianux3_64Guest("asianux3_64Guest"),
    asianux4Guest("asianux4Guest"),
    asianux4_64Guest("asianux4_64Guest"),
    asianux5_64Guest("asianux5_64Guest"),
    asianux7_64Guest("asianux7_64Guest"),
    asianux8_64Guest("asianux8_64Guest"),
    centos6_64Guest("centos6_64Guest"),
    centos64Guest("centos64Guest"),
    centos6Guest("centos6Guest"),
    centos7_64Guest("centos7_64Guest"),
    centos7Guest("centos7Guest"),
    centos8_64Guest("centos8_64Guest"),
    centosGuest("centosGuest"),
    coreos64Guest("coreos64Guest"),
    darwin10Guest("darwin10Guest"),
    darwin10_64Guest("darwin10_64Guest"),
    darwin11Guest("darwin11Guest"),
    darwin11_64Guest("darwin11_64Guest"),
    darwin12_64Guest("darwin12_64Guest"),
    darwin13_64Guest("darwin13_64Guest"),
    darwin14_64Guest("darwin14_64Guest"),
    darwin15_64Guest("darwin15_64Guest"),
    darwin16_64Guest("darwin16_64Guest"),
    darwin17_64Guest("darwin17_64Guest"),
    darwin18_64Guest("darwin18_64Guest"),
    darwin64Guest("darwin64Guest"),
    darwinGuest("darwinGuest"),
    debian10_64Guest("debian10_64Guest"),
    debian10Guest("debian10Guest"),
    debian4Guest("debian4Guest"),
    debian4_64Guest("debian4_64Guest"),
    debian5Guest("debian5Guest"),
    debian5_64Guest("debian5_64Guest"),
    debian6Guest("debian6Guest"),
    debian6_64Guest("debian6_64Guest"),
    debian7Guest("debian7Guest"),
    debian7_64Guest("debian7_64Guest"),
    debian8_64Guest("debian8_64Guest"),
    debian8Guest("debian8Guest"),
    debian9_64Guest("debian9_64Guest"),
    debian9Guest("debian9Guest"),
    dosGuest("dosGuest"),
    eComStation2Guest("eComStation2Guest"),
    eComStationGuest("eComStationGuest"),
    fedora64Guest("fedora64Guest"),
    fedoraGuest("fedoraGuest"),
    freebsd11_64Guest("freebsd11_64Guest"),
    freebsd11Guest("freebsd11Guest"),
    freebsd12_64Guest("freebsd12_64Guest"),
    freebsd12Guest("freebsd12Guest"),
    freebsd64Guest("freebsd64Guest"),
    freebsdGuest("freebsdGuest"),
    genericLinuxGuest("genericLinuxGuest"),
    mandrakeGuest("mandrakeGuest"),
    mandriva64Guest("mandriva64Guest"),
    mandrivaGuest("mandrivaGuest"),
    netware4Guest("netware4Guest"),
    netware5Guest("netware5Guest"),
    netware6Guest("netware6Guest"),
    nld9Guest("nld9Guest"),
    oesGuest("oesGuest"),
    openServer5Guest("openServer5Guest"),
    openServer6Guest("openServer6Guest"),
    opensuse64Guest("opensuse64Guest"),
    opensuseGuest("opensuseGuest"),
    oracleLinux6_64Guest("oracleLinux6_64Guest"),
    oracleLinux6Guest("oracleLinux6Guest"),
    oracleLinux7_64Guest("oracleLinux7_64Guest"),
    oracleLinux7Guest("oracleLinux7Guest"),
    oracleLinux8_64Guest("oracleLinux8_64Guest"),
    oracleLinux64Guest("oracleLinux64Guest"),
    oracleLinuxGuest("oracleLinuxGuest"),
    os2Guest("os2Guest"),
    other24xLinux64Guest("other24xLinux64Guest"),
    other24xLinuxGuest("other24xLinuxGuest"),
    other26xLinux64Guest("other26xLinux64Guest"),
    other26xLinuxGuest("other26xLinuxGuest"),
    other3xLinux64Guest("other3xLinux64Guest"),
    other3xLinuxGuest("other3xLinuxGuest"),
    other4xLinux64Guest("other4xLinux64Guest"),
    other4xLinuxGuest("other4xLinuxGuest"),
    otherGuest("otherGuest"),
    otherGuest64("otherGuest64"),
    otherLinux64Guest("otherLinux64Guest"),
    otherLinuxGuest("otherLinuxGuest"),
    redhatGuest("redhatGuest"),
    rhel2Guest("rhel2Guest"),
    rhel3Guest("rhel3Guest"),
    rhel3_64Guest("rhel3_64Guest"),
    rhel4Guest("rhel4Guest"),
    rhel4_64Guest("rhel4_64Guest"),
    rhel5Guest("rhel5Guest"),
    rhel5_64Guest("rhel5_64Guest"),
    rhel6Guest("rhel6Guest"),
    rhel6_64Guest("rhel6_64Guest"),
    rhel7Guest("rhel7Guest"),
    rhel7_64Guest("rhel7_64Guest"),
    rhel8_64Guest("rhel8_64Guest"),
    sjdsGuest("sjdsGuest"),
    sles10Guest("sles10Guest"),
    sles10_64Guest("sles10_64Guest"),
    sles11Guest("sles11Guest"),
    sles11_64Guest("sles11_64Guest"),
    sles12Guest("sles12Guest"),
    sles12_64Guest("sles12_64Guest"),
    sles15_64Guest("sles15_64Guest"),
    sles64Guest("sles64Guest"),
    slesGuest("slesGuest"),
    solaris10Guest("solaris10Guest"),
    solaris10_64Guest("solaris10_64Guest"),
    solaris11_64Guest("solaris11_64Guest"),
    solaris6Guest("solaris6Guest"),
    solaris7Guest("solaris7Guest"),
    solaris8Guest("solaris8Guest"),
    solaris9Guest("solaris9Guest"),
    suse64Guest("suse64Guest"),
    suseGuest("suseGuest"),
    turboLinux64Guest("turboLinux64Guest"),
    turboLinuxGuest("turboLinuxGuest"),
    ubuntu64Guest("ubuntu64Guest"),
    ubuntuGuest("ubuntuGuest"),
    unixWare7Guest("unixWare7Guest"),
    vmkernel5Guest("vmkernel5Guest"),
    vmkernel6Guest("vmkernel6Guest"),
    vmkernel65Guest("vmkernel65Guest"),
    vmkernelGuest("vmkernelGuest"),
    vmwarePhoton64Guest("vmwarePhoton64Guest"),
    win2000AdvServGuest("win2000AdvServGuest"),
    win2000ProGuest("win2000ProGuest"),
    win2000ServGuest("win2000ServGuest"),
    win31Guest("win31Guest"),
    win95Guest("win95Guest"),
    win98Guest("win98Guest"),
    windows7Guest("windows7Guest"),
    windows7Server64Guest("windows7Server64Guest"),
    windows7_64Guest("windows7_64Guest"),
    windows8Guest("windows8Guest"),
    windows8Server64Guest("windows8Server64Guest"),
    windows8_64Guest("windows8_64Guest"),
    windows9Guest("windows9Guest"),
    windows9Server64Guest("windows9Server64Guest"),
    windows9_64Guest("windows9_64Guest"),
    windowsHyperVGuest("windowsHyperVGuest"),
    winLonghorn64Guest("winLonghorn64Guest"),
    winLonghornGuest("winLonghornGuest"),
    winMeGuest("winMeGuest"),
    winNetBusinessGuest("winNetBusinessGuest"),
    winNetDatacenter64Guest("winNetDatacenter64Guest"),
    winNetDatacenterGuest("winNetDatacenterGuest"),
    winNetEnterprise64Guest("winNetEnterprise64Guest"),
    winNetEnterpriseGuest("winNetEnterpriseGuest"),
    winNetStandard64Guest("winNetStandard64Guest"),
    winNetStandardGuest("winNetStandardGuest"),
    winNetWebGuest("winNetWebGuest"),
    winNTGuest("winNTGuest"),
    winVista64Guest("winVista64Guest"),
    winVistaGuest("winVistaGuest"),
    winXPHomeGuest("winXPHomeGuest"),
    winXPPro64Guest("winXPPro64Guest"),
    winXPProGuest("winXPProGuest");

    @SuppressWarnings("unused")
    private final String val;

    VirtualMachineGuestOsIdentifier(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}