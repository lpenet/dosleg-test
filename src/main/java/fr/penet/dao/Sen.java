/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.penet.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;

/**
 *
 * @author lpenet
 */
@Entity
// User is a keyword in some SQL dialects!
@Table(name="sen")
@Getter
public class Sen implements Serializable {
    @Id
    private String senmat;
    
    @Column
    private String sennomuse;
    
    @Column
    private String senprenomuse;
    
    @Column
    private String quacod;
    
    @ManyToOne
    @JoinColumn(name="etasencod")
    private Etasen etasen;


    @Column
    private String sengrppolcodcou;
    
    @Column
    private String sengrppolliccou;
    
    @Column
    private String sentypappcou;
    
    @Column
    private String sencomcodcou;
    
    @Column
    private String sencomliccou;
    
    @Column
    private Long sencirnumcou;
    
    @Column
    private String sencircou;
    
    @Column
    private String senburliccou;
    
    @Column
    private Date sendatpreele;
    
    @Column
    private String sennomusecap;
    
    @Column
    private String sencrinom;
            
    @Column
    private String senfem;
            
    @Column
    private String sennomdis;
    
    @Column
    private String sennomdit;
    
    @Column
    private String titnobcod;
    
    @Column
    private String senobs4r1;
    
    @Column
    private String senobs4r2;
    
    @Column
    private String senobs3r1;
    
    @Column
    private String senobs3r2;
            
    @Column
    private Date sendatderele;
    
    @Column
    private Long sencirnumcou4r;
    
    @Column
    private String sencircou4r;
    
    @Column
    private String sencirnumcou3r;
    
    @Column
    private String sencircou3r;
    
    @Column
    private String sengrppolcodcou4r;
    
    @Column
    private String sentypappcou4r;
    
    @Column
    private Date syscredat;
    
    @Column
    private String sysmajdat;
    
    @Column
    private String catprocod2e;
    
    @Column
    private String sendespro2e;
    
    @OneToMany(mappedBy="sen")
    private Set<Elusen> elusens;
    
    public List<Elusen> getElusensAsList() {
        return new ArrayList<>(elusens);
    }
    
}
