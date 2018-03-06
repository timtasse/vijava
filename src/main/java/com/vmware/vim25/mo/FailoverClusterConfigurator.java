package com.vmware.vim25.mo;

import com.vmware.vim25.ManagedObjectReference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stefan Dilk {@literal <stefan.dilk@freenet.ag>} on 05.04.2018
 *
 * @author Stefan Dilk <stefan.dilk@freenet.ag>
 * @since 6.5
 */
public class FailoverClusterConfigurator extends ManagedObject {

    /**
     * Constructor that reuse exiting web service connection
     * Use this contructor when you can re-use existing web service connection.
     *
     * @param serverConnection
     * @param mor
     */
    public FailoverClusterConfigurator(final ServerConnection serverConnection, final ManagedObjectReference mor) {
        super(serverConnection, mor);
    }

    public List<String> disabledConfigureMethod() {
        final String[] disabledConfigureMethods = (String[]) getCurrentProperty("disabledConfigureMethod");
        return Arrays.asList(disabledConfigureMethods);
    }

    // TODO: Implement Methods
}
