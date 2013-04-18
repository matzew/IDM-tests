package org.aerogear.connectivity.impl;

import java.util.ArrayList;
import java.util.List;

import org.aerogear.connectivity.api.MobileApplication;
import org.aerogear.connectivity.api.MobileApplicationInstance;
import org.picketlink.idm.model.SimpleAgent;

public class AbstractMobileApplicationAgentImpl extends SimpleAgent implements MobileApplication {
    private static final long serialVersionUID = 6311178297480629017L;
    
    private String aeroGearMobileAppId;
    private String name;
    private String description;
    private ArrayList<MobileApplicationInstance> instances;
    

    public AbstractMobileApplicationAgentImpl(String loginName) {
        super(loginName);
        instances = new ArrayList<MobileApplicationInstance>();
    }

    @Override
    public String getAeroGearMobileAppId() {
        return aeroGearMobileAppId;
    }

    @Override
    public List<MobileApplicationInstance> getInstances() {
        return instances;
    }

    @Override
    public void addInstance(MobileApplicationInstance instance) {
        instances.add(instance);
    }

    @Override
    public void removeInstance(MobileApplicationInstance instance) {
        instances.remove(instance);
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
}
