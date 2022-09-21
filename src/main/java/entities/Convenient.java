/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author quckh
 */
@Entity
@Table(name = "Convenient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convenient.findAll", query = "SELECT c FROM Convenient c")
    , @NamedQuery(name = "Convenient.findById", query = "SELECT c FROM Convenient c WHERE c.id = :id")
    , @NamedQuery(name = "Convenient.findByChair", query = "SELECT c FROM Convenient c WHERE c.chair = :chair")
    , @NamedQuery(name = "Convenient.findByAircondi", query = "SELECT c FROM Convenient c WHERE c.aircondi = :aircondi")
    , @NamedQuery(name = "Convenient.findByTable", query = "SELECT c FROM Convenient c WHERE c.table = :table")
    , @NamedQuery(name = "Convenient.findByRefrig", query = "SELECT c FROM Convenient c WHERE c.refrig = :refrig")
    , @NamedQuery(name = "Convenient.findBySinglebed", query = "SELECT c FROM Convenient c WHERE c.singlebed = :singlebed")
    , @NamedQuery(name = "Convenient.findByDoublebed", query = "SELECT c FROM Convenient c WHERE c.doublebed = :doublebed")
    , @NamedQuery(name = "Convenient.findByWaterheater", query = "SELECT c FROM Convenient c WHERE c.waterheater = :waterheater")
    , @NamedQuery(name = "Convenient.findByView", query = "SELECT c FROM Convenient c WHERE c.view = :view")})
public class Convenient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "chair")
    private boolean chair;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aircondi")
    private boolean aircondi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "table")
    private boolean table;
    @Basic(optional = false)
    @NotNull
    @Column(name = "refrig")
    private boolean refrig;
    @Basic(optional = false)
    @NotNull
    @Column(name = "singlebed")
    private boolean singlebed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "doublebed")
    private boolean doublebed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waterheater")
    private boolean waterheater;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "view")
    private String view;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "convenient")
    private Room room;

    public Convenient() {
    }

    public Convenient(String id) {
        this.id = id;
    }

    public Convenient(String id, boolean chair, boolean aircondi, boolean table, boolean refrig, boolean singlebed, boolean doublebed, boolean waterheater, String view) {
        this.id = id;
        this.chair = chair;
        this.aircondi = aircondi;
        this.table = table;
        this.refrig = refrig;
        this.singlebed = singlebed;
        this.doublebed = doublebed;
        this.waterheater = waterheater;
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getChair() {
        return chair;
    }

    public void setChair(boolean chair) {
        this.chair = chair;
    }

    public boolean getAircondi() {
        return aircondi;
    }

    public void setAircondi(boolean aircondi) {
        this.aircondi = aircondi;
    }

    public boolean getTable() {
        return table;
    }

    public void setTable(boolean table) {
        this.table = table;
    }

    public boolean getRefrig() {
        return refrig;
    }

    public void setRefrig(boolean refrig) {
        this.refrig = refrig;
    }

    public boolean getSinglebed() {
        return singlebed;
    }

    public void setSinglebed(boolean singlebed) {
        this.singlebed = singlebed;
    }

    public boolean getDoublebed() {
        return doublebed;
    }

    public void setDoublebed(boolean doublebed) {
        this.doublebed = doublebed;
    }

    public boolean getWaterheater() {
        return waterheater;
    }

    public void setWaterheater(boolean waterheater) {
        this.waterheater = waterheater;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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
        if (!(object instanceof Convenient)) {
            return false;
        }
        Convenient other = (Convenient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Convenient[ id=" + id + " ]";
    }
    
}
