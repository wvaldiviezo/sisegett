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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "perfil", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p"),
    @NamedQuery(name = "Perfil.findByIdperf", query = "SELECT p FROM Perfil p WHERE p.idperf = :idperf"),
    @NamedQuery(name = "Perfil.findByDescripcionperf", query = "SELECT p FROM Perfil p WHERE p.descripcionperf = :descripcionperf"),
    @NamedQuery(name = "Perfil.findByNomenclaturaperf", query = "SELECT p FROM Perfil p WHERE p.nomenclaturaperf = :nomenclaturaperf")})
public class Perfil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idperf")
    private Integer idperf;
    @Size(max = 255)
    @Column(name = "descripcionperf")
    private String descripcionperf;
    @Size(max = 5)
    @Column(name = "nomenclaturaperf")
    private String nomenclaturaperf;
    @JoinTable(name = "relationship_18", joinColumns = {
        @JoinColumn(name = "idperf", referencedColumnName = "idperf")}, inverseJoinColumns = {
        @JoinColumn(name = "idper", referencedColumnName = "idper")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Persona> personaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperf", fetch = FetchType.LAZY)
    private List<Menu> menuList;

    public Perfil() {
    }

    public Perfil(Integer idperf) {
        this.idperf = idperf;
    }

    public Integer getIdperf() {
        return idperf;
    }

    public void setIdperf(Integer idperf) {
        this.idperf = idperf;
    }

    public String getDescripcionperf() {
        return descripcionperf;
    }

    public void setDescripcionperf(String descripcionperf) {
        this.descripcionperf = descripcionperf;
    }

    public String getNomenclaturaperf() {
        return nomenclaturaperf;
    }

    public void setNomenclaturaperf(String nomenclaturaperf) {
        this.nomenclaturaperf = nomenclaturaperf;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idperf != null ? idperf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.idperf == null && other.idperf != null) || (this.idperf != null && !this.idperf.equals(other.idperf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Perfil[ idperf=" + idperf + " ]";
    }
    
}
