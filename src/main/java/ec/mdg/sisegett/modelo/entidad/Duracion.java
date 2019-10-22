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
@Table(name = "duracion", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Duracion.findAll", query = "SELECT d FROM Duracion d"),
    @NamedQuery(name = "Duracion.findByIddur", query = "SELECT d FROM Duracion d WHERE d.iddur = :iddur"),
    @NamedQuery(name = "Duracion.findByDescripciondur", query = "SELECT d FROM Duracion d WHERE d.descripciondur = :descripciondur")})
public class Duracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddur")
    private Integer iddur;
    @Size(max = 50)
    @Column(name = "descripciondur")
    private String descripciondur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddur")
    private List<Actividades> actividadesList;

    public Duracion() {
    }

    public Duracion(Integer iddur) {
        this.iddur = iddur;
    }

    public Integer getIddur() {
        return iddur;
    }

    public void setIddur(Integer iddur) {
        this.iddur = iddur;
    }

    public String getDescripciondur() {
        return descripciondur;
    }

    public void setDescripciondur(String descripciondur) {
        this.descripciondur = descripciondur;
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
        hash += (iddur != null ? iddur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duracion)) {
            return false;
        }
        Duracion other = (Duracion) object;
        if ((this.iddur == null && other.iddur != null) || (this.iddur != null && !this.iddur.equals(other.iddur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Duracion[ iddur=" + iddur + " ]";
    }
    
}
