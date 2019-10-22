/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.DuracionDao;
import ec.mdg.sisegett.modelo.entidad.Duracion;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPADuracionDao extends JPAGenericDao<Duracion, Integer> implements DuracionDao {

    public JPADuracionDao() {
        super(Duracion.class);
    }

}
