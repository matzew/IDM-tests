package org.aerogear.connectivity.impl;

import java.util.ArrayList;
import java.util.List;

import org.aerogear.connectivity.api.MobileApplication;
import org.aerogear.connectivity.api.PushApplication;
import org.picketlink.idm.model.SimpleAgent;

public class PushApplicationAgentImpl extends SimpleAgent implements PushApplication {
    private static final long serialVersionUID = 998326609653004025L;

    private String name;
    private String description;
    List<MobileApplication> mobileApplications;

    public PushApplicationAgentImpl() {
        super(null);
        mobileApplications = new ArrayList<MobileApplication>();
    }
    
    // hrm.... why the "login name"....
    public PushApplicationAgentImpl(String loginName) {
        this();
        name = loginName; // we abuse the login name... it's really just the app name
    }

    @Override
    public void setName(String name) {
        this.name = name;
        
        // looks like I HAVE to use the "login name" :-(
        this.setLoginName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getApplicationKey() {
        return getId(); // this UUID could be used as the "application ID"
    }

    @Override
    public List<MobileApplication> getMobileApplications() {
        return mobileApplications;
    }

    @Override
    public void addMobileApplication(MobileApplication mobileApp) {
        mobileApplications.add(mobileApp);
    }

    @Override
    public void removeMobileApplication(MobileApplication mobileApp) {
        mobileApplications.remove(mobileApp);
    }
}
