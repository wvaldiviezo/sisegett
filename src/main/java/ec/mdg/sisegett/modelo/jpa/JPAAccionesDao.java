/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.AccionesDao;
import ec.mdg.sisegett.modelo.entidad.Acciones;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAAccionesDao extends JPAGenericDao<Acciones, Integer> implements AccionesDao{
    
    public JPAAccionesDao(){
        super(Acciones.class);
    }
    
    /**
     * Consultar todos las Acciones Registradas que se muestran en la vista listarAcciones.xhtml
     * @return 
     */
    @Override
    public List<Acciones> listarAccionesDesc(){
        List accionesDesc = null;
        try {
            String consulta = "select a from Acciones a order by a.idacc DESC";
            Query query = em.createQuery(consulta);
            accionesDesc = query.getResultList();
        } catch (Exception e) {
            System.out.println("No hay aciones registradas");
        }
        return accionesDesc;
    }
    
}
