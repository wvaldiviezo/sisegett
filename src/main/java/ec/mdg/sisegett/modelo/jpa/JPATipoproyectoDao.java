/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.TipoproyectoDao;
import ec.mdg.sisegett.modelo.entidad.Tipoproyecto;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPATipoproyectoDao extends JPAGenericDao<Tipoproyecto, Integer> implements TipoproyectoDao {

    public JPATipoproyectoDao() {
        super(Tipoproyecto.class);
    }

}
