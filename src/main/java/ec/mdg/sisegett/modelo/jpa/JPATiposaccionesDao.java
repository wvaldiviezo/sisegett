/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.TiposaccionesDao;
import ec.mdg.sisegett.modelo.entidad.Tiposacciones;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPATiposaccionesDao extends JPAGenericDao<Tiposacciones, Integer> implements TiposaccionesDao {

    public JPATiposaccionesDao(){
        super(Tiposacciones.class);
    }
    
}
