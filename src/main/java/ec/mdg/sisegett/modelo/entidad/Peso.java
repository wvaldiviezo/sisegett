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
@Table(name = "peso", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peso.findAll", query = "SELECT p FROM Peso p"),
    @NamedQuery(name = "Peso.findByIdpes", query = "SELECT p FROM Peso p WHERE p.idpes = :idpes"),
    @NamedQuery(name = "Peso.findByDescripcionpes", query = "SELECT p FROM Peso p WHERE p.descripcionpes = :descripcionpes")})
public class Peso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpes")
    private Integer idpes;
    @Size(max = 50)
    @Column(name = "descripcionpes")
    private String descripcionpes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpes")
    private List<Actividades> actividadesList;

    public Peso() {
    }

    public Peso(Integer idpes) {
        this.idpes = idpes;
    }

    public Integer getIdpes() {
        return idpes;
    }

    public void setIdpes(Integer idpes) {
        this.idpes = idpes;
    }

    public String getDescripcionpes() {
        return descripcionpes;
    }

    public void setDescripcionpes(String descripcionpes) {
        this.descripcionpes = descripcionpes;
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
        hash += (idpes != null ? idpes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peso)) {
            return false;
        }
        Peso other = (Peso) object;
        if ((this.idpes == null && other.idpes != null) || (this.idpes != null && !this.idpes.equals(other.idpes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Peso[ idpes=" + idpes + " ]";
    }
    
}
