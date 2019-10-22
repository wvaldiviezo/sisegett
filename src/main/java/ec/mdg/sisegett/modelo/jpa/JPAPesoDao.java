/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.PesoDao;
import ec.mdg.sisegett.modelo.entidad.Peso;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAPesoDao extends JPAGenericDao<Peso, Integer> implements PesoDao{
    
    public JPAPesoDao(){
        super(Peso.class);
    }
    
}
