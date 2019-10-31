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
@Table(name = "tipoproyecto", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoproyecto.findAll", query = "SELECT t FROM Tipoproyecto t"),
    @NamedQuery(name = "Tipoproyecto.findByIdtp", query = "SELECT t FROM Tipoproyecto t WHERE t.idtp = :idtp"),
    @NamedQuery(name = "Tipoproyecto.findByDescripciontp", query = "SELECT t FROM Tipoproyecto t WHERE t.descripciontp = :descripciontp")})
public class Tipoproyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtp")
    private Integer idtp;
    @Size(max = 50)
    @Column(name = "descripciontp")
    private String descripciontp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtp")
    private List<Acciones> accionesList;

    public Tipoproyecto() {
    }

    public Tipoproyecto(Integer idtp) {
        this.idtp = idtp;
    }

    public Integer getIdtp() {
        return idtp;
    }

    public void setIdtp(Integer idtp) {
        this.idtp = idtp;
    }

    public String getDescripciontp() {
        return descripciontp;
    }

    public void setDescripciontp(String descripciontp) {
        this.descripciontp = descripciontp;
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
        hash += (idtp != null ? idtp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproyecto)) {
            return false;
        }
        Tipoproyecto other = (Tipoproyecto) object;
        if ((this.idtp == null && other.idtp != null) || (this.idtp != null && !this.idtp.equals(other.idtp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Tipoproyecto[ idtp=" + idtp + " ]";
    }
    
}
