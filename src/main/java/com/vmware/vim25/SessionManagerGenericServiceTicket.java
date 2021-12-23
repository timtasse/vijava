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
 * This data object represents a ticket which grants access to some service.
 * The ticket may be used only once and is valid only for the {@see SessionManagerServiceRequestSpec} with which it was acquired.
 * For HTTP service requests (when spec is of type HttpServiceRequestSpec) the returned ticket must be used by setting id
 * as the value of a special cookie in the HTTP request.
 * For CGI requests the name of this cookie is 'vmware_cgi_ticket'.
 * The use of the returned ticket for other services is to be defined.
 *
 * @author Steve Jin (http://www.doublecloud.org)
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @version 7.0.2
 * @since 5.0
 */
@SuppressWarnings("unused")
public class SessionManagerGenericServiceTicket extends DynamicData {

    private String id;
    private String hostName;
    private String sslThumbprint;
    private SessionManagerGenericServiceTicketTicketType ticketType;

    @Override
    public String toString() {
        return "SessionManagerGenericServiceTicket{" +
                "id='" + id + '\'' +
                ", hostName='" + hostName + '\'' +
                ", sslThumbprint='" + sslThumbprint + '\'' +
                ", ticketType=" + ticketType +
                '}';
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(final String hostName) {
        this.hostName = hostName;
    }

    public String getSslThumbprint() {
        return this.sslThumbprint;
    }

    public void setSslThumbprint(final String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    public SessionManagerGenericServiceTicketTicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(final SessionManagerGenericServiceTicketTicketType ticketType) {
        this.ticketType = ticketType;
    }

}
