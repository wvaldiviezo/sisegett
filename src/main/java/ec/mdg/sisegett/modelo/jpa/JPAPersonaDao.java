/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.PersonaDao;
import ec.mdg.sisegett.modelo.entidad.Persona;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAPersonaDao extends JPAGenericDao<Persona, Integer> implements PersonaDao{
    
    public JPAPersonaDao(){
        super(Persona.class);
    }
    
    @Override
    public List<Persona> buscarPersonaPorInstitucion(int idins){
        List personaInstitucionSeleccionada = null;
        try {
            String consulta = "select * from institucion i, persona p where i.idins = p.idins and i.idins = "+idins;
            Query query = em.createNativeQuery(consulta, Persona.class);
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en buscarPersonaPorInstitucion");
        }
        return personaInstitucionSeleccionada;
    }
    
}
