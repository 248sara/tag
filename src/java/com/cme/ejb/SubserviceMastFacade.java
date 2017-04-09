/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.ejb;

import com.cme.entity.ServiceType;
import com.cme.entity.SubserviceMast;
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
public class SubserviceMastFacade extends AbstractFacade<SubserviceMast> {
    @PersistenceContext(unitName = "TagSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubserviceMastFacade() {
        super(SubserviceMast.class);
    }
    
    public List<SubserviceMast> getPortalServices(String ssrv){
        List<SubserviceMast> result;
        ServiceType ssrType = new ServiceType("01");
        
        Query q = em.createNamedQuery("SubserviceMast.portalServices");
        q.setParameter("ssrvCode", ssrv);
        q.setParameter("ssrvSrtCode", ssrType);
        return q.getResultList();
    }
    
    public String getServiceNameArabic(String ssrv){
        SubserviceMast result = (SubserviceMast)em.createNamedQuery("SubserviceMast.findBySsrvCode").setParameter("ssrvCode", ssrv).getSingleResult();
        
        return result.getSsrvNameAr();
    }
}
