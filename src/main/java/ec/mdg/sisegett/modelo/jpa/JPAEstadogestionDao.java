/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.EstadogestionDao;
import ec.mdg.sisegett.modelo.entidad.Estadogestion;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEstadogestionDao extends JPAGenericDao<Estadogestion, Integer> implements EstadogestionDao {

    public JPAEstadogestionDao() {
        super(Estadogestion.class);
    }
}
