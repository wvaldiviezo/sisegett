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
@Table(name = "objetivosespecificos", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Objetivosespecificos.findAll", query = "SELECT o FROM Objetivosespecificos o"),
    @NamedQuery(name = "Objetivosespecificos.findByIdobjesp", query = "SELECT o FROM Objetivosespecificos o WHERE o.idobjesp = :idobjesp"),
    @NamedQuery(name = "Objetivosespecificos.findByDescripcionobjesp", query = "SELECT o FROM Objetivosespecificos o WHERE o.descripcionobjesp = :descripcionobjesp")})
public class Objetivosespecificos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idobjesp")
    private Integer idobjesp;
    @Size(max = 500)
    @Column(name = "descripcionobjesp")
    private String descripcionobjesp;
    @JoinColumn(name = "idobjgen", referencedColumnName = "idobjgen")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Objetivosgenerales idobjgen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idobjesp", fetch = FetchType.LAZY)
    private List<Acciones> accionesList;

    public Objetivosespecificos() {
    }

    public Objetivosespecificos(Integer idobjesp) {
        this.idobjesp = idobjesp;
    }

    public Integer getIdobjesp() {
        return idobjesp;
    }

    public void setIdobjesp(Integer idobjesp) {
        this.idobjesp = idobjesp;
    }

    public String getDescripcionobjesp() {
        return descripcionobjesp;
    }

    public void setDescripcionobjesp(String descripcionobjesp) {
        this.descripcionobjesp = descripcionobjesp;
    }

    public Objetivosgenerales getIdobjgen() {
        return idobjgen;
    }

    public void setIdobjgen(Objetivosgenerales idobjgen) {
        this.idobjgen = idobjgen;
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
        hash += (idobjesp != null ? idobjesp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Objetivosespecificos)) {
            return false;
        }
        Objetivosespecificos other = (Objetivosespecificos) object;
        if ((this.idobjesp == null && other.idobjesp != null) || (this.idobjesp != null && !this.idobjesp.equals(other.idobjesp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Objetivosespecificos[ idobjesp=" + idobjesp + " ]";
    }
    
}
