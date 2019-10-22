/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.AniosDao;
import ec.mdg.sisegett.modelo.entidad.Anios;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAAniosDao extends JPAGenericDao<Anios, Integer> implements AniosDao {

    public JPAAniosDao() {
        super(Anios.class);
    }
}
