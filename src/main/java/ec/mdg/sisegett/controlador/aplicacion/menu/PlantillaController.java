/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.menu;

import ec.mdg.sisegett.modelo.entidad.Persona;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "plantillaController")
@ViewScoped
public class PlantillaController implements Serializable {

    public void verificarSesion() {
        try {

            System.out.println("entro en comprobacion plantilla controller");
            //Inicialización de la variable
            FacesContext context = FacesContext.getCurrentInstance();
            //Acceso a la variable que se almacena en sesión.
            Persona us = (Persona) context.getExternalContext().getSessionMap().get("usuario"); //usuario -> es el nombre del alias del put en el indexController
            //Empleado us = (Empleado) context.getExternalContext().getSessionMap().get("usuario");
            //verificación si la Sesión esta Activa o No
            if (us == null) { //Si el usuario NO se encuentra iniciado sesión, se hace una redirección
                context.getExternalContext().redirect("./../permisos.xhtml");
            }

        } catch (Exception e) {
            //log para guardar el registro de un error
        }
    }
}//Fin de la clase
