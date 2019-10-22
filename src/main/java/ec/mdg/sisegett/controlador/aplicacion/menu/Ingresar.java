/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.menu;

import ec.mdg.sisegett.modelo.entidad.Persona;
import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "ingresar")
@RequestScoped
public class Ingresar implements Serializable {

    private String nombreUsuario;
    private String contrasenia;

    private final FacesContext faceContext;

    public Ingresar() {
        this.faceContext = FacesContext.getCurrentInstance();
        nombreUsuario = null;
        contrasenia = null;
    }

    public String validarIngreso() {
        String redireccion = null;
        System.out.println("Ingreso validacion");
        System.out.println("Nombre:" + nombreUsuario);
        System.out.println("Contrasenia:" + contrasenia);
        String[] usuarioNombreCampo = {"loginper"};
        String[] usuarioNombreValor = {nombreUsuario};

        List<Persona> usuarioLista = JPAFactoryDao.getFactory().getPersonaDao().find(usuarioNombreCampo, usuarioNombreValor);

        if (usuarioLista.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Datos Erróneos verifique usuario o contraseña"));
        } else {
            for (Persona usuario : usuarioLista) {
                if (usuario.getClaveper().equals(contrasenia)) {
                    FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Bienvenido"));
                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);

                    redireccion = "/administracion/bienvenida?faces-redirect=true";

                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Datos Erróneos verifique usuario o contraseña"));
                    System.out.println("dato incorrecto");
                }
            }
        }
        return redireccion;
    }
    
    //Getters & Setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}//Fin clase
