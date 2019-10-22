/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ActividadesDao;
import ec.mdg.sisegett.modelo.entidad.Actividades;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAActividadesDao extends JPAGenericDao<Actividades, Integer> implements ActividadesDao {

    public JPAActividadesDao() {
        super(Actividades.class);
    }
}
