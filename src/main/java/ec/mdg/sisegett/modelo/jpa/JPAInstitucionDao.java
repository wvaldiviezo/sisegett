/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.InstitucionDao;
import ec.mdg.sisegett.modelo.entidad.Institucion;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAInstitucionDao extends JPAGenericDao<Institucion, Integer> implements InstitucionDao{
    
    public JPAInstitucionDao(){
        super(Institucion.class);
    }
    
}
