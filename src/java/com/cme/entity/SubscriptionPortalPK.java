/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author hp
 */
@Embeddable
public class SubscriptionPortalPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "SERVICE_ID")
    private String serviceId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "SUBSERVICE_ID")
    private String subserviceId;

    public SubscriptionPortalPK() {
    }

    public SubscriptionPortalPK(String phoneNumber, String serviceId, String subserviceId) {
        this.phoneNumber = phoneNumber;
        this.serviceId = serviceId;
        this.subserviceId = subserviceId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getSubserviceId() {
        return subserviceId;
    }

    public void setSubserviceId(String subserviceId) {
        this.subserviceId = subserviceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phoneNumber != null ? phoneNumber.hashCode() : 0);
        hash += (serviceId != null ? serviceId.hashCode() : 0);
        hash += (subserviceId != null ? subserviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionPortalPK)) {
            return false;
        }
        SubscriptionPortalPK other = (SubscriptionPortalPK) object;
        if ((this.phoneNumber == null && other.phoneNumber != null) || (this.phoneNumber != null && !this.phoneNumber.equals(other.phoneNumber))) {
            return false;
        }
        if ((this.serviceId == null && other.serviceId != null) || (this.serviceId != null && !this.serviceId.equals(other.serviceId))) {
            return false;
        }
        if ((this.subserviceId == null && other.subserviceId != null) || (this.subserviceId != null && !this.subserviceId.equals(other.subserviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cme.entity.SubscriptionPortalPK[ phoneNumber=" + phoneNumber + ", serviceId=" + serviceId + ", subserviceId=" + subserviceId + " ]";
    }
    
}
