/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.ejb;

import com.cme.entity.SubscriptionPortal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hp
 */
@Stateless
public class SubscriptionPortalFacade extends AbstractFacade<SubscriptionPortal> {
    @PersistenceContext(unitName = "TagSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubscriptionPortalFacade() {
        super(SubscriptionPortal.class);
    }
    
    public List<SubscriptionPortal> getSubscriberByStatus(String sts){
        SubscriptionPortal result = null;
        Query q = em.createNamedQuery("SubscriptionPortal.findByStatus").setParameter("status", sts);
        List<SubscriptionPortal> res = q.getResultList();
        return res;
    }
}
