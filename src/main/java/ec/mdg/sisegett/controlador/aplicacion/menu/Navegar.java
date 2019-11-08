/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.menu;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "navegar")
@SessionScoped
public class Navegar implements Serializable {

    private static final long serialVersionUID = 1L;
    private String mensaje;

    public Navegar() {
        mensaje = "Acción Correcta";
    }

    /*Método para direccionar a la Página principal*/
    public void direccionarInicio() {
        try {
            System.err.println("mensaje " + mensaje);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje:", mensaje);
            FacesContext.getCurrentInstance().addMessage(null, message);
            FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);

            System.out.println("LOGRO REDIRECCIONAR A UN NUEVO FORMULARIO");
//            FacesContext.getCurrentInstance().getExternalContext().redirect("../Inicio/paginaInicial.xhtml");
            FacesContext.getCurrentInstance().getExternalContext().redirect("./../administracion/bienvenida.sisegett");

        } catch (Exception e) {
            System.out.println("FALLO LA REDIRECCION A UN NUEVO FORMULARIO");
            e.printStackTrace();
        }
    }

    /*Método para direccionar a la Página principal*/
    //public void direccionarConsulta() {
    public void direccionarConsulta() {
        try {
            System.err.println("mensaje" + mensaje);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje:", mensaje);
            FacesContext.getCurrentInstance().addMessage(null, message);
            FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);

            System.out.println("LOGRO REDIRECCIONAR A UN NUEVO FORMULARIO");
//            FacesContext.getCurrentInstance().getExternalContext().redirect("../Inicio/paginaInicial.xhtml");

            FacesContext.getCurrentInstance().getExternalContext().redirect("./../aplicacion/listarAcciones.sisegett");

        } catch (Exception e) {
            System.out.println("FALLO LA REDIRECCION A LA CONSULTA DE JUICIOS");
            e.printStackTrace();
        }
    }

    public void direccionarNuevo() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("./../aplicacion/registrarAccion.sisegett");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void direccionarNuevaActividad() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("./../aplicacion/registrarActividad.sisegett");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}//Fin de la clase
