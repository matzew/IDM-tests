package org.aerogear.connectivity.rest.registry;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.aerogear.connectivity.api.MobileInstallationAgent;
import org.picketlink.idm.model.Agent;
import org.picketlink.idm.model.Attribute;
import org.picketlink.idm.IdentityManager;

@Stateless // I need transactions.....
public class NewInstallationRegistration {
    
    @Inject
    private IdentityManager identityManager;  
    
    
    public void newDevice(Map map) {
        
        // read (and remove) the REQUIRED values from the 'JSON':
        String token = (String) map.remove("token");
        // HACK.... so that I can REUSE the same CURL POST request :)))))
        token = UUID.randomUUID().toString();
        
        
        String os = (String) map.remove("os");
        String type = (String) map.remove("type");
        String version = (String) map.remove("version");
        
        // store all the required data, on the MobileInstallationAgent
        MobileInstallationAgent device = (MobileInstallationAgent) createMobileAgent(token);
        device.setDeviceType(type);
        device.setMobileOperatingSystem(os);
        device.setVersion(version);
        
        
        // now apply custom data, from the missing keys:
        Set allTheKeys = map.keySet();
        for (Object key : allTheKeys) {
            String sKey = (String) key;
            
            // onlu flat data....
             String value = (String) map.get(sKey);

            
            System.out.println("\n\n\n\n\n+++++");
            System.out.println("     "   + sKey + ":" + value);
            System.out.println("+++++\n\n\n\n\n");
            
            // store on the device
            device.setAttribute(new Attribute<String>(sKey, value));
        }


        // update
        identityManager.update(device);
    }
    
    // technical code.... : 
    protected Agent createMobileAgent(String token) {
        Agent agent = identityManager.getAgent(token);

        if (agent != null) {
            identityManager.remove(agent);
            agent = null;
        }
        agent = new MobileInstallationAgent(token);
        identityManager.add(agent);
        return agent;
    }
}
