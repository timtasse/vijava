package com.vmware.vim25;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class KmipServerInfo extends DynamicData {

    public String address;
    public String name;
    public Integer nbio;
    public int port;
    public String protocol;
    public String proxyAddress;
    public Integer proxyPort;
    public Integer reconnect;
    public Integer timeout;
    public String userName;

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getNbio() {
        return nbio;
    }

    public void setNbio(final int nbio) {
        this.nbio = nbio;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    public String getProxyAddress() {
        return proxyAddress;
    }

    public void setProxyAddress(final String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(final int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public int getReconnect() {
        return reconnect;
    }

    public void setReconnect(final int reconnect) {
        this.reconnect = reconnect;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(final int timeout) {
        this.timeout = timeout;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }
}
