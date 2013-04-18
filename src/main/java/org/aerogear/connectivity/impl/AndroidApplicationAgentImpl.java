package org.aerogear.connectivity.impl;

public class AndroidApplicationAgentImpl extends AbstractMobileApplicationAgentImpl {
    private static final long serialVersionUID = -7013739724384786353L;

    private String googleAPIKey;
    
    
    public AndroidApplicationAgentImpl(String loginName) {
        super(loginName);
        // TODO Auto-generated constructor stub
    }

    /**
     * API key, from the Google API console. Required to submit messages to the Google Cloud Messaging System.
     */
    public void setGoogleAPIKey(String googleAPIKey) {
        this.googleAPIKey = googleAPIKey;
    }
    public String getGoogleAPIKey() {
        return googleAPIKey;
    }
}
