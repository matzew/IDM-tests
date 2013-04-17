package org.aerogear.connectivity.api;

import org.picketlink.idm.model.SimpleAgent;

public class MobileInstallationAgent extends SimpleAgent {
    private static final long serialVersionUID = -3285130123666661337L;
    private String deviceToken;
    private String mobileOperatingSystem;
    private String deviceType;
    private String version;
    
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

}
