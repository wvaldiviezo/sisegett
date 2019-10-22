/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.controlador.aplicacion.menu;

import ec.mdg.sisegett.modelo.entidad.Menu;
import ec.mdg.sisegett.modelo.entidad.Persona;
import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "menuController")
@SessionScoped
public class MenuController implements Serializable {

    private List<Menu> lista;   //Lista de menus que va a traer el EJB
    //definición de un modelo - Opción de PrimeFaces
    private MenuModel model;

    @PostConstruct
    public void inicioVariables() {
        this.listarMenus(); //trae la lista de menus, apenas se cree este Controller
        model = new DefaultMenuModel(); //inicialización del modelo
        this.establecerPermisos();
    }

    public void listarMenus() {
        try {

            lista = JPAFactoryDao.getFactory().getMenuDao().find();
//               impresion de items del menu
//               for(Menu l : lista){
//                   System.out.println(l.getNombremenu());
//               }
            System.out.println("SI entro a la lista de menu");
        } catch (Exception e) {
            //mensaje de JSF
            System.out.println("NO entro a la lista de menu");
        }
    }

    /*Getters & Setters del modelo*/
    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }
    /*Metodo para obtener las opciones de un menú dinámico, de acuerdo al usuario logueado*/

    public void establecerPermisos() {
        System.out.println("entro a establecer permisos en menu controller");
        //captura del tipo de usuario que ha iniciado sesión
        Persona us = (Persona) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");

        for (Menu m : lista) {
            if (m.getTipomen().equals("S") && m.getTipousuariomen().equals(us.getTipousuariomenuper())) {    //nombre de acuerdo a lo q tenemos en la base de datos
                //definición del submenu
                DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getDescripcionmen()); //m.getNombreMenu() -> titulo del Submenu
                //recorrer la lista
                for (Menu i : lista) {
                    Menu submenu = i.getCodigosubmen();
                    // Menu submenu = i.getSubmenu;  //referencia de la concurrencia
                    if (submenu != null) {
                        if (submenu.getIdmen() == m.getIdmen()) { // Nos aseguramos que el item pertenezca al submenu; ya que el submenu tiene como código el mismo código del item
                            DefaultMenuItem item = new DefaultMenuItem(i.getDescripcionmen());
                            //redireccionar a la pagina de la opción del menu
                            item.setUrl(i.getRutamen());
                            firstSubmenu.addElement(item);
                        }
                    }
                }
                model.addElement(firstSubmenu);     //indicar al modelo que agregue ese submenu
            } else {//Si, no es un Submenu
                if (m.getCodigosubmen() == null && m.getTipousuariomen().equals(us.getTipousuariomenuper())) {
                    DefaultMenuItem item = new DefaultMenuItem(m.getDescripcionmen());  //no es de parte de un menu y es independiente

                    item.setUrl(m.getRutamen());

                    //agregar al modelo, es decir al menú principal
                    model.addElement(item);
                }
            }
        }
    }

    /*Método para cerrar la sesión de usuario*/
    public void cerrarSesion() {
        //destrucción de todas las variables almacenadas en el FacesContex
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    /*Método para obtener el nombre de usuario logueado*/
    public String mostrarUsuarioLogueado() {
        //captura del tipo de usuario que ha iniciado sesión
        Persona us = (Persona) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return us.getLoginper();
    }

}//Fin de la clase
