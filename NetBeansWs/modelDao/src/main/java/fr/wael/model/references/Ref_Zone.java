/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.model.references;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author wael
 */
@javax.persistence.Entity
public class Ref_Zone implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_zone;
    
    @Column
    private String nom_zone;

    @ManyToMany
    private List<Ref_List_Modele> ref_list_modele;
    
    @OneToMany(mappedBy = "ref_piece")
    private List<Ref_Piece> ref_Pieces;
 
    
    public Long getId_ref_zone() {
        return id_ref_zone;
    }

    public void setId_ref_zone(Long id_ref_zone) {
        this.id_ref_zone = id_ref_zone;
    }

    public String getNom_zone() {
        return nom_zone;
    }

    public void setNom_zone(String nom_zone) {
        this.nom_zone = nom_zone;
    }

    public List<Ref_List_Modele> getRef_list_modele() {
        return ref_list_modele;
    }

    public void setRef_list_modele(List<Ref_List_Modele> ref_list_modele) {
        this.ref_list_modele = ref_list_modele;
    }

    public List<Ref_Piece> getRef_Pieces() {
        return ref_Pieces;
    }

    public void setRef_Pieces(List<Ref_Piece> ref_Pieces) {
        this.ref_Pieces = ref_Pieces;
    }

    public Ref_Zone() {
    }
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    
}
