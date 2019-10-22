/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.CorreoDao;
import ec.mdg.sisegett.modelo.entidad.Correo;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPACorreoDao extends JPAGenericDao<Correo, Integer> implements CorreoDao {

    public JPACorreoDao() {
        super(Correo.class);
    }

}
