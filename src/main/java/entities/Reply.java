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
@Table(name = "Reply")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reply.findAll", query = "SELECT r FROM Reply r")
    , @NamedQuery(name = "Reply.findByCmtid", query = "SELECT r FROM Reply r WHERE r.cmtid = :cmtid")
    , @NamedQuery(name = "Reply.findByRoomid", query = "SELECT r FROM Reply r WHERE r.roomid = :roomid")
    , @NamedQuery(name = "Reply.findByCusid", query = "SELECT r FROM Reply r WHERE r.cusid = :cusid")
    , @NamedQuery(name = "Reply.findByContent", query = "SELECT r FROM Reply r WHERE r.content = :content")
    , @NamedQuery(name = "Reply.findByDate", query = "SELECT r FROM Reply r WHERE r.date = :date")})
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cmtid")
    private Integer cmtid;
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

    public Reply() {
    }

    public Reply(Integer cmtid) {
        this.cmtid = cmtid;
    }

    public Reply(Integer cmtid, String roomid, String cusid, String content, Date date) {
        this.cmtid = cmtid;
        this.roomid = roomid;
        this.cusid = cusid;
        this.content = content;
        this.date = date;
    }

    public Integer getCmtid() {
        return cmtid;
    }

    public void setCmtid(Integer cmtid) {
        this.cmtid = cmtid;
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
        hash += (cmtid != null ? cmtid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reply)) {
            return false;
        }
        Reply other = (Reply) object;
        if ((this.cmtid == null && other.cmtid != null) || (this.cmtid != null && !this.cmtid.equals(other.cmtid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Reply[ cmtid=" + cmtid + " ]";
    }
    
}
