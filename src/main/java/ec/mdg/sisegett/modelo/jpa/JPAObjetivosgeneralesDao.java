/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ObjetivosgeneralesDao;
import ec.mdg.sisegett.modelo.entidad.Objetivosgenerales;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAObjetivosgeneralesDao extends JPAGenericDao<Objetivosgenerales, Integer> implements ObjetivosgeneralesDao {

    public JPAObjetivosgeneralesDao() {
        super(Objetivosgenerales.class);
    }

    @Override
    public List<Objetivosgenerales> buscarObjGeneralPorEje(int idEje) {
        List objGeneralSeleccionado = null;
        try {
            String consulta = "select * from ejes ej,objetivosgenerales g \n"
                    + "where g.ideje = ej.ideje\n"
                    + "and ej.ideje = " + idEje;
            Query query = em.createNativeQuery(consulta, Objetivosgenerales.class);
            objGeneralSeleccionado = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en buscarObjGeneralPorEje");
        }
        return objGeneralSeleccionado;
    }
}
