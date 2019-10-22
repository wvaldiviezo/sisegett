/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ImportanciaDao;
import ec.mdg.sisegett.modelo.entidad.Importancia;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAImportanciaDao extends JPAGenericDao<Importancia, Integer> implements ImportanciaDao{
    
    public JPAImportanciaDao(){
        super(Importancia.class);
    }
}
