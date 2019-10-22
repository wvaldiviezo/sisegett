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
@Table(name = "avance", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avance.findAll", query = "SELECT a FROM Avance a"),
    @NamedQuery(name = "Avance.findByIdava", query = "SELECT a FROM Avance a WHERE a.idava = :idava"),
    @NamedQuery(name = "Avance.findByDescripcionava", query = "SELECT a FROM Avance a WHERE a.descripcionava = :descripcionava")})
public class Avance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idava")
    private Integer idava;
    @Size(max = 20)
    @Column(name = "descripcionava")
    private String descripcionava;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idava")
    private List<Actividades> actividadesList;

    public Avance() {
    }

    public Avance(Integer idava) {
        this.idava = idava;
    }

    public Integer getIdava() {
        return idava;
    }

    public void setIdava(Integer idava) {
        this.idava = idava;
    }

    public String getDescripcionava() {
        return descripcionava;
    }

    public void setDescripcionava(String descripcionava) {
        this.descripcionava = descripcionava;
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
        hash += (idava != null ? idava.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avance)) {
            return false;
        }
        Avance other = (Avance) object;
        if ((this.idava == null && other.idava != null) || (this.idava != null && !this.idava.equals(other.idava))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Avance[ idava=" + idava + " ]";
    }
    
}
