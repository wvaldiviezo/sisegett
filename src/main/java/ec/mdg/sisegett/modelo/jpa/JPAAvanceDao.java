/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.AvanceDao;
import ec.mdg.sisegett.modelo.entidad.Avance;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAAvanceDao extends JPAGenericDao<Avance, Integer> implements AvanceDao {

    public JPAAvanceDao() {
        super(Avance.class);
    }

}
