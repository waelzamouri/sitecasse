/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.model.references;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wael
 */
@javax.persistence.Entity
public class Ref_Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_zone;

    public Long getId_ref_zone() {
        return id_ref_zone;
    }

    public void setId_ref_zone(Long id_ref_zone) {
        this.id_ref_zone = id_ref_zone;
    }
    
    
    

    
    
    
    
    
    
    
    
    
    

    
}
