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
@Table(name = "objetivosgenerales", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Objetivosgenerales.findAll", query = "SELECT o FROM Objetivosgenerales o"),
    @NamedQuery(name = "Objetivosgenerales.findByIdobjgen", query = "SELECT o FROM Objetivosgenerales o WHERE o.idobjgen = :idobjgen"),
    @NamedQuery(name = "Objetivosgenerales.findByDescripcionobjgen", query = "SELECT o FROM Objetivosgenerales o WHERE o.descripcionobjgen = :descripcionobjgen")})
public class Objetivosgenerales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idobjgen")
    private Integer idobjgen;
    @Size(max = 500)
    @Column(name = "descripcionobjgen")
    private String descripcionobjgen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idobjgen", fetch = FetchType.LAZY)
    private List<Objetivosespecificos> objetivosespecificosList;
    @JoinColumn(name = "idani", referencedColumnName = "idani")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Anios idani;
    @JoinColumn(name = "ideje", referencedColumnName = "ideje")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ejes ideje;

    public Objetivosgenerales() {
    }

    public Objetivosgenerales(Integer idobjgen) {
        this.idobjgen = idobjgen;
    }

    public Integer getIdobjgen() {
        return idobjgen;
    }

    public void setIdobjgen(Integer idobjgen) {
        this.idobjgen = idobjgen;
    }

    public String getDescripcionobjgen() {
        return descripcionobjgen;
    }

    public void setDescripcionobjgen(String descripcionobjgen) {
        this.descripcionobjgen = descripcionobjgen;
    }

    @XmlTransient
    public List<Objetivosespecificos> getObjetivosespecificosList() {
        return objetivosespecificosList;
    }

    public void setObjetivosespecificosList(List<Objetivosespecificos> objetivosespecificosList) {
        this.objetivosespecificosList = objetivosespecificosList;
    }

    public Anios getIdani() {
        return idani;
    }

    public void setIdani(Anios idani) {
        this.idani = idani;
    }

    public Ejes getIdeje() {
        return ideje;
    }

    public void setIdeje(Ejes ideje) {
        this.ideje = ideje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idobjgen != null ? idobjgen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Objetivosgenerales)) {
            return false;
        }
        Objetivosgenerales other = (Objetivosgenerales) object;
        if ((this.idobjgen == null && other.idobjgen != null) || (this.idobjgen != null && !this.idobjgen.equals(other.idobjgen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Objetivosgenerales[ idobjgen=" + idobjgen + " ]";
    }
    
}
