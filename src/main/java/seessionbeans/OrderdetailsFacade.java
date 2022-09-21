/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seessionbeans;

import entities.Orderdetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author quckh
 */
@Stateless
public class OrderdetailsFacade extends AbstractFacade<Orderdetails> {

    @PersistenceContext(unitName = "com.mycompany_Booking-hotel_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderdetailsFacade() {
        super(Orderdetails.class);
    }
    
}