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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "Room")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r")
    , @NamedQuery(name = "Room.findById", query = "SELECT r FROM Room r WHERE r.id = :id")
    , @NamedQuery(name = "Room.findByName", query = "SELECT r FROM Room r WHERE r.name = :name")
    , @NamedQuery(name = "Room.findByPrice", query = "SELECT r FROM Room r WHERE r.price = :price")
    , @NamedQuery(name = "Room.findByType", query = "SELECT r FROM Room r WHERE r.type = :type")
    , @NamedQuery(name = "Room.findByFloor", query = "SELECT r FROM Room r WHERE r.floor = :floor")
    , @NamedQuery(name = "Room.findByDecription", query = "SELECT r FROM Room r WHERE r.decription = :decription")
    , @NamedQuery(name = "Room.findByCheckin", query = "SELECT r FROM Room r WHERE r.checkin = :checkin")
    , @NamedQuery(name = "Room.findByCheckout", query = "SELECT r FROM Room r WHERE r.checkout = :checkout")})
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;
    @Size(max = 20)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "floor")
    private int floor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "decription")
    private String decription;
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
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Convenient convenient;

    public Room() {
    }

    public Room(String id) {
        this.id = id;
    }

    public Room(String id, String name, double price, int floor, String decription, Date checkin, Date checkout) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.floor = floor;
        this.decription = decription;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Convenient getConvenient() {
        return convenient;
    }

    public void setConvenient(Convenient convenient) {
        this.convenient = convenient;
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
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Room[ id=" + id + " ]";
    }
    
}
