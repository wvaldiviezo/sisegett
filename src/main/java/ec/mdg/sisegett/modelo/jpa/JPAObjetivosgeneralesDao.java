/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ObjetivosgeneralesDao;
import ec.mdg.sisegett.modelo.entidad.Objetivosgenerales;

/**
 *
 * @author wilmer.valdiviezo 
 */
public class JPAObjetivosgeneralesDao extends JPAGenericDao<Objetivosgenerales, Integer> implements ObjetivosgeneralesDao{
    
    public JPAObjetivosgeneralesDao(){
        super(Objetivosgenerales.class);
    }
    
}
