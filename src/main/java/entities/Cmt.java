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
@Table(name = "Cmt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cmt.findAll", query = "SELECT c FROM Cmt c")
    , @NamedQuery(name = "Cmt.findById", query = "SELECT c FROM Cmt c WHERE c.id = :id")
    , @NamedQuery(name = "Cmt.findByRoomid", query = "SELECT c FROM Cmt c WHERE c.roomid = :roomid")
    , @NamedQuery(name = "Cmt.findByCusid", query = "SELECT c FROM Cmt c WHERE c.cusid = :cusid")
    , @NamedQuery(name = "Cmt.findByContent", query = "SELECT c FROM Cmt c WHERE c.content = :content")
    , @NamedQuery(name = "Cmt.findByDate", query = "SELECT c FROM Cmt c WHERE c.date = :date")})
public class Cmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "roomid")
    private String roomid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cusid")
    private String cusid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Cmt() {
    }

    public Cmt(Integer id) {
        this.id = id;
    }

    public Cmt(Integer id, String roomid, String cusid, String content, Date date) {
        this.id = id;
        this.roomid = roomid;
        this.cusid = cusid;
        this.content = content;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        if (!(object instanceof Cmt)) {
            return false;
        }
        Cmt other = (Cmt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cmt[ id=" + id + " ]";
    }
    
}
