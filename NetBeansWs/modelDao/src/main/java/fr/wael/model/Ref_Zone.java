package fr.wael.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Ref_Zone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ref_zone;
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */

    @javax.persistence.ManyToMany
    private List<Ref_Sous_Modele> ref_Sous_Modele;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "ref_Zone")
    private List<Ref_Piece> ref_Piece;

    @Column
    private String nom_zone;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Ref_Zone() {
        super();
    }

    public Long getId_ref_zone() {
        return id_ref_zone;
    }

    public void setId_ref_zone(Long id_ref_zone) {
        this.id_ref_zone = id_ref_zone;
    }

    public List<Ref_Sous_Modele> getRef_Sous_Modele() {
        return ref_Sous_Modele;
    }

    public void setRef_Sous_Modele(List<Ref_Sous_Modele> ref_Sous_Modele) {
        this.ref_Sous_Modele = ref_Sous_Modele;
    }

    public List<Ref_Piece> getRef_Piece() {
        return ref_Piece;
    }

    public void setRef_Piece(List<Ref_Piece> ref_Piece) {
        this.ref_Piece = ref_Piece;
    }

    public String getNom_zone() {
        return nom_zone;
    }

    public void setNom_zone(String nom_zone) {
        this.nom_zone = nom_zone;
    }
    

}
