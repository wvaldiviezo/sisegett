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
import javax.persistence.ManyToMany;
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
@Table(name = "institucion", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Institucion.findAll", query = "SELECT i FROM Institucion i"),
    @NamedQuery(name = "Institucion.findByIdins", query = "SELECT i FROM Institucion i WHERE i.idins = :idins"),
    @NamedQuery(name = "Institucion.findByDescripcionins", query = "SELECT i FROM Institucion i WHERE i.descripcionins = :descripcionins")})
public class Institucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idins")
    private Integer idins;
    @Size(max = 200)
    @Column(name = "descripcionins")
    private String descripcionins;
    @ManyToMany(mappedBy = "institucionList", fetch = FetchType.LAZY)
    private List<Acciones> accionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idins", fetch = FetchType.LAZY)
    private List<Persona> personaList;

    public Institucion() {
    }

    public Institucion(Integer idins) {
        this.idins = idins;
    }

    public Integer getIdins() {
        return idins;
    }

    public void setIdins(Integer idins) {
        this.idins = idins;
    }

    public String getDescripcionins() {
        return descripcionins;
    }

    public void setDescripcionins(String descripcionins) {
        this.descripcionins = descripcionins;
    }

    @XmlTransient
    public List<Acciones> getAccionesList() {
        return accionesList;
    }

    public void setAccionesList(List<Acciones> accionesList) {
        this.accionesList = accionesList;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idins != null ? idins.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.idins == null && other.idins != null) || (this.idins != null && !this.idins.equals(other.idins))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Institucion[ idins=" + idins + " ]";
    }
    
}
