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
@Table(name = "CusOption")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CusOption.findAll", query = "SELECT c FROM CusOption c")
    , @NamedQuery(name = "CusOption.findByRoomid", query = "SELECT c FROM CusOption c WHERE c.roomid = :roomid")
    , @NamedQuery(name = "CusOption.findByCheckin", query = "SELECT c FROM CusOption c WHERE c.checkin = :checkin")
    , @NamedQuery(name = "CusOption.findByCheckout", query = "SELECT c FROM CusOption c WHERE c.checkout = :checkout")
    , @NamedQuery(name = "CusOption.findByOption", query = "SELECT c FROM CusOption c WHERE c.option = :option")})
public class CusOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
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
    @Size(min = 1, max = 50)
    @Column(name = "option")
    private String option;

    public CusOption() {
    }

    public CusOption(String roomid) {
        this.roomid = roomid;
    }

    public CusOption(String roomid, Date checkin, Date checkout, String option) {
        this.roomid = roomid;
        this.checkin = checkin;
        this.checkout = checkout;
        this.option = option;
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

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
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
        if (!(object instanceof CusOption)) {
            return false;
        }
        CusOption other = (CusOption) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CusOption[ roomid=" + roomid + " ]";
    }
    
}
