/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "menu", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByIdmen", query = "SELECT m FROM Menu m WHERE m.idmen = :idmen"),
    @NamedQuery(name = "Menu.findByDescripcionmen", query = "SELECT m FROM Menu m WHERE m.descripcionmen = :descripcionmen"),
    @NamedQuery(name = "Menu.findByTipomen", query = "SELECT m FROM Menu m WHERE m.tipomen = :tipomen"),
    @NamedQuery(name = "Menu.findByTipousuariomen", query = "SELECT m FROM Menu m WHERE m.tipousuariomen = :tipousuariomen"),
    @NamedQuery(name = "Menu.findByRutamen", query = "SELECT m FROM Menu m WHERE m.rutamen = :rutamen"),
    @NamedQuery(name = "Menu.findByEstadomen", query = "SELECT m FROM Menu m WHERE m.estadomen = :estadomen")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmen")
    private Integer idmen;
    @Size(max = 100)
    @Column(name = "descripcionmen")
    private String descripcionmen;
    @Size(max = 2)
    @Column(name = "tipomen")
    private String tipomen;
    @Size(max = 3)
    @Column(name = "tipousuariomen")
    private String tipousuariomen;
    @Size(max = 255)
    @Column(name = "rutamen")
    private String rutamen;
    @Column(name = "estadomen")
    private Boolean estadomen;
    @OneToMany(mappedBy = "codigosubmen")
    private List<Menu> menuList;
    @JoinColumn(name = "codigosubmen", referencedColumnName = "idmen")
    @ManyToOne
    private Menu codigosubmen;

    public Menu() {
    }

    public Menu(Integer idmen) {
        this.idmen = idmen;
    }

    public Integer getIdmen() {
        return idmen;
    }

    public void setIdmen(Integer idmen) {
        this.idmen = idmen;
    }

    public String getDescripcionmen() {
        return descripcionmen;
    }

    public void setDescripcionmen(String descripcionmen) {
        this.descripcionmen = descripcionmen;
    }

    public String getTipomen() {
        return tipomen;
    }

    public void setTipomen(String tipomen) {
        this.tipomen = tipomen;
    }

    public String getTipousuariomen() {
        return tipousuariomen;
    }

    public void setTipousuariomen(String tipousuariomen) {
        this.tipousuariomen = tipousuariomen;
    }

    public String getRutamen() {
        return rutamen;
    }

    public void setRutamen(String rutamen) {
        this.rutamen = rutamen;
    }

    public Boolean getEstadomen() {
        return estadomen;
    }

    public void setEstadomen(Boolean estadomen) {
        this.estadomen = estadomen;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Menu getCodigosubmen() {
        return codigosubmen;
    }

    public void setCodigosubmen(Menu codigosubmen) {
        this.codigosubmen = codigosubmen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmen != null ? idmen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idmen == null && other.idmen != null) || (this.idmen != null && !this.idmen.equals(other.idmen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Menu[ idmen=" + idmen + " ]";
    }
    
}
