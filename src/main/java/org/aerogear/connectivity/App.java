package org.aerogear.connectivity;

import java.util.Map;

import org.aerogear.connectivity.rest.registry.NewInstallationRegistration;
import org.jboss.aerogear.controller.router.AbstractRoutingModule;
import org.jboss.aerogear.controller.router.RequestMethod;

/**
 * Hello world!
 *
 */
public class App extends AbstractRoutingModule 
{

    @Override
    public void configuration() throws Exception {
        route()
            .from("/registry/device")
            .on(RequestMethod.POST)
            .consumes(JSON)
            .produces(JSON)
            .to(NewInstallationRegistration.class).newDevice(param(Map.class));
    }
}