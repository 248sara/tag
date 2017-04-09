/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cme.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "SUBSCRIPTION_PORTAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubscriptionPortal.findAll", query = "SELECT s FROM SubscriptionPortal s"),
    @NamedQuery(name = "SubscriptionPortal.findBySource", query = "SELECT s FROM SubscriptionPortal s WHERE s.source = :source"),
    @NamedQuery(name = "SubscriptionPortal.findByName", query = "SELECT s FROM SubscriptionPortal s WHERE s.name = :name"),
    @NamedQuery(name = "SubscriptionPortal.findByPhoneNumber", query = "SELECT s FROM SubscriptionPortal s WHERE s.subscriptionPortalPK.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "SubscriptionPortal.findByEMail", query = "SELECT s FROM SubscriptionPortal s WHERE s.eMail = :eMail"),
    @NamedQuery(name = "SubscriptionPortal.findByServiceId", query = "SELECT s FROM SubscriptionPortal s WHERE s.subscriptionPortalPK.serviceId = :serviceId"),
    @NamedQuery(name = "SubscriptionPortal.findBySubserviceId", query = "SELECT s FROM SubscriptionPortal s WHERE s.subscriptionPortalPK.subserviceId = :subserviceId"),
    @NamedQuery(name = "SubscriptionPortal.findByStatus", query = "SELECT s FROM SubscriptionPortal s WHERE s.status = :status"),
    @NamedQuery(name = "SubscriptionPortal.findServiceAndSubservice", query = "SELECT s FROM SubscriptionPortal s WHERE s.subscriptionPortalPK.serviceId = :serviceId")})

public class SubscriptionPortal implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubscriptionPortalPK subscriptionPortalPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "SOURCE")
    private String source;
    @Size(max = 200)
    @Column(name = "NAME")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "E_MAIL")
    private String eMail;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;

    public SubscriptionPortal() {
    }

    public SubscriptionPortal(SubscriptionPortalPK subscriptionPortalPK) {
        this.subscriptionPortalPK = subscriptionPortalPK;
    }

    public SubscriptionPortal(SubscriptionPortalPK subscriptionPortalPK, String source) {
        this.subscriptionPortalPK = subscriptionPortalPK;
        this.source = source;
    }

    public SubscriptionPortal(String phoneNumber, String serviceId, String subserviceId) {
        this.subscriptionPortalPK = new SubscriptionPortalPK(phoneNumber, serviceId, subserviceId);
    }

    public SubscriptionPortalPK getSubscriptionPortalPK() {
        return subscriptionPortalPK;
    }

    public void setSubscriptionPortalPK(SubscriptionPortalPK subscriptionPortalPK) {
        this.subscriptionPortalPK = subscriptionPortalPK;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionPortalPK != null ? subscriptionPortalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubscriptionPortal)) {
            return false;
        }
        SubscriptionPortal other = (SubscriptionPortal) object;
        if ((this.subscriptionPortalPK == null && other.subscriptionPortalPK != null) || (this.subscriptionPortalPK != null && !this.subscriptionPortalPK.equals(other.subscriptionPortalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cme.entity.SubscriptionPortal[ subscriptionPortalPK=" + subscriptionPortalPK + " ]";
    }
    
}
