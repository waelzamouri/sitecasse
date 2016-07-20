/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.model.references;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TemporalType;

/**
 *
 * @author wael
 */
@javax.persistence.Entity
public class Ref_Modele {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_modele;

    @ManyToOne
    private Ref_Marque ref_Marque;

    @Column(nullable = true)
    private String nom_img_modele;

    @Column(nullable = false)
    private String nom_modele;
    
    @Column(nullable = true)
    @javax.persistence.Temporal(TemporalType.DATE)
    private Date date_deb_prod; 
    
    @Column(nullable = true)
    @javax.persistence.Temporal(TemporalType.DATE)
    private Date date_fin_prod; 
    

    public Long getId_ref_modele() {
        return id_ref_modele;
    }

    public void setId_ref_modele(Long id_ref_modele) {
        this.id_ref_modele = id_ref_modele;
    }

}
