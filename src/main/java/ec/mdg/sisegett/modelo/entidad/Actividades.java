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
@Table(name = "actividades", catalog = "sisegett", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividades.findAll", query = "SELECT a FROM Actividades a"),
    @NamedQuery(name = "Actividades.findByIdact", query = "SELECT a FROM Actividades a WHERE a.idact = :idact"),
    @NamedQuery(name = "Actividades.findByDescripcionact", query = "SELECT a FROM Actividades a WHERE a.descripcionact = :descripcionact"),
    @NamedQuery(name = "Actividades.findByFechainicioact", query = "SELECT a FROM Actividades a WHERE a.fechainicioact = :fechainicioact"),
    @NamedQuery(name = "Actividades.findByFechafinact", query = "SELECT a FROM Actividades a WHERE a.fechafinact = :fechafinact"),
    @NamedQuery(name = "Actividades.findByAufecharegistroact", query = "SELECT a FROM Actividades a WHERE a.aufecharegistroact = :aufecharegistroact"),
    @NamedQuery(name = "Actividades.findByAuusuarioregistroact", query = "SELECT a FROM Actividades a WHERE a.auusuarioregistroact = :auusuarioregistroact"),
    @NamedQuery(name = "Actividades.findByAufechamodificacionact", query = "SELECT a FROM Actividades a WHERE a.aufechamodificacionact = :aufechamodificacionact"),
    @NamedQuery(name = "Actividades.findByAuusuariomodificaact", query = "SELECT a FROM Actividades a WHERE a.auusuariomodificaact = :auusuariomodificaact")})
public class Actividades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idact")
    private Integer idact;
    @Size(max = 500)
    @Column(name = "descripcionact")
    private String descripcionact;
    @Column(name = "fechainicioact")
    @Temporal(TemporalType.DATE)
    private Date fechainicioact;
    @Column(name = "fechafinact")
    @Temporal(TemporalType.DATE)
    private Date fechafinact;
    @Column(name = "aufecharegistroact")
    @Temporal(TemporalType.DATE)
    private Date aufecharegistroact;
    @Size(max = 100)
    @Column(name = "auusuarioregistroact")
    private String auusuarioregistroact;
    @Column(name = "aufechamodificacionact")
    @Temporal(TemporalType.DATE)
    private Date aufechamodificacionact;
    @Size(max = 100)
    @Column(name = "auusuariomodificaact")
    private String auusuariomodificaact;
    @JoinColumn(name = "idacc", referencedColumnName = "idacc")
    @ManyToOne(optional = false)
    private Acciones idacc;
    @JoinColumn(name = "idava", referencedColumnName = "idava")
    @ManyToOne(optional = false)
    private Avance idava;
    @JoinColumn(name = "iddur", referencedColumnName = "iddur")
    @ManyToOne(optional = false)
    private Duracion iddur;
    @JoinColumn(name = "idest", referencedColumnName = "idest")
    @ManyToOne(optional = false)
    private Estadogestion idest;
    @JoinColumn(name = "idpes", referencedColumnName = "idpes")
    @ManyToOne(optional = false)
    private Peso idpes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idact")
    private List<Archivosverificables> archivosverificablesList;

    public Actividades() {
    }

    public Actividades(Integer idact) {
        this.idact = idact;
    }

    public Integer getIdact() {
        return idact;
    }

    public void setIdact(Integer idact) {
        this.idact = idact;
    }

    public String getDescripcionact() {
        return descripcionact;
    }

    public void setDescripcionact(String descripcionact) {
        this.descripcionact = descripcionact;
    }

    public Date getFechainicioact() {
        return fechainicioact;
    }

    public void setFechainicioact(Date fechainicioact) {
        this.fechainicioact = fechainicioact;
    }

    public Date getFechafinact() {
        return fechafinact;
    }

    public void setFechafinact(Date fechafinact) {
        this.fechafinact = fechafinact;
    }

    public Date getAufecharegistroact() {
        return aufecharegistroact;
    }

    public void setAufecharegistroact(Date aufecharegistroact) {
        this.aufecharegistroact = aufecharegistroact;
    }

    public String getAuusuarioregistroact() {
        return auusuarioregistroact;
    }

    public void setAuusuarioregistroact(String auusuarioregistroact) {
        this.auusuarioregistroact = auusuarioregistroact;
    }

    public Date getAufechamodificacionact() {
        return aufechamodificacionact;
    }

    public void setAufechamodificacionact(Date aufechamodificacionact) {
        this.aufechamodificacionact = aufechamodificacionact;
    }

    public String getAuusuariomodificaact() {
        return auusuariomodificaact;
    }

    public void setAuusuariomodificaact(String auusuariomodificaact) {
        this.auusuariomodificaact = auusuariomodificaact;
    }

    public Acciones getIdacc() {
        return idacc;
    }

    public void setIdacc(Acciones idacc) {
        this.idacc = idacc;
    }

    public Avance getIdava() {
        return idava;
    }

    public void setIdava(Avance idava) {
        this.idava = idava;
    }

    public Duracion getIddur() {
        return iddur;
    }

    public void setIddur(Duracion iddur) {
        this.iddur = iddur;
    }

    public Estadogestion getIdest() {
        return idest;
    }

    public void setIdest(Estadogestion idest) {
        this.idest = idest;
    }

    public Peso getIdpes() {
        return idpes;
    }

    public void setIdpes(Peso idpes) {
        this.idpes = idpes;
    }

    @XmlTransient
    public List<Archivosverificables> getArchivosverificablesList() {
        return archivosverificablesList;
    }

    public void setArchivosverificablesList(List<Archivosverificables> archivosverificablesList) {
        this.archivosverificablesList = archivosverificablesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idact != null ? idact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividades)) {
            return false;
        }
        Actividades other = (Actividades) object;
        if ((this.idact == null && other.idact != null) || (this.idact != null && !this.idact.equals(other.idact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mdg.sisegett.modelo.entidad.Actividades[ idact=" + idact + " ]";
    }
    
}
