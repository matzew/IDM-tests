package org.aerogear.connectivity.rest.registry;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.aerogear.connectivity.api.PushApplication;
import org.aerogear.connectivity.impl.MobileInstallationAgentImpl;
import org.aerogear.connectivity.impl.PushApplicationAgentImpl;
import org.picketlink.idm.IdentityManager;

@Stateless // I need transactions.....
public class PushServerRegistry {
    
    @Inject
    private IdentityManager identityManager;  
    
    
    
    
    public PushApplication newPushApplication(PushApplicationAgentImpl app) {
        identityManager.add(app);
        
        return app;
    }
    
    
    public void newDevice(MobileInstallationAgentImpl agent) {
        
        // add the new installation
        identityManager.add(agent);
    }
    
}
