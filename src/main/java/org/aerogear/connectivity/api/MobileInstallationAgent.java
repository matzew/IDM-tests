package org.aerogear.connectivity.api;

import org.picketlink.idm.model.SimpleAgent;

public class MobileInstallationAgent extends SimpleAgent {
    private static final long serialVersionUID = -8250236704677368805L;
    private String deviceToken;
    private String mobileOperatingSystem;
    private String deviceType;
    private String version;
    // NOT sure if that really fits in here...
    // IF the app has a user concept, the push needs
    // to bridge between real app and push database
    // 
    // introducing an OPTIONAL clientIdentifier:
    private String clientIdentifier;
    
    
    public MobileInstallationAgent(String deviceToken) {
        super(deviceToken); // this is the "login name";
        this.deviceToken = deviceToken;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getMobileOperatingSystem() {
        return mobileOperatingSystem;
    }

    public void setMobileOperatingSystem(String mobileOperatingSystem) {
        this.mobileOperatingSystem = mobileOperatingSystem;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

}
