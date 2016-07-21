/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.model.references;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TemporalType;

/**
 *
 * @author wael
 */
@javax.persistence.Entity
public class Ref_List_Modele implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_list_modele;

    @Column(nullable = true)
    private String nom_list_model;

    @Column(nullable = true)
    @javax.persistence.Temporal(TemporalType.DATE)
    private Date date_deb_prod;

    @Column(nullable = true)
    @javax.persistence.Temporal(TemporalType.DATE)
    private Date date_fin_prod;

    @ManyToOne
    private Ref_Modele ref_modele;
    
    @ManyToMany (mappedBy = "ref_list_modele")
    private List<Ref_Zone> ref_zone;

    public List<Ref_Zone> getRef_zone() {
        return ref_zone;
    }

    public void setRef_zone(List<Ref_Zone> ref_zone) {
        this.ref_zone = ref_zone;
    }
    
    

    public Long getId_ref_list_modele() {
        return id_ref_list_modele;
    }

    public void setId_ref_list_modele(Long id_ref_list_modele) {
        this.id_ref_list_modele = id_ref_list_modele;
    }

    public String getNom_list_model() {
        return nom_list_model;
    }

    public void setNom_list_model(String nom_list_model) {
        this.nom_list_model = nom_list_model;
    }

    public Date getDate_deb_prod() {
        return date_deb_prod;
    }

    public void setDate_deb_prod(Date date_deb_prod) {
        this.date_deb_prod = date_deb_prod;
    }

    public Date getDate_fin_prod() {
        return date_fin_prod;
    }

    public void setDate_fin_prod(Date date_fin_prod) {
        this.date_fin_prod = date_fin_prod;
    }

    public Ref_Modele getRef_Modele() {
        return ref_modele;
    }

    public void setRef_Modele(Ref_Modele ref_Modele) {
        this.ref_modele = ref_Modele;
    }

    public Ref_List_Modele() {
    }
    

}
