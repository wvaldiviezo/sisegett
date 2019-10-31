/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.aplicacion;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Importancia;
import ec.mdg.sisegett.modelo.entidad.Objetivosespecificos;
import ec.mdg.sisegett.modelo.entidad.Tipoproyecto;
import ec.mdg.sisegett.modelo.entidad.Tiposacciones;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "verAccion")
@SessionScoped
public class VerAccion implements Serializable{
    
     private static final long serialVersionUID = 1L;
     //
     private Acciones accionAct;
     private Objetivosespecificos objEspecificosAct;
     private Tipoproyecto tipoproyectoAct;
     private Tiposacciones tiposaccionesAct;
     private Importancia importanciaAct;
     
     
     //constructor
    public VerAccion(){
        
    }
    
    public void obtenerUltimaActividad (){
        
    }
    
    //getter & setters

    public Acciones getAccionAct() {
        return accionAct;
    }

    public void setAccionAct(Acciones accionAct) {
        this.accionAct = accionAct;
    }

    public Objetivosespecificos getObjEspecificosAct() {
        return objEspecificosAct;
    }

    public void setObjEspecificosAct(Objetivosespecificos objEspecificosAct) {
        this.objEspecificosAct = objEspecificosAct;
    }

    public Tipoproyecto getTipoproyectoAct() {
        return tipoproyectoAct;
    }

    public void setTipoproyectoAct(Tipoproyecto tipoproyectoAct) {
        this.tipoproyectoAct = tipoproyectoAct;
    }

    public Tiposacciones getTiposaccionesAct() {
        return tiposaccionesAct;
    }

    public void setTiposaccionesAct(Tiposacciones tiposaccionesAct) {
        this.tiposaccionesAct = tiposaccionesAct;
    }

    public Importancia getImportanciaAct() {
        return importanciaAct;
    }

    public void setImportanciaAct(Importancia importanciaAct) {
        this.importanciaAct = importanciaAct;
    }
    
    
    
}//Fin de la clase
