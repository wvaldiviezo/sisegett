/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.EjesDao;
import ec.mdg.sisegett.modelo.entidad.Ejes;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEjesDao extends JPAGenericDao<Ejes, Integer> implements EjesDao{
    
    public JPAEjesDao(){
        super(Ejes.class);
    }
    
}
