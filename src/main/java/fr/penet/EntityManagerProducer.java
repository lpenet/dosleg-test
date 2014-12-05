/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.apache.deltaspike.jpa.api.entitymanager.PersistenceUnitName;
import org.hibernate.Session;

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
    
    // JPA 2.0 EntityManager has really bad problems, such as non serializability
    // So, we prefer using "raw" hibernate Session, because it is serializable and thus @SessionScope-able
    @Produces
    @RequestScoped
    public EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
    
    public void closeEm(@Disposes EntityManager em) {
        em.close();
    }
    
    @Produces
    @SessionScoped
    public Session createSession() {
        return (Session) emf.createEntityManager().getDelegate();
    }
    
    public void closeSession(@Disposes Session s) {
        s.close();
    }
}
