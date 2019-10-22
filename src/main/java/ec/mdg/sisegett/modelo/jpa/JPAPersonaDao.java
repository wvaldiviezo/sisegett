/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.PersonaDao;
import ec.mdg.sisegett.modelo.entidad.Persona;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAPersonaDao extends JPAGenericDao<Persona, Integer> implements PersonaDao{
    
    public JPAPersonaDao(){
        super(Persona.class);
    }
    
}
