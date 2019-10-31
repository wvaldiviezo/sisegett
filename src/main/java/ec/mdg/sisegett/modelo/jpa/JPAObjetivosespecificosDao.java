/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ObjetivosespecificosDao;
import ec.mdg.sisegett.modelo.entidad.Objetivosespecificos;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAObjetivosespecificosDao extends JPAGenericDao<Objetivosespecificos, Integer> implements ObjetivosespecificosDao {

    public JPAObjetivosespecificosDao() {
        super(Objetivosespecificos.class);
    }
    
    @Override
    public List<Objetivosespecificos> buscarObjEspecificoPorObjGeneral(int idObjGen) {
        List objEspecificoSeleccionado = null;
        try {
            String consulta = "select * from objetivosespecificos es,objetivosgenerales g,ejes ej\n"
                    + "where g.ideje = ej.ideje\n"
                    + "and es.idobjgen = g.idobjgen\n"
                    + "and g.idobjgen = " + idObjGen;
            Query query = em.createNativeQuery(consulta, Objetivosespecificos.class);
            objEspecificoSeleccionado = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en buscarObjEspecificoPorObjGeneral");
        }
        return objEspecificoSeleccionado;
    }

}
