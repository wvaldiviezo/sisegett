/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.aplicacion;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Actividades;
import ec.mdg.sisegett.modelo.entidad.Avance;
import ec.mdg.sisegett.modelo.entidad.Duracion;
import ec.mdg.sisegett.modelo.entidad.Estadogestion;
import ec.mdg.sisegett.modelo.entidad.Peso;
import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "registrarActividad")
@ViewScoped
@SessionScoped
public class RegistrarActividad implements Serializable {

    private static final long serialVersionUID = 1L;

    private Acciones accionAct;
    private Actividades actividades;
    private Peso peso;
    private Duracion duracion;
    private Avance avance;
    private Estadogestion estadoGestion;
    //
    private List<Peso> ltsPeso;
    private List<Duracion> ltsDuracion;
    private List<Avance> ltsAvance;
    private List<Estadogestion> ltsEstadoGestion;
    //
    private int pesoID;
    private int duracionID;
    private int avanceID;
    private int estadoID;
    //Subir Archivos
    private UploadedFile file;

    //Constructor
    public RegistrarActividad() {
        this.accionAct = new Acciones();
        this.actividades = new Actividades();
        //
        ltsPeso = null;
        ltsDuracion = null;
        ltsAvance = null;
        ltsEstadoGestion = null;
        //
        pesoID = 0;
        duracionID = 0;
        avanceID = 0;
        estadoID = 0;

    }

    /**
     * Metodo para registrar la informacion de cada Actividad correspondiente a
     * una Accion
     */
    public void registrarActividad() {
        try {
            System.out.println("metodo: registrarActividad");

            //Guardar el % peso
            this.peso.setIdpes(this.pesoID);
            this.actividades.setIdpes(peso);
            System.out.println("peso: " + peso);
            //Guardar la duracion
            this.duracion.setIddur(pesoID);
            this.actividades.setIddur(duracion);
            System.out.println("duracion: " + duracion);
            //Guardar el % avance
            this.avance.setIdava(avanceID);
            this.actividades.setIdava(avance);
            System.out.println("avance: " + avance);
            //Guardar el estado de gestion
            this.estadoGestion.setIdest(estadoID);
            this.actividades.setIdest(estadoGestion);
            System.out.println("estadoGestion: " + estadoGestion);

            //FALTA INCLUIR LOS DATOS DE AUDITORIA fecha y usuario de registro
            
            //Guardar el Id de la accion
            this.actividades.setIdacc(accionAct);
            System.out.println("IdAccion: " + accionAct);

            System.out.println("actividades: " + actividades);
            JPAFactoryDao.getFactory().getActividadesDao().create(actividades);
            System.out.println("actividades: " + actividades);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Actividad registrada exitosamente"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Actividad NO registrada "));
        }

    }

    //Getter & Setters
    public Acciones getAccionAct() {
        return accionAct;
    }

    public void setAccionAct(Acciones accionAct) {
        this.accionAct = accionAct;
    }

    public Actividades getActividades() {
        return actividades;
    }

    public void setActividades(Actividades actividades) {
        this.actividades = actividades;
    }

    public int getPesoID() {
        return pesoID;
    }

    public void setPesoID(int pesoID) {
        this.pesoID = pesoID;
    }

    public int getDuracionID() {
        return duracionID;
    }

    public void setDuracionID(int duracionID) {
        this.duracionID = duracionID;
    }

    public int getAvanceID() {
        return avanceID;
    }

    public void setAvanceID(int avanceID) {
        this.avanceID = avanceID;
    }

    public List<Peso> getLtsPeso() {
        ltsPeso = JPAFactoryDao.getFactory().getPesoDao().find();
        return ltsPeso;
    }

    public void setLtsPeso(List<Peso> ltsPeso) {
        this.ltsPeso = ltsPeso;
    }

    public List<Duracion> getLtsDuracion() {
        ltsDuracion = JPAFactoryDao.getFactory().getDuracionDao().find();
        return ltsDuracion;
    }

    public void setLtsDuracion(List<Duracion> ltsDuracion) {
        this.ltsDuracion = ltsDuracion;
    }

    public List<Avance> getLtsAvance() {
        ltsAvance = JPAFactoryDao.getFactory().getAvanceDao().find();
        return ltsAvance;
    }

    public void setLtsAvance(List<Avance> ltsAvance) {
        this.ltsAvance = ltsAvance;
    }

    public List<Estadogestion> getLtsEstadoGestion() {
        ltsEstadoGestion = JPAFactoryDao.getFactory().getEstadogestionDao().find();
        return ltsEstadoGestion;
    }

    public void setLtsEstadoGestion(List<Estadogestion> ltsEstadoGestion) {
        this.ltsEstadoGestion = ltsEstadoGestion;
    }

    public int getEstadoID() {
        return estadoID;
    }

    public void setEstadoID(int estadoID) {
        this.estadoID = estadoID;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public void setDuracion(Duracion duracion) {
        this.duracion = duracion;
    }

    public Avance getAvance() {
        return avance;
    }

    public void setAvance(Avance avance) {
        this.avance = avance;
    }

    public Estadogestion getEstadoGestion() {
        return estadoGestion;
    }

    public void setEstadoGestion(Estadogestion estadoGestion) {
        this.estadoGestion = estadoGestion;
    }

    //MODIFICAR la forma de subir los archivos
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

}
