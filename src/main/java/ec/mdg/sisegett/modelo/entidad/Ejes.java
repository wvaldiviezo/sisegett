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
@Table(name = "ejes", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejes.findAll", query = "SELECT e FROM Ejes e"),
    @NamedQuery(name = "Ejes.findByIdeje", query = "SELECT e FROM Ejes e WHERE e.ideje = :ideje"),
    @NamedQuery(name = "Ejes.findByDescripcioneje", query = "SELECT e FROM Ejes e WHERE e.descripcioneje = :descripcioneje")})
public class Ejes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideje")
    private Integer ideje;
    @Size(max = 500)
    @Column(name = "descripcioneje")
    private String descripcioneje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideje", fetch = FetchType.LAZY)
    private List<Objetivosgenerales> objetivosgeneralesList;

    public Ejes() {
    }

    public Ejes(Integer ideje) {
        this.ideje = ideje;
    }

    public Integer getIdeje() {
        return ideje;
    }

    public void setIdeje(Integer ideje) {
        this.ideje = ideje;
    }

    public String getDescripcioneje() {
        return descripcioneje;
    }

    public void setDescripcioneje(String descripcioneje) {
        this.descripcioneje = descripcioneje;
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
        hash += (ideje != null ? ideje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejes)) {
            return false;
        }
        Ejes other = (Ejes) object;
        if ((this.ideje == null && other.ideje != null) || (this.ideje != null && !this.ideje.equals(other.ideje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Ejes[ ideje=" + ideje + " ]";
    }
    
}
