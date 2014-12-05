/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet.dao;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="etasen")
@Getter
public class Etasen implements Serializable {
    @Id
    private String etasencod;
    
    @Column
    private String etasenlic;
    
    @Column
    private String etasenlib;
    
    @Column
    private String etasenlil;
    
    @Column
    private String etasenlicfem;
    
    @Column
    private String etasenlibfem;
    
    @Column
    private String etasenlilfem;

    @Column
    private String etasenlicplu;
    
    @Column
    private String etasenlibplu;
    
    @Column
    private String etasenlilplu;
    
    @Column 
    private long etasennumtri;
    
    @Column
    private Date syscredat;
    
    @Column
    private Date sysmajdat;
}
