package fr.wael.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Ref_Marque implements Serializable {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.Column(nullable = false)
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_ref_marque;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @Column
    private String nom_marque;

    @javax.persistence.OneToMany(mappedBy = "ref_Marque",fetch = FetchType.EAGER)
    private Set<Ref_modele> ref_modele;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Ref_Marque() {
        super();
    }

    public long getId_ref_marque() {
        return id_ref_marque;
    }

    public void setId_ref_marque(long id_ref_marque) {
        this.id_ref_marque = id_ref_marque;
    }

    public Set<Ref_modele> getRef_modele() {
        return ref_modele;
    }

    public void setRef_modele(Set<Ref_modele> ref_modele) {
        this.ref_modele = ref_modele;
    }

    public String getNom_marque() {
        return nom_marque;
    }

    public void setNom_marque(String nom_marque) {
        this.nom_marque = nom_marque;
    }

}
