/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.bd;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author karlo
 */

@Stateless
public class HabitacionFacade extends AbstractFacade<Habitacion> {

    @PersistenceContext(unitName = "CMU_is_so_hot_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HabitacionFacade() {
        super(Habitacion.class);
    }
    
}
