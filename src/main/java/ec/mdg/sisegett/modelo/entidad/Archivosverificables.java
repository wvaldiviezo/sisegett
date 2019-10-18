/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wilmer.valdiviezo
 */
@Entity
@Table(name = "archivosverificables", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Archivosverificables.findAll", query = "SELECT a FROM Archivosverificables a"),
    @NamedQuery(name = "Archivosverificables.findByIdav", query = "SELECT a FROM Archivosverificables a WHERE a.idav = :idav"),
    @NamedQuery(name = "Archivosverificables.findByDescripcionav", query = "SELECT a FROM Archivosverificables a WHERE a.descripcionav = :descripcionav"),
    @NamedQuery(name = "Archivosverificables.findByRutaav", query = "SELECT a FROM Archivosverificables a WHERE a.rutaav = :rutaav")})
public class Archivosverificables implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idav")
    private Integer idav;
    @Size(max = 150)
    @Column(name = "descripcionav")
    private String descripcionav;
    @Size(max = 255)
    @Column(name = "rutaav")
    private String rutaav;
    @JoinColumn(name = "idact", referencedColumnName = "idact")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Actividades idact;

    public Archivosverificables() {
    }

    public Archivosverificables(Integer idav) {
        this.idav = idav;
    }

    public Integer getIdav() {
        return idav;
    }

    public void setIdav(Integer idav) {
        this.idav = idav;
    }

    public String getDescripcionav() {
        return descripcionav;
    }

    public void setDescripcionav(String descripcionav) {
        this.descripcionav = descripcionav;
    }

    public String getRutaav() {
        return rutaav;
    }

    public void setRutaav(String rutaav) {
        this.rutaav = rutaav;
    }

    public Actividades getIdact() {
        return idact;
    }

    public void setIdact(Actividades idact) {
        this.idact = idact;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idav != null ? idav.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Archivosverificables)) {
            return false;
        }
        Archivosverificables other = (Archivosverificables) object;
        if ((this.idav == null && other.idav != null) || (this.idav != null && !this.idav.equals(other.idav))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Archivosverificables[ idav=" + idav + " ]";
    }
    
}
