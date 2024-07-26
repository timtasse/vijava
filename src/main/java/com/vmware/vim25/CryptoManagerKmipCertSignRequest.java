package com.vmware.vim25;

/**
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.1
 */
@SuppressWarnings("unused")
public class CryptoManagerKmipCertSignRequest extends DynamicData {

    private String commonName;
    private String organization;
    private String organizationUnit;
    private String locality;
    private String state;
    private String country;
    private String email;

    @Override
    public String toString() {
        return "CryptoManagerKmipCertSignRequest{" +
                "commonName='" + commonName + '\'' +
                ", organization='" + organization + '\'' +
                ", organizationUnit='" + organizationUnit + '\'' +
                ", locality='" + locality + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(final String commonName) {
        this.commonName = commonName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(final String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(final String locality) {
        this.locality = locality;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

}
