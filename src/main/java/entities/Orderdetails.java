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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Orderdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetails.findAll", query = "SELECT o FROM Orderdetails o")
    , @NamedQuery(name = "Orderdetails.findById", query = "SELECT o FROM Orderdetails o WHERE o.id = :id")
    , @NamedQuery(name = "Orderdetails.findByOrderheader", query = "SELECT o FROM Orderdetails o WHERE o.orderheader = :orderheader")
    , @NamedQuery(name = "Orderdetails.findByName", query = "SELECT o FROM Orderdetails o WHERE o.name = :name")
    , @NamedQuery(name = "Orderdetails.findByType", query = "SELECT o FROM Orderdetails o WHERE o.type = :type")
    , @NamedQuery(name = "Orderdetails.findByFloor", query = "SELECT o FROM Orderdetails o WHERE o.floor = :floor")
    , @NamedQuery(name = "Orderdetails.findByDecription", query = "SELECT o FROM Orderdetails o WHERE o.decription = :decription")
    , @NamedQuery(name = "Orderdetails.findByCheckin", query = "SELECT o FROM Orderdetails o WHERE o.checkin = :checkin")
    , @NamedQuery(name = "Orderdetails.findByCheckout", query = "SELECT o FROM Orderdetails o WHERE o.checkout = :checkout")
    , @NamedQuery(name = "Orderdetails.findByPeople", query = "SELECT o FROM Orderdetails o WHERE o.people = :people")
    , @NamedQuery(name = "Orderdetails.findBySerprice", query = "SELECT o FROM Orderdetails o WHERE o.serprice = :serprice")
    , @NamedQuery(name = "Orderdetails.findByOptionprice", query = "SELECT o FROM Orderdetails o WHERE o.optionprice = :optionprice")})
public class Orderdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "orderheader")
    private String orderheader;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "name")
    private String name;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "people")
    private int people;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "serprice")
    private Double serprice;
    @Column(name = "optionprice")
    private Double optionprice;

    public Orderdetails() {
    }

    public Orderdetails(Integer id) {
        this.id = id;
    }

    public Orderdetails(Integer id, String orderheader, String name, int floor, String decription, Date checkin, Date checkout, int people) {
        this.id = id;
        this.orderheader = orderheader;
        this.name = name;
        this.floor = floor;
        this.decription = decription;
        this.checkin = checkin;
        this.checkout = checkout;
        this.people = people;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderheader() {
        return orderheader;
    }

    public void setOrderheader(String orderheader) {
        this.orderheader = orderheader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public Double getSerprice() {
        return serprice;
    }

    public void setSerprice(Double serprice) {
        this.serprice = serprice;
    }

    public Double getOptionprice() {
        return optionprice;
    }

    public void setOptionprice(Double optionprice) {
        this.optionprice = optionprice;
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
        if (!(object instanceof Orderdetails)) {
            return false;
        }
        Orderdetails other = (Orderdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Orderdetails[ id=" + id + " ]";
    }
    
}
