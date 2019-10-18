/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wilmer.valdiviezo
 */
@Entity
@Table(name = "importancia", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Importancia.findAll", query = "SELECT i FROM Importancia i"),
    @NamedQuery(name = "Importancia.findByIdimp", query = "SELECT i FROM Importancia i WHERE i.idimp = :idimp"),
    @NamedQuery(name = "Importancia.findByDescripcionimp", query = "SELECT i FROM Importancia i WHERE i.descripcionimp = :descripcionimp")})
public class Importancia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idimp")
    private Integer idimp;
    @Size(max = 100)
    @Column(name = "descripcionimp")
    private String descripcionimp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idimp", fetch = FetchType.LAZY)
    private List<Acciones> accionesList;

    public Importancia() {
    }

    public Importancia(Integer idimp) {
        this.idimp = idimp;
    }

    public Integer getIdimp() {
        return idimp;
    }

    public void setIdimp(Integer idimp) {
        this.idimp = idimp;
    }

    public String getDescripcionimp() {
        return descripcionimp;
    }

    public void setDescripcionimp(String descripcionimp) {
        this.descripcionimp = descripcionimp;
    }

    @XmlTransient
    public List<Acciones> getAccionesList() {
        return accionesList;
    }

    public void setAccionesList(List<Acciones> accionesList) {
        this.accionesList = accionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idimp != null ? idimp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Importancia)) {
            return false;
        }
        Importancia other = (Importancia) object;
        if ((this.idimp == null && other.idimp != null) || (this.idimp != null && !this.idimp.equals(other.idimp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Importancia[ idimp=" + idimp + " ]";
    }
    
}
