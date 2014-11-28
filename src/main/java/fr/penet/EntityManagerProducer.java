/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.apache.deltaspike.jpa.api.entitymanager.PersistenceUnitName;

/**
 *
 * @author lpenet
 */
@Named
@ApplicationScoped
public class EntityManagerProducer implements Serializable {
    
    @Inject
    @PersistenceUnitName("dosleg")
    private transient EntityManagerFactory emf;
    
    @Produces
    @RequestScoped
    public EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
    
    public void closeEm(@Disposes EntityManager em) {
        em.close();
    }
}
