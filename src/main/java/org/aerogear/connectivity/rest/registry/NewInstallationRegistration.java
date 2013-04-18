package org.aerogear.connectivity.rest.registry;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.aerogear.connectivity.api.MobileInstallationAgent;
import org.picketlink.idm.IdentityManager;

@Stateless // I need transactions.....
public class NewInstallationRegistration {
    
    @Inject
    private IdentityManager identityManager;  
    
    
    public void newDevice(MobileInstallationAgent agent) {
        
        // add the new installation
        identityManager.add(agent);
    }
    
}
