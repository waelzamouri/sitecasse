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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TemporalType;

/**
 *
 * @author wael
 */
@javax.persistence.Entity
public class Ref_Modele implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_modele;

    @ManyToOne
    @JoinColumn(name = "ref_modele")
    private Ref_Marque ref_Marque;

    @Column(nullable = true)
    private String nom_img_modele;

    @Column(nullable = false)
    private String nom_modele;

    @OneToMany(mappedBy = "ref_modele")
    private List<Ref_List_Modele> ref_list_modele;

    public Long getId_ref_modele() {
        return id_ref_modele;
    }

    public void setId_ref_modele(Long id_ref_modele) {
        this.id_ref_modele = id_ref_modele;
    }

    public Ref_Marque getRef_Marque() {
        return ref_Marque;
    }

    public void setRef_Marque(Ref_Marque ref_Marque) {
        this.ref_Marque = ref_Marque;
    }

    public String getNom_img_modele() {
        return nom_img_modele;
    }

    public void setNom_img_modele(String nom_img_modele) {
        this.nom_img_modele = nom_img_modele;
    }

    public String getNom_modele() {
        return nom_modele;
    }

    public void setNom_modele(String nom_modele) {
        this.nom_modele = nom_modele;
    }

    public Ref_Modele() {
    }

}
