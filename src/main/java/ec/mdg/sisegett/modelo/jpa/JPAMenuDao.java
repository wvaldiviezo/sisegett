/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mdg.sisegett.modelo.jpa;

import ec.mdg.sisegett.modelo.dao.MenuDao;
import ec.mdg.sisegett.modelo.entidad.Menu;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAMenuDao extends JPAGenericDao<Menu, Integer> implements MenuDao{
    
    public JPAMenuDao(){
        super(Menu.class);
    }
    
}
