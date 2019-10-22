/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.ArchivosverificablesDao;
import ec.mdg.sisegett.modelo.entidad.Archivosverificables;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAArchivosverificablesDao extends JPAGenericDao<Archivosverificables, Integer> implements ArchivosverificablesDao {

    public JPAArchivosverificablesDao() {
        super(Archivosverificables.class);
    }
}
