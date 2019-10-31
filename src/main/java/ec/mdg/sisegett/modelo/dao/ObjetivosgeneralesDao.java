/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.dao;

import ec.mdg.sisegett.modelo.entidad.Objetivosgenerales;
import java.util.List;

/**
 *
 * @author wilmer.valdiviezo
 */
public interface ObjetivosgeneralesDao extends GenericDao<Objetivosgenerales, Integer>{
    List<Objetivosgenerales> buscarObjGeneralPorEje(int idEje);
}
