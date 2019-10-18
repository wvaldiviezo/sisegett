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
@Table(name = "correo", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correo.findAll", query = "SELECT c FROM Correo c"),
    @NamedQuery(name = "Correo.findByIdcor", query = "SELECT c FROM Correo c WHERE c.idcor = :idcor"),
    @NamedQuery(name = "Correo.findByDescripcioncor", query = "SELECT c FROM Correo c WHERE c.descripcioncor = :descripcioncor")})
public class Correo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcor")
    private Integer idcor;
    @Size(max = 255)
    @Column(name = "descripcioncor")
    private String descripcioncor;
    @JoinColumn(name = "idper", referencedColumnName = "idper")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Persona idper;

    public Correo() {
    }

    public Correo(Integer idcor) {
        this.idcor = idcor;
    }

    public Integer getIdcor() {
        return idcor;
    }

    public void setIdcor(Integer idcor) {
        this.idcor = idcor;
    }

    public String getDescripcioncor() {
        return descripcioncor;
    }

    public void setDescripcioncor(String descripcioncor) {
        this.descripcioncor = descripcioncor;
    }

    public Persona getIdper() {
        return idper;
    }

    public void setIdper(Persona idper) {
        this.idper = idper;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcor != null ? idcor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correo)) {
            return false;
        }
        Correo other = (Correo) object;
        if ((this.idcor == null && other.idcor != null) || (this.idcor != null && !this.idcor.equals(other.idcor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.Correo[ idcor=" + idcor + " ]";
    }
    
}
