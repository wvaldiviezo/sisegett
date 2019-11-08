/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.aplicacion;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Actividades;
import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "listarActividades")
@ViewScoped
@SessionScoped
public class ListarActividades implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Actividades> ltsActividades;

    private Acciones accionAct;
    
    private Actividades actividadesAccion;
    
    private int accionID;

    //Constructor
    public ListarActividades() {
        this.accionAct = new Acciones();
        ltsActividades  = null;
    }

    //Getter & Setter
    public List<Actividades> getLtsActividades() {
        ltsActividades = JPAFactoryDao.getFactory().getActividadesDao().listaActividadesDesc(accionID);
        return ltsActividades;
    }

    public void setLtsActividades(List<Actividades> ltsActividades) {
        this.ltsActividades = ltsActividades;
    }

    public Acciones getAccionAct() {
        return accionAct;
    }

    public void setAccionAct(Acciones accionAct) {
        this.accionAct = accionAct;
        //this.ltsActividades = JPAFactoryDao.getFactory().getActividadesDao().listaActividadesDesc(accionAct);
    }

    public Actividades getActividadesAccion() {
        return actividadesAccion;
    }

    public void setActividadesAccion(Actividades actividadesAccion) {
        this.actividadesAccion = actividadesAccion;
    }

    public int getAccionID() {
        return accionID;
    }

    public void setAccionID(int accionID) {
        this.accionID = accionID;
    }
    
    
    
}
