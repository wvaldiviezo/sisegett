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
@Table(name = "tiposacciones", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposacciones.findAll", query = "SELECT t FROM Tiposacciones t"),
    @NamedQuery(name = "Tiposacciones.findByIdtac", query = "SELECT t FROM Tiposacciones t WHERE t.idtac = :idtac"),
    @NamedQuery(name = "Tiposacciones.findByDescripciontac", query = "SELECT t FROM Tiposacciones t WHERE t.descripciontac = :descripciontac")})
public class Tiposacciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtac")
    private Integer idtac;
    @Size(max = 100)
    @Column(name = "descripciontac")
    private String descripciontac;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtac")
    private List<Acciones> accionesList;

    public Tiposacciones() {
    }

    public Tiposacciones(Integer idtac) {
        this.idtac = idtac;
    }

    public Integer getIdtac() {
        return idtac;
    }

    public void setIdtac(Integer idtac) {
        this.idtac = idtac;
    }

    public String getDescripciontac() {
        return descripciontac;
    }

    public void setDescripciontac(String descripciontac) {
        this.descripciontac = descripciontac;
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
        hash += (idtac != null ? idtac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposacciones)) {
            return false;
        }
        Tiposacciones other = (Tiposacciones) object;
        if ((this.idtac == null && other.idtac != null) || (this.idtac != null && !this.idtac.equals(other.idtac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Tiposacciones[ idtac=" + idtac + " ]";
    }
    
}
