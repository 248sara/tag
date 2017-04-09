/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.ejb;

import com.cme.entity.ServiceMast;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class ServiceMastFacade extends AbstractFacade<ServiceMast> {
    @PersistenceContext(unitName = "TagSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceMastFacade() {
        super(ServiceMast.class);
    }
    
}
