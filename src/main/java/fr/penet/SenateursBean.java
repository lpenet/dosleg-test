/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet;

import fr.penet.dao.Sen;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

/**
 *
 * @author lpenet
 */
@Named
@ViewAccessScoped
public class SenateursBean implements Serializable {

    @Inject
    private EntityManager em;

    public List<Sen> getValues() {
        Query query = em.createQuery("from Sen order by sennomuse");
        return query.getResultList();
    }
}
