/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.dao;

import ec.mdg.sisegett.modelo.jpa.JPAFactoryDao;

/**
 *
 * @author wilmer.valdiviezo
 */
public abstract class FactoryDao {

    protected static FactoryDao factory = new JPAFactoryDao();

    public static FactoryDao getFactory() {
        return factory;
    }
    
    /**
     * Declaracion de los métodos abstractos
     */
    public abstract AccionesDao getAccionesDao();
    public abstract ActividadesDao getActividadesDao();
    public abstract AniosDao getAniosDao();
    public abstract ArchivosverificablesDao getArchivosverificablesDao();
    public abstract AvanceDao getAvanceDao();
    public abstract CorreoDao getCorreoDao();
    public abstract DuracionDao getDuracionDao();
    public abstract EjesDao getEjesDao();
    public abstract EstadogestionDao getEstadogestionDao();
    public abstract ImportanciaDao getImportanciaDao();
    public abstract InstitucionDao getInstitucionDao();
    public abstract MenuDao getMenuDao();
    public abstract ObjetivosespecificosDao getObjetivosespecificosDao();
    public abstract ObjetivosgeneralesDao getObjetivosgeneralesDao();
    public abstract PersonaDao getPersonaDao();
    public abstract PesoDao getPesoDao();
    public abstract TipoproyectoDao getTipoproyectoDao();
    public abstract TiposaccionesDao getTiposaccionesDao();
    
    
}
