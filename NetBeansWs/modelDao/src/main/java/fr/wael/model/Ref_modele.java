package fr.wael.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Ref_modele implements Serializable{

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_modele;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Ref_Marque ref_Marque;

    @Column(nullable = true)
    private String nom_img_modele;

    @Column(nullable = false)
    private String nom_modele;

    @javax.persistence.OneToMany(mappedBy = "ref_modele", fetch = FetchType.EAGER)
    private List<Ref_Sous_Modele> ref_Sous_Modele;

    public List<Ref_Sous_Modele> getRef_Sous_Modele() {
        return ref_Sous_Modele;
    }

    public void setRef_Sous_Modele(List<Ref_Sous_Modele> ref_Sous_Modele) {
        this.ref_Sous_Modele = ref_Sous_Modele;
    }
    

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

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Ref_modele() {
        super();
    }

}
