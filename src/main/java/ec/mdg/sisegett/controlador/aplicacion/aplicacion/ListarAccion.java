/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.aplicacion;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "listarAccion")
@ViewScoped
public class ListarAccion  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<Acciones> ltsAcciones;
    //
    private Acciones accionActual;
    
    //Ver
    @ManagedProperty("#{verAccion}")
    private VerAccion ctrVerAccion;
    
    //Editar
    @ManagedProperty("#{actualizarAccion}")
    private ActualizarAcccion ctrActualizarAcccion;
    
    /**
     * Constructor
     */
    public ListarAccion(){
        ltsAcciones = null;
    }
    
    /**
     * Método que llama al controlador VerAccion para ver el detalle de la información con la cual se registro una Accion;
     * @return 
     */
    public String verAccion(){
        getCtrVerAccion().setAccionAct(accionActual);
        return "detalleAccion.sisegett";
    }
    
    /**
     * Método que llama al controlador ActualizarAccion para ver la información con la cual se registro una Accion y editar la misma;
     * @return 
     */
    public String actualizarAccion(int idacc){
        Acciones acc = (Acciones)JPAFactoryDao.getFactory().getAccionesDao().read(Integer.valueOf(idacc));
        getCtrActualizarAcccion().setAccionAct(acc);
        return "actualizarAccion.sisegett";
    }
    
        //Método para eliminar
    public String eliminarJuicio(int idacc) {
        JPAFactoryDao.getFactory().getAccionesDao().deleteByID(Integer.valueOf(idacc));
        return "listarAcciones.sisegett";
    }
    
    //Getters & Setter

    public List<Acciones> getLtsAcciones() {
        //this.ltsAcciones = null;
        //if(this.ltsAcciones == null){
         ltsAcciones = JPAFactoryDao.getFactory().getAccionesDao().listarAccionesDesc();   
        //}
        return this.ltsAcciones;
    }

    public void setLtsAcciones(List<Acciones> ltsAcciones) {
        this.ltsAcciones = ltsAcciones;
    }

    public Acciones getAccion() {
        return accionActual;
    }

    public void setAccion(Acciones accion) {
        this.accionActual = accion;
    }

    public VerAccion getCtrVerAccion() {
        return ctrVerAccion;
    }

    public void setCtrVerAccion(VerAccion ctrVerAccion) {
        this.ctrVerAccion = ctrVerAccion;
    }

    public Acciones getAccionActual() {
        return accionActual;
    }

    public void setAccionActual(Acciones accionActual) {
        this.accionActual = accionActual;
    }

    public ActualizarAcccion getCtrActualizarAcccion() {
        return ctrActualizarAcccion;
    }

    public void setCtrActualizarAcccion(ActualizarAcccion ctrActualizarAcccion) {
        this.ctrActualizarAcccion = ctrActualizarAcccion;
    }

    
    
}//Fin de la clase
