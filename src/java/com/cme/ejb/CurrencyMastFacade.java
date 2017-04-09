/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.ejb;

import com.cme.entity.CurrencyMast;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class CurrencyMastFacade extends AbstractFacade<CurrencyMast> {
    @PersistenceContext(unitName = "TagSamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CurrencyMastFacade() {
        super(CurrencyMast.class);
    }
    
}
