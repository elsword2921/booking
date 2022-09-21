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
@Table(name = "Orderheader")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderheader.findAll", query = "SELECT o FROM Orderheader o")
    , @NamedQuery(name = "Orderheader.findById", query = "SELECT o FROM Orderheader o WHERE o.id = :id")
    , @NamedQuery(name = "Orderheader.findByCusid", query = "SELECT o FROM Orderheader o WHERE o.cusid = :cusid")
    , @NamedQuery(name = "Orderheader.findByDate", query = "SELECT o FROM Orderheader o WHERE o.date = :date")
    , @NamedQuery(name = "Orderheader.findByPrice", query = "SELECT o FROM Orderheader o WHERE o.price = :price")
    , @NamedQuery(name = "Orderheader.findByFloor", query = "SELECT o FROM Orderheader o WHERE o.floor = :floor")
    , @NamedQuery(name = "Orderheader.findByDecription", query = "SELECT o FROM Orderheader o WHERE o.decription = :decription")
    , @NamedQuery(name = "Orderheader.findByRoomid", query = "SELECT o FROM Orderheader o WHERE o.roomid = :roomid")
    , @NamedQuery(name = "Orderheader.findByStaffid", query = "SELECT o FROM Orderheader o WHERE o.staffid = :staffid")})
public class Orderheader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cusid")
    private int cusid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "floor")
    private int floor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "decription")
    private String decription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "roomid")
    private String roomid;
    @Column(name = "staffid")
    private Integer staffid;

    public Orderheader() {
    }

    public Orderheader(String id) {
        this.id = id;
    }

    public Orderheader(String id, int cusid, Date date, double price, int floor, String decription, String roomid) {
        this.id = id;
        this.cusid = cusid;
        this.date = date;
        this.price = price;
        this.floor = floor;
        this.decription = decription;
        this.roomid = roomid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderheader)) {
            return false;
        }
        Orderheader other = (Orderheader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Orderheader[ id=" + id + " ]";
    }
    
}
