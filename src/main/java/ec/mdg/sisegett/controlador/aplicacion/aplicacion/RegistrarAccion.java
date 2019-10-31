/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.aplicacion;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Ejes;
import ec.mdg.sisegett.modelo.entidad.Importancia;
import ec.mdg.sisegett.modelo.entidad.Institucion;
import ec.mdg.sisegett.modelo.entidad.Objetivosespecificos;
import ec.mdg.sisegett.modelo.entidad.Objetivosgenerales;
import ec.mdg.sisegett.modelo.entidad.Persona;
import ec.mdg.sisegett.modelo.entidad.Tipoproyecto;
import ec.mdg.sisegett.modelo.entidad.Tiposacciones;
import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "registrarAccion")
@SessionScoped
//@RequestScoped
public class RegistrarAccion implements Serializable {

    private List<Tipoproyecto> ltsTipoproyecto;
    private List<Tiposacciones> ltsTiposacciones;
    private List<Importancia> ltsImportancia;
    private List<Ejes> ltsEjes;
    private List<Objetivosgenerales> ltsObjGenerales;
    private List<Objetivosespecificos> ltsObjEspecificos;
    private List<Institucion> ltsInstituciones;
    private List<Persona> ltsPersona;
    //
    private Acciones accion;
    //
    private String[] tipoProyectoseleccionado;
    private int tipoAccionID;
    private int importanciaID;
    private int ejeID;
    private int objGeneralID;
    private int objEspecificoID;
    private int institucionID;
    private int personaID;
    //
    private Tipoproyecto tipoProyecto;
    private Tiposacciones tiposAcciones;
    private Importancia importancia;
    private Objetivosespecificos objEspecificos;
    private Institucion institucion;

    //constructor
    public RegistrarAccion() {

        ltsTipoproyecto = null;
        ltsTiposacciones = null;
        ltsImportancia = null;
        ltsEjes = null;
        ltsObjGenerales = null;
        ltsObjEspecificos = null;
        ltsInstituciones = null;
        ltsPersona = null;
        //
        this.accion = new Acciones();
        this.tipoProyecto = new Tipoproyecto();
        this.tiposAcciones = new Tiposacciones();
        this.importancia = new Importancia();
        this.objEspecificos = new Objetivosespecificos();
        //
        tipoProyectoseleccionado = null;
        this.tipoAccionID = 0;

        importanciaID = 0;
        ejeID = 0;
        objGeneralID = 0;
        objEspecificoID = 0;
        institucionID = 0;
        personaID = 0;
    }

    /**
     * Metodo para registrar los items en la tabla acciones
     */
    public void registrarAccion() {
        System.out.println("Método Registrar ");
        try {
            //Seteo de los items de tablas externas
            //TipoProyecto
            for (String tipoProy : tipoProyectoseleccionado) {
                this.tipoProyecto.setIdtp(Integer.parseInt(tipoProy));
                System.out.println("tipoProy:" + tipoProy);
            }
            //TipoAccion
            this.tiposAcciones.setIdtac(this.tipoAccionID);
            this.accion.setIdtac(tiposAcciones);
            System.out.println("tiposAcciones:" + tiposAcciones);
            //Importancia
            this.importancia.setIdimp(this.importanciaID);
            this.accion.setIdimp(importancia);
            System.out.println("importancia:" + importancia);
            //Obj. Especificos
            this.objEspecificos.setIdobjesp(this.objEspecificoID);
            this.accion.setIdobjesp(objEspecificos);
            System.out.println("objEspecificos:" + objEspecificos);
            //Instituciones - Relacion de Many to Many
            this.institucion.setIdins(this.institucionID);
            System.out.println("institucion: "+institucionID);
            this.accion.setInstitucionList((List<Institucion>) institucion);
            
            //Setteo de la informacion en la tabla
            JPAFactoryDao.getFactory().getAccionesDao().create(accion);

            //Emision de mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Información de la Acción registrada exitosamente"));

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Información de la Acción NO registrada "));
            System.out.println("Cae en el catch del método registrarAccion");
        }

    //
    }

//Getter & Setters
    /**
     * LLena los checkbox con la lista de la tabla tipoProyecto
     *
     * @return
     */
    public List<Tipoproyecto> getLtsTipoproyecto() {
        ltsTipoproyecto = JPAFactoryDao.getFactory().getTipoproyectoDao().find();
        return ltsTipoproyecto;
    }

    public void setLtsTipoproyecto(List<Tipoproyecto> ltsTipoproyecto) {
        this.ltsTipoproyecto = ltsTipoproyecto;
    }

    /**
     * LLena el combo Tipo con la lista de la tabla importancia
     *
     * @return
     */
    public List<Tiposacciones> getLtsTiposacciones() {
        ltsTiposacciones = JPAFactoryDao.getFactory().getTiposaccionesDao().find();
        return ltsTiposacciones;
    }

    public void setLtsTiposacciones(List<Tiposacciones> ltsTiposacciones) {
        this.ltsTiposacciones = ltsTiposacciones;
    }

    /**
     * LLena el combo Importancia con la lista de la tabla tiposAcciones
     *
     * @return
     */
    public List<Importancia> getLtsImportancia() {
        ltsImportancia = JPAFactoryDao.getFactory().getImportanciaDao().find();
        return ltsImportancia;
    }

    public void setLtsImportancia(List<Importancia> ltsImportancia) {
        this.ltsImportancia = ltsImportancia;
    }

    public String[] getTipoProyectoseleccionado() {
        return tipoProyectoseleccionado;
    }

    public void setTipoProyectoseleccionado(String[] tipoProyectoseleccionado) {
        this.tipoProyectoseleccionado = tipoProyectoseleccionado;
    }

    public int getTipoAccionID() {
        return tipoAccionID;
    }

    public void setTipoAccionID(int tipoAccionID) {
        this.tipoAccionID = tipoAccionID;
    }

    public int getImportanciaID() {
        return importanciaID;
    }

    public void setImportanciaID(int importanciaID) {
        this.importanciaID = importanciaID;
    }

    /**
     * LLena el combo Ejes con la lista de la tabla ejes
     *
     * @return
     */
    public List<Ejes> getLtsEjes() {
        ltsEjes = JPAFactoryDao.getFactory().getEjesDao().find();
        return ltsEjes;
    }

    public void setLtsEjes(List<Ejes> ltsEjes) {
        this.ltsEjes = ltsEjes;
    }

    public int getEjeID() {
        return ejeID;
    }

    public void setEjeID(int ejeID) {
        this.ejeID = ejeID;
    }

    public int getObjGeneralID() {
        return objGeneralID;
    }

    public void setObjGeneralID(int objGeneralID) {
        this.objGeneralID = objGeneralID;
    }

    /**
     * LLena el combo Objetivo General con la lista de la tabla
     * objetivosGenerales
     *
     * @return
     */
    public List<Objetivosgenerales> getLtsObjGenerales() {
        ltsObjGenerales = JPAFactoryDao.getFactory().getObjetivosgeneralesDao().buscarObjGeneralPorEje(ejeID);
        return ltsObjGenerales;
    }

    public void setLtsObjGenerales(List<Objetivosgenerales> ltsObjGenerales) {
        this.ltsObjGenerales = ltsObjGenerales;
    }

    /**
     * LLena el combo Objetivo Especifico con la lista de la tabla
     * objetivosEspecificos
     *
     * @return
     */
    public List<Objetivosespecificos> getLtsObjEspecificos() {
        ltsObjEspecificos = JPAFactoryDao.getFactory().getObjetivosespecificosDao().buscarObjEspecificoPorObjGeneral(objGeneralID);
        return ltsObjEspecificos;
    }

    public void setLtsObjEspecificos(List<Objetivosespecificos> ltsObjEspecificos) {
        this.ltsObjEspecificos = ltsObjEspecificos;
    }

    /**
     * LLena el combo Institusiones con la lista de la tabla institucion
     *
     * @return
     */
    public List<Institucion> getLtsInstituciones() {
        ltsInstituciones = JPAFactoryDao.getFactory().getInstitucionDao().find();
        return ltsInstituciones;
    }

    public void setLtsInstituciones(List<Institucion> ltsInstituciones) {
        this.ltsInstituciones = ltsInstituciones;
    }

    /**
     * LLena el combo Institusiones con la lista de la tabla institucion
     *
     * @return
     */
    public List<Persona> getLtsPersona() {
        //ltsInstituciones = JPAFactoryDao.getFactory().getInstitucionDao().find();
        ltsPersona = JPAFactoryDao.getFactory().getPersonaDao().find();
        return ltsPersona;
    }

    public void setLtsPersona(List<Persona> ltsPersona) {
        this.ltsPersona = ltsPersona;
    }

    public int getObjEspecificoID() {
        return objEspecificoID;
    }

    public void setObjEspecificoID(int objEspecificoID) {
        this.objEspecificoID = objEspecificoID;
    }

    public int getInstitucionID() {
        return institucionID;
    }

    public void setInstitucionID(int institucionID) {
        this.institucionID = institucionID;
    }

    public int getPersonaID() {
        return personaID;
    }

    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }

    public Acciones getAccion() {
        return accion;
    }

    public void setAccion(Acciones accion) {
        this.accion = accion;
    }

    public Tipoproyecto getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(Tipoproyecto tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public Tiposacciones getTiposAcciones() {
        return tiposAcciones;
    }

    public void setTiposAcciones(Tiposacciones tiposAcciones) {
        this.tiposAcciones = tiposAcciones;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }

    public Objetivosespecificos getObjEspecificos() {
        return objEspecificos;
    }

    public void setObjEspecificos(Objetivosespecificos objEspecificos) {
        this.objEspecificos = objEspecificos;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    
    

}//Fin de la clase
