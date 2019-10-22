/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.AccionesDao;
import ec.mdg.sisegett.modelo.dao.ActividadesDao;
import ec.mdg.sisegett.modelo.dao.AniosDao;
import ec.mdg.sisegett.modelo.dao.ArchivosverificablesDao;
import ec.mdg.sisegett.modelo.dao.AvanceDao;
import ec.mdg.sisegett.modelo.dao.CorreoDao;
import ec.mdg.sisegett.modelo.dao.DuracionDao;
import ec.mdg.sisegett.modelo.dao.EjesDao;
import ec.mdg.sisegett.modelo.dao.EstadogestionDao;
import ec.mdg.sisegett.modelo.dao.FactoryDao;
import ec.mdg.sisegett.modelo.dao.ImportanciaDao;
import ec.mdg.sisegett.modelo.dao.InstitucionDao;
import ec.mdg.sisegett.modelo.dao.MenuDao;
import ec.mdg.sisegett.modelo.dao.ObjetivosespecificosDao;
import ec.mdg.sisegett.modelo.dao.ObjetivosgeneralesDao;
import ec.mdg.sisegett.modelo.dao.PersonaDao;
import ec.mdg.sisegett.modelo.dao.PesoDao;
import ec.mdg.sisegett.modelo.dao.TipoproyectoDao;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAFactoryDao extends FactoryDao {

    @Override
    public AccionesDao getAccionesDao() {
        return new JPAAccionesDao();
    }

    @Override
    public ActividadesDao getActividadesDao() {
        return new JPAActividadesDao();
    }

    @Override
    public AniosDao getAniosDao() {
        return new JPAAniosDao();
    }

    @Override
    public ArchivosverificablesDao getArchivosverificablesDao() {
        return new JPAArchivosverificablesDao();
    }
    
    @Override
    public AvanceDao getAvanceDao(){
        return new JPAAvanceDao();
    }
    
    @Override
    public CorreoDao getCorreoDao(){
        return new JPACorreoDao();
    }
    
    @Override
    public DuracionDao getDuracionDao(){
        return new JPADuracionDao();
    }
    
    @Override
    public EjesDao getEjesDao(){
        return new JPAEjesDao();
    }
    
    @Override
    public EstadogestionDao getEstadogestionDao(){
        return new JPAEstadogestionDao();
    }
    
    @Override
    public ImportanciaDao getImportanciaDao(){
        return new JPAImportanciaDao();
    }
    
    @Override
    public InstitucionDao getInstitucionDao(){
        return new JPAInstitucionDao();
    }
    
    @Override
    public MenuDao getMenuDao(){
        return new JPAMenuDao();
    }
    
    @Override
    public ObjetivosespecificosDao getObjetivosespecificosDao(){
        return new JPAObjetivosespecificosDao();
    }
    
    @Override
    public ObjetivosgeneralesDao getObjetivosgeneralesDao(){
        return new JPAObjetivosgeneralesDao();
    }
    
    @Override
    public PersonaDao getPersonaDao(){
        return new JPAPersonaDao();
    }
    
    @Override
    public PesoDao getPesoDao(){
        return new JPAPesoDao();
    }
    
    @Override
    public TipoproyectoDao getTipoproyectoDao(){
        return new JPATipoproyectoDao();
    }
    
}
