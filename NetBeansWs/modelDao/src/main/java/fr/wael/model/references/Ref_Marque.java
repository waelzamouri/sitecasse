/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.model.references;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author wael
 */
@javax.persistence.Entity
public class Ref_Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_marque;

    @Column
    private String nom_marque;

    @OneToMany(mappedBy = "ref_marque")
    private List<Ref_Modele> modeles;

    public String getNom_marque() {
        return nom_marque;
    }

    public void setNom_marque(String nom_marque) {
        this.nom_marque = nom_marque;
    }

    public List<Ref_Modele> getModeles() {
        return modeles;
    }

    public void setModeles(List<Ref_Modele> modeles) {
        this.modeles = modeles;
    }

    public Long getId_ref_marque() {
        return id_ref_marque;
    }

    public void setId_ref_marque(Long id_ref_marque) {
        this.id_ref_marque = id_ref_marque;
    }

    public Ref_Marque() {
    }

}
