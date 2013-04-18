package org.aerogear.connectivity.api;

import java.util.List;

/**
 * Abstraction of a mobile application 
 *  (e.g. iOS, Android Application or Mobile Web(JS)).
 * 
 * One instance of this type represents EXACTLY one application
 * (e.g. Twitter-iOS What's App-Android)
 * 
 */
public interface MobileApplication {
    // some name/desc....
    void setName(String name);
    String getName();
    void setDescription(String description);
    String getDescription();

    /**
     * Returns a generated ID to represent this mobile application.
     * The ID can be used to send messages to a single mobile app
     * (e.g. only iOS users receive a push message)
     */
    String getAeroGearMobileAppId();

    /**
     * Returns complete list of all installed instances 
     * of this mobile application 
     */
    List<MobileApplicationInstance> getInstances();
    void addInstance(MobileApplicationInstance instance);
    void removeInstance(MobileApplicationInstance instance);

}