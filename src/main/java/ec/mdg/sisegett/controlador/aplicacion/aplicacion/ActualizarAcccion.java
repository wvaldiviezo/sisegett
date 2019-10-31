/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.aplicacion;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Ejes;
import ec.mdg.sisegett.modelo.entidad.Importancia;
import ec.mdg.sisegett.modelo.entidad.Objetivosespecificos;
import ec.mdg.sisegett.modelo.entidad.Objetivosgenerales;
import ec.mdg.sisegett.modelo.entidad.Tipoproyecto;
import ec.mdg.sisegett.modelo.entidad.Tiposacciones;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "actualizarAccion")
@ViewScoped
@SessionScoped
public class ActualizarAcccion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<Tipoproyecto> ltsTipoproyectoAct;
    private List<Tiposacciones> ltsTiposaccionesAct;
    private List<Importancia> ltsImportanciaAct;
    private List<Ejes> ltsEjesAct;
    private List<Objetivosgenerales> ltsObjGeneralesAct;
    private List<Objetivosespecificos> ltsObjEspecificosAct;
    //
    private Acciones accionAct;
    //
    private int tipoProyectoseleccionado;
    private int tipoAccionID;
    private String importanciaID;
    private String ejeID;
    private String objGeneralID;
    private String objEspecificoID;
    private String institucionID;
    //
    
    /**
     * Constructor
     */
    public ActualizarAcccion(){
        
    }
    
    /**
     * 
     * @return 
     */
    public void actualizarInformacionAcc(){

    }
    
    //getters & setters

    public List<Tipoproyecto> getLtsTipoproyectoAct() {
        return ltsTipoproyectoAct;
    }

    public void setLtsTipoproyectoAct(List<Tipoproyecto> ltsTipoproyectoAct) {
        this.ltsTipoproyectoAct = ltsTipoproyectoAct;
    }

    public List<Tiposacciones> getLtsTiposaccionesAct() {
        return ltsTiposaccionesAct;
    }

    public void setLtsTiposaccionesAct(List<Tiposacciones> ltsTiposaccionesAct) {
        this.ltsTiposaccionesAct = ltsTiposaccionesAct;
    }

    public List<Importancia> getLtsImportanciaAct() {
        return ltsImportanciaAct;
    }

    public void setLtsImportanciaAct(List<Importancia> ltsImportanciaAct) {
        this.ltsImportanciaAct = ltsImportanciaAct;
    }

    public List<Ejes> getLtsEjesAct() {
        return ltsEjesAct;
    }

    public void setLtsEjesAct(List<Ejes> ltsEjesAct) {
        this.ltsEjesAct = ltsEjesAct;
    }

    public List<Objetivosgenerales> getLtsObjGeneralesAct() {
        return ltsObjGeneralesAct;
    }

    public void setLtsObjGeneralesAct(List<Objetivosgenerales> ltsObjGeneralesAct) {
        this.ltsObjGeneralesAct = ltsObjGeneralesAct;
    }

    public List<Objetivosespecificos> getLtsObjEspecificosAct() {
        return ltsObjEspecificosAct;
    }

    public void setLtsObjEspecificosAct(List<Objetivosespecificos> ltsObjEspecificosAct) {
        this.ltsObjEspecificosAct = ltsObjEspecificosAct;
    }

    public Acciones getAccionAct() {
        return accionAct;
    }

    public void setAccionAct(Acciones accionAct) {
        this.accionAct = accionAct;
    }
    
    
    
    
}
