package org.aerogear.connectivity;

import org.aerogear.connectivity.impl.MobileInstallationAgentImpl;
import org.aerogear.connectivity.impl.PushApplicationAgentImpl;
import org.aerogear.connectivity.rest.registry.PushServerRegistry;
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
            .from("/applications")
            .on(RequestMethod.POST)
            .consumes(JSON)
            .produces(JSON)
            .to(PushServerRegistry.class).newPushApplication(param(PushApplicationAgentImpl.class));





//        route()
//            .from("/registry/device")
//            .on(RequestMethod.POST)
//            .consumes(JSON)
//            .produces(JSON)
//            .to(PushServerRegistry.class).newDevice(param(MobileInstallationAgentImpl.class));
//        
        
    }
}
