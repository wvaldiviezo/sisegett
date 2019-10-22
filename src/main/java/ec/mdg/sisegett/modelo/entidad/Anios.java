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
@Table(name = "anios", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anios.findAll", query = "SELECT a FROM Anios a"),
    @NamedQuery(name = "Anios.findByIdani", query = "SELECT a FROM Anios a WHERE a.idani = :idani"),
    @NamedQuery(name = "Anios.findByDescripcionani", query = "SELECT a FROM Anios a WHERE a.descripcionani = :descripcionani")})
public class Anios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idani")
    private Integer idani;
    @Size(max = 20)
    @Column(name = "descripcionani")
    private String descripcionani;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idani")
    private List<Objetivosgenerales> objetivosgeneralesList;

    public Anios() {
    }

    public Anios(Integer idani) {
        this.idani = idani;
    }

    public Integer getIdani() {
        return idani;
    }

    public void setIdani(Integer idani) {
        this.idani = idani;
    }

    public String getDescripcionani() {
        return descripcionani;
    }

    public void setDescripcionani(String descripcionani) {
        this.descripcionani = descripcionani;
    }

    @XmlTransient
    public List<Objetivosgenerales> getObjetivosgeneralesList() {
        return objetivosgeneralesList;
    }

    public void setObjetivosgeneralesList(List<Objetivosgenerales> objetivosgeneralesList) {
        this.objetivosgeneralesList = objetivosgeneralesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idani != null ? idani.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anios)) {
            return false;
        }
        Anios other = (Anios) object;
        if ((this.idani == null && other.idani != null) || (this.idani != null && !this.idani.equals(other.idani))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Anios[ idani=" + idani + " ]";
    }
    
}
