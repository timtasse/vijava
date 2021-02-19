package com.vmware.vim25;

/**
 * Detailed information about a vSAN datastore.
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 7.0.1
 */
public class VsanDatastoreInfo extends DatastoreInfo {

    private String membershipUuid;
    private Integer accessGenNo;

    @Override
    public String toString() {
        return "VsanDatastoreInfo{" +
                "membershipUuid='" + membershipUuid + '\'' +
                ", accessGenNo=" + accessGenNo +
                "} " + super.toString();
    }

    public String getMembershipUuid() {
        return membershipUuid;
    }

    public void setMembershipUuid(final String membershipUuid) {
        this.membershipUuid = membershipUuid;
    }

    public Integer getAccessGenNo() {
        return accessGenNo;
    }

    public void setAccessGenNo(final Integer accessGenNo) {
        this.accessGenNo = accessGenNo;
    }

}
