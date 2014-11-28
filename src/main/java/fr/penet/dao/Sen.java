/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

/**
 *
 * @author lpenet
 */
@Entity
// User is a keyword in some SQL dialects!
@Table(name="senateurs.sen")
@Getter
public class Sen {
    @Id
    private String senmat;
    
    @Column
    private String sennomuse;
    
    @Column
    private String senprenomuse;
    
    @Column
    private String quacod;
}
