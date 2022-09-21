/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quckh
 */
@Entity
@Table(name = "CusService")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CusService.findAll", query = "SELECT c FROM CusService c")
    , @NamedQuery(name = "CusService.findByRoomid", query = "SELECT c FROM CusService c WHERE c.roomid = :roomid")
    , @NamedQuery(name = "CusService.findByCheckin", query = "SELECT c FROM CusService c WHERE c.checkin = :checkin")
    , @NamedQuery(name = "CusService.findByCheckout", query = "SELECT c FROM CusService c WHERE c.checkout = :checkout")
    , @NamedQuery(name = "CusService.findByPrice", query = "SELECT c FROM CusService c WHERE c.price = :price")
    , @NamedQuery(name = "CusService.findByService", query = "SELECT c FROM CusService c WHERE c.service = :service")})
public class CusService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "roomid")
    private String roomid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checkin")
    @Temporal(TemporalType.DATE)
    private Date checkin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "checkout")
    @Temporal(TemporalType.DATE)
    private Date checkout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "service")
    private String service;

    public CusService() {
    }

    public CusService(String roomid) {
        this.roomid = roomid;
    }

    public CusService(String roomid, Date checkin, Date checkout, double price, String service) {
        this.roomid = roomid;
        this.checkin = checkin;
        this.checkout = checkout;
        this.price = price;
        this.service = service;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomid != null ? roomid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CusService)) {
            return false;
        }
        CusService other = (CusService) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CusService[ roomid=" + roomid + " ]";
    }
    
}
