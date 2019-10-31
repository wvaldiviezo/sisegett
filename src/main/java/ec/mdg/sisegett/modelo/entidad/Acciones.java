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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "acciones", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acciones.findAll", query = "SELECT a FROM Acciones a"),
    @NamedQuery(name = "Acciones.findByIdacc", query = "SELECT a FROM Acciones a WHERE a.idacc = :idacc"),
    @NamedQuery(name = "Acciones.findByDescripcionacc", query = "SELECT a FROM Acciones a WHERE a.descripcionacc = :descripcionacc"),
    @NamedQuery(name = "Acciones.findByFechainicioacc", query = "SELECT a FROM Acciones a WHERE a.fechainicioacc = :fechainicioacc"),
    @NamedQuery(name = "Acciones.findByFechafinacc", query = "SELECT a FROM Acciones a WHERE a.fechafinacc = :fechafinacc"),
    @NamedQuery(name = "Acciones.findByDetalleavanceacc", query = "SELECT a FROM Acciones a WHERE a.detalleavanceacc = :detalleavanceacc"),
    @NamedQuery(name = "Acciones.findByAufecharegistroacc", query = "SELECT a FROM Acciones a WHERE a.aufecharegistroacc = :aufecharegistroacc"),
    @NamedQuery(name = "Acciones.findByAuusuarioregistroacc", query = "SELECT a FROM Acciones a WHERE a.auusuarioregistroacc = :auusuarioregistroacc"),
    @NamedQuery(name = "Acciones.findByAufechamodificaacc", query = "SELECT a FROM Acciones a WHERE a.aufechamodificaacc = :aufechamodificaacc"),
    @NamedQuery(name = "Acciones.findByAuusuariomodificaacc", query = "SELECT a FROM Acciones a WHERE a.auusuariomodificaacc = :auusuariomodificaacc")})
public class Acciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacc")
    private Integer idacc;
    @Size(max = 500)
    @Column(name = "descripcionacc")
    private String descripcionacc;
    @Column(name = "fechainicioacc")
    @Temporal(TemporalType.DATE)
    private Date fechainicioacc;
    @Column(name = "fechafinacc")
    @Temporal(TemporalType.DATE)
    private Date fechafinacc;
    @Size(max = 1000)
    @Column(name = "detalleavanceacc")
    private String detalleavanceacc;
    @Column(name = "aufecharegistroacc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aufecharegistroacc;
    @Size(max = 100)
    @Column(name = "auusuarioregistroacc")
    private String auusuarioregistroacc;
    @Column(name = "aufechamodificaacc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aufechamodificaacc;
    @Size(max = 100)
    @Column(name = "auusuariomodificaacc")
    private String auusuariomodificaacc;
    @JoinTable(name = "relationship_14", joinColumns = {
        @JoinColumn(name = "idacc", referencedColumnName = "idacc")}, inverseJoinColumns = {
        @JoinColumn(name = "idins", referencedColumnName = "idins")})
    @ManyToMany
    private List<Institucion> institucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idacc")
    private List<Actividades> actividadesList;
    @JoinColumn(name = "idimp", referencedColumnName = "idimp")
    @ManyToOne(optional = false)
    private Importancia idimp;
    @JoinColumn(name = "idobjesp", referencedColumnName = "idobjesp")
    @ManyToOne(optional = false)
    private Objetivosespecificos idobjesp;
    @JoinColumn(name = "idtp", referencedColumnName = "idtp")
    @ManyToOne(optional = false)
    private Tipoproyecto idtp;
    @JoinColumn(name = "idtac", referencedColumnName = "idtac")
    @ManyToOne(optional = false)
    private Tiposacciones idtac;

    public Acciones() {
    }

    public Acciones(Integer idacc) {
        this.idacc = idacc;
    }

    public Integer getIdacc() {
        return idacc;
    }

    public void setIdacc(Integer idacc) {
        this.idacc = idacc;
    }

    public String getDescripcionacc() {
        return descripcionacc;
    }

    public void setDescripcionacc(String descripcionacc) {
        this.descripcionacc = descripcionacc;
    }

    public Date getFechainicioacc() {
        return fechainicioacc;
    }

    public void setFechainicioacc(Date fechainicioacc) {
        this.fechainicioacc = fechainicioacc;
    }

    public Date getFechafinacc() {
        return fechafinacc;
    }

    public void setFechafinacc(Date fechafinacc) {
        this.fechafinacc = fechafinacc;
    }

    public String getDetalleavanceacc() {
        return detalleavanceacc;
    }

    public void setDetalleavanceacc(String detalleavanceacc) {
        this.detalleavanceacc = detalleavanceacc;
    }

    public Date getAufecharegistroacc() {
        return aufecharegistroacc;
    }

    public void setAufecharegistroacc(Date aufecharegistroacc) {
        this.aufecharegistroacc = aufecharegistroacc;
    }

    public String getAuusuarioregistroacc() {
        return auusuarioregistroacc;
    }

    public void setAuusuarioregistroacc(String auusuarioregistroacc) {
        this.auusuarioregistroacc = auusuarioregistroacc;
    }

    public Date getAufechamodificaacc() {
        return aufechamodificaacc;
    }

    public void setAufechamodificaacc(Date aufechamodificaacc) {
        this.aufechamodificaacc = aufechamodificaacc;
    }

    public String getAuusuariomodificaacc() {
        return auusuariomodificaacc;
    }

    public void setAuusuariomodificaacc(String auusuariomodificaacc) {
        this.auusuariomodificaacc = auusuariomodificaacc;
    }

    @XmlTransient
    public List<Institucion> getInstitucionList() {
        return institucionList;
    }

    public void setInstitucionList(List<Institucion> institucionList) {
        this.institucionList = institucionList;
    }

    @XmlTransient
    public List<Actividades> getActividadesList() {
        return actividadesList;
    }

    public void setActividadesList(List<Actividades> actividadesList) {
        this.actividadesList = actividadesList;
    }

    public Importancia getIdimp() {
        return idimp;
    }

    public void setIdimp(Importancia idimp) {
        this.idimp = idimp;
    }

    public Objetivosespecificos getIdobjesp() {
        return idobjesp;
    }

    public void setIdobjesp(Objetivosespecificos idobjesp) {
        this.idobjesp = idobjesp;
    }

    public Tipoproyecto getIdtp() {
        return idtp;
    }

    public void setIdtp(Tipoproyecto idtp) {
        this.idtp = idtp;
    }

    public Tiposacciones getIdtac() {
        return idtac;
    }

    public void setIdtac(Tiposacciones idtac) {
        this.idtac = idtac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacc != null ? idacc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acciones)) {
            return false;
        }
        Acciones other = (Acciones) object;
        if ((this.idacc == null && other.idacc != null) || (this.idacc != null && !this.idacc.equals(other.idacc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Acciones[ idacc=" + idacc + " ]";
    }
    
}
