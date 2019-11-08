/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ActividadesDao;
import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Actividades;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAActividadesDao extends JPAGenericDao<Actividades, Integer> implements ActividadesDao {

    public JPAActividadesDao() {
        super(Actividades.class);
    }
    

    /**
     * Método para traer todas las Actividades que corresponden a una Acción
     *
     * @param actv
     * @return
     */
    @Override
    public List<Actividades> listaActividadesDesc(int idacc) {
        List<Actividades> lActividadesDesc = null;
        System.out.println("Entra a la consulta del método listaActividadesDesc ");
        try {
            String consulta = "select * from acciones acc,actividades act\n"
                    + "where acc.idacc = act.idacc\n"
                    + "and acc.idacc = " + idacc;
            Query query = em.createQuery(consulta);
            lActividadesDesc = query.getResultList();
        } catch (Exception e) {
        }
        return lActividadesDesc;
    }
}
