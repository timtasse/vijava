package com.vmware.vim25;

/**
 * Represents certificate specification used for identifying a specific certificate supported by Host
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 8.0.1
 */
@SuppressWarnings("unused")
public class HostCertificateManagerCertificateSpec extends DynamicData {

    private HostCertificateManagerCertificateKind kind;

    @Override
    public String toString() {
        return "HostCertificateManagerCertificateSpec{" +
                "kind=" + kind +
                '}';
    }

    public HostCertificateManagerCertificateKind getKind() {
        return kind;
    }

    public void setKind(final HostCertificateManagerCertificateKind kind) {
        this.kind = kind;
    }

}
