/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author wilmer.valdiviezo
 */
@Entity
@Table(name = "persona", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdper", query = "SELECT p FROM Persona p WHERE p.idper = :idper"),
    @NamedQuery(name = "Persona.findByNombresper", query = "SELECT p FROM Persona p WHERE p.nombresper = :nombresper"),
    @NamedQuery(name = "Persona.findByApellidosper", query = "SELECT p FROM Persona p WHERE p.apellidosper = :apellidosper"),
    @NamedQuery(name = "Persona.findByCedulaper", query = "SELECT p FROM Persona p WHERE p.cedulaper = :cedulaper"),
    @NamedQuery(name = "Persona.findByCargoper", query = "SELECT p FROM Persona p WHERE p.cargoper = :cargoper"),
    @NamedQuery(name = "Persona.findByTelefonoper", query = "SELECT p FROM Persona p WHERE p.telefonoper = :telefonoper"),
    @NamedQuery(name = "Persona.findByCelularper", query = "SELECT p FROM Persona p WHERE p.celularper = :celularper"),
    @NamedQuery(name = "Persona.findByLoginper", query = "SELECT p FROM Persona p WHERE p.loginper = :loginper"),
    @NamedQuery(name = "Persona.findByClaveper", query = "SELECT p FROM Persona p WHERE p.claveper = :claveper"),
    @NamedQuery(name = "Persona.findByEstadoper", query = "SELECT p FROM Persona p WHERE p.estadoper = :estadoper"),
    @NamedQuery(name = "Persona.findByTipousuariomenuper", query = "SELECT p FROM Persona p WHERE p.tipousuariomenuper = :tipousuariomenuper"),
    @NamedQuery(name = "Persona.findByAufecharegistroper", query = "SELECT p FROM Persona p WHERE p.aufecharegistroper = :aufecharegistroper"),
    @NamedQuery(name = "Persona.findByAuusuarioregistroper", query = "SELECT p FROM Persona p WHERE p.auusuarioregistroper = :auusuarioregistroper"),
    @NamedQuery(name = "Persona.findByAufechamodificacionper", query = "SELECT p FROM Persona p WHERE p.aufechamodificacionper = :aufechamodificacionper"),
    @NamedQuery(name = "Persona.findByAuusuariomodificacionper", query = "SELECT p FROM Persona p WHERE p.auusuariomodificacionper = :auusuariomodificacionper")})
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idper")
    private Integer idper;
    @Size(max = 255)
    @Column(name = "nombresper")
    private String nombresper;
    @Size(max = 255)
    @Column(name = "apellidosper")
    private String apellidosper;
    @Size(max = 15)
    @Column(name = "cedulaper")
    private String cedulaper;
    @Size(max = 150)
    @Column(name = "cargoper")
    private String cargoper;
    @Size(max = 20)
    @Column(name = "telefonoper")
    private String telefonoper;
    @Size(max = 10)
    @Column(name = "celularper")
    private String celularper;
    @Size(max = 50)
    @Column(name = "loginper")
    private String loginper;
    @Size(max = 15)
    @Column(name = "claveper")
    private String claveper;
    @Column(name = "estadoper")
    private Boolean estadoper;
    @Size(max = 3)
    @Column(name = "tipousuariomenuper")
    private String tipousuariomenuper;
    @Column(name = "aufecharegistroper")
    @Temporal(TemporalType.DATE)
    private Date aufecharegistroper;
    @Size(max = 100)
    @Column(name = "auusuarioregistroper")
    private String auusuarioregistroper;
    @Column(name = "aufechamodificacionper")
    @Temporal(TemporalType.DATE)
    private Date aufechamodificacionper;
    @Size(max = 100)
    @Column(name = "auusuariomodificacionper")
    private String auusuariomodificacionper;
    @JoinColumn(name = "idins", referencedColumnName = "idins")
    @ManyToOne(optional = false)
    private Institucion idins;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idper")
    private List<Correo> correoList;

    public Persona() {
    }

    public Persona(Integer idper) {
        this.idper = idper;
    }

    public Integer getIdper() {
        return idper;
    }

    public void setIdper(Integer idper) {
        this.idper = idper;
    }

    public String getNombresper() {
        return nombresper;
    }

    public void setNombresper(String nombresper) {
        this.nombresper = nombresper;
    }

    public String getApellidosper() {
        return apellidosper;
    }

    public void setApellidosper(String apellidosper) {
        this.apellidosper = apellidosper;
    }

    public String getCedulaper() {
        return cedulaper;
    }

    public void setCedulaper(String cedulaper) {
        this.cedulaper = cedulaper;
    }

    public String getCargoper() {
        return cargoper;
    }

    public void setCargoper(String cargoper) {
        this.cargoper = cargoper;
    }

    public String getTelefonoper() {
        return telefonoper;
    }

    public void setTelefonoper(String telefonoper) {
        this.telefonoper = telefonoper;
    }

    public String getCelularper() {
        return celularper;
    }

    public void setCelularper(String celularper) {
        this.celularper = celularper;
    }

    public String getLoginper() {
        return loginper;
    }

    public void setLoginper(String loginper) {
        this.loginper = loginper;
    }

    public String getClaveper() {
        return claveper;
    }

    public void setClaveper(String claveper) {
        this.claveper = claveper;
    }

    public Boolean getEstadoper() {
        return estadoper;
    }

    public void setEstadoper(Boolean estadoper) {
        this.estadoper = estadoper;
    }

    public String getTipousuariomenuper() {
        return tipousuariomenuper;
    }

    public void setTipousuariomenuper(String tipousuariomenuper) {
        this.tipousuariomenuper = tipousuariomenuper;
    }

    public Date getAufecharegistroper() {
        return aufecharegistroper;
    }

    public void setAufecharegistroper(Date aufecharegistroper) {
        this.aufecharegistroper = aufecharegistroper;
    }

    public String getAuusuarioregistroper() {
        return auusuarioregistroper;
    }

    public void setAuusuarioregistroper(String auusuarioregistroper) {
        this.auusuarioregistroper = auusuarioregistroper;
    }

    public Date getAufechamodificacionper() {
        return aufechamodificacionper;
    }

    public void setAufechamodificacionper(Date aufechamodificacionper) {
        this.aufechamodificacionper = aufechamodificacionper;
    }

    public String getAuusuariomodificacionper() {
        return auusuariomodificacionper;
    }

    public void setAuusuariomodificacionper(String auusuariomodificacionper) {
        this.auusuariomodificacionper = auusuariomodificacionper;
    }

    public Institucion getIdins() {
        return idins;
    }

    public void setIdins(Institucion idins) {
        this.idins = idins;
    }

    @XmlTransient
    public List<Correo> getCorreoList() {
        return correoList;
    }

    public void setCorreoList(List<Correo> correoList) {
        this.correoList = correoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idper != null ? idper.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idper == null && other.idper != null) || (this.idper != null && !this.idper.equals(other.idper))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Persona[ idper=" + idper + " ]";
    }
    
}
