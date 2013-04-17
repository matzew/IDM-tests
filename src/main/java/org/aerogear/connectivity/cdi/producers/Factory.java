package org.aerogear.connectivity.cdi.producers;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.picketlink.annotations.PicketLink;

// CDI factory bits...
public class Factory {
    
    @SuppressWarnings("unused")
    @Produces
    @PicketLink
    @PersistenceContext(unitName = "picketlink-default")
    private EntityManager picketLinkEntityManager;
}
