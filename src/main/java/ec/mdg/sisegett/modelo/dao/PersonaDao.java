/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.dao;

import ec.mdg.sisegett.modelo.entidad.Persona;
import java.util.List;

/**
 *
 * @author wilmer.valdiviezo
 */
public interface PersonaDao extends GenericDao<Persona, Integer>{
    
    List<Persona> buscarPersonaPorInstitucion(int idins);
    
}
