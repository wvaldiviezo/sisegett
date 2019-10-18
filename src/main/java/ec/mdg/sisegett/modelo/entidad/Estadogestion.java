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
@Table(name = "estadogestion", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadogestion.findAll", query = "SELECT e FROM Estadogestion e"),
    @NamedQuery(name = "Estadogestion.findByIdest", query = "SELECT e FROM Estadogestion e WHERE e.idest = :idest"),
    @NamedQuery(name = "Estadogestion.findByDescripcioneg", query = "SELECT e FROM Estadogestion e WHERE e.descripcioneg = :descripcioneg")})
public class Estadogestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idest")
    private Integer idest;
    @Size(max = 100)
    @Column(name = "descripcioneg")
    private String descripcioneg;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idest", fetch = FetchType.LAZY)
    private List<Actividades> actividadesList;

    public Estadogestion() {
    }

    public Estadogestion(Integer idest) {
        this.idest = idest;
    }

    public Integer getIdest() {
        return idest;
    }

    public void setIdest(Integer idest) {
        this.idest = idest;
    }

    public String getDescripcioneg() {
        return descripcioneg;
    }

    public void setDescripcioneg(String descripcioneg) {
        this.descripcioneg = descripcioneg;
    }

    @XmlTransient
    public List<Actividades> getActividadesList() {
        return actividadesList;
    }

    public void setActividadesList(List<Actividades> actividadesList) {
        this.actividadesList = actividadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idest != null ? idest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadogestion)) {
            return false;
        }
        Estadogestion other = (Estadogestion) object;
        if ((this.idest == null && other.idest != null) || (this.idest != null && !this.idest.equals(other.idest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Estadogestion[ idest=" + idest + " ]";
    }
    
}
