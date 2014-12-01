/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet.dao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;

/**
 *
 * @author lpenet
 */
@Entity
// User is a keyword in some SQL dialects!
@Table(name="elusen")
@Getter
public class Elusen  implements java.io.Serializable {
    @Id
    @GeneratedValue
    private long eluid;
    
    @Column
    private Long dptnum;
    
    @Column
    private String typmancod;
    
    @Column
    private String etadebmancod;
    
    @Column
    private String turelucod;
    
    @Column
    private String etafinmancod;
    
    @Column
    private String temvalcod;
    
    @ManyToOne
    @JoinColumn(name="senmat")
    private Sen sen;
    
    @Column
    private Date eludatdeb;
    
    @Column
    private Date eludatelu;
    
    @Column
    private Date eludatfin;
    
    
    @Column
    private String evelic;

    @Column
    private String evelib;

    @Column
    private String evelil;
    
    @Column
    private Long eluanndeb;
    
    @Column
    private Long eluannfin;
        
    @Column
    private Date eludatcum;

    @Column
    private Date syscredat;
    
    @Column
    private Date sysmajdat;
}
