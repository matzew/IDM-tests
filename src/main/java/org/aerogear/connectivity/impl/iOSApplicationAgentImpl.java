package org.aerogear.connectivity.impl;


public class iOSApplicationAgentImpl extends AbstractMobileApplicationAgentImpl {
    private static final long serialVersionUID = 4195668565639512553L;
    
    private String appleAppId;
    private String certificate;
    private String passphrase;

    public iOSApplicationAgentImpl(String loginName) {
        super(loginName);
    }
    
    
    /**
     * The Apple APP-ID, from the provisioning portal 
     */
    public void setAppleAppId(String appId) {
        this.appleAppId = appId;
    }

    public String getAppleAppId() {
        return this.appleAppId;
    }

    /**
     * The exported .p12 file from the Apple Developer portal. The file is required for establishing an APNs connection .
     */
    public void setCertificate(String pathToP12File) {
        this.certificate = pathToP12File;
    }
    public String getCertificate() {
        return certificate;
    }
    
    /**
     * Passpharase for the {@link setCertificate}. The pass phrase is required for establishing an APNs connection;
     */
    public void setPassphrase(String topsecret) {
        this.passphrase = topsecret;
    }
    public String getPassphrase() {
        return passphrase;
    }
}
