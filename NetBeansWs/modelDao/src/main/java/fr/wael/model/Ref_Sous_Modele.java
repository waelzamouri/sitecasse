package fr.wael.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TemporalType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Ref_Sous_Modele implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ref_sous_modele;
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Ref_modele ref_modele;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToMany(mappedBy = "ref_Sous_Modele")
    private List<Ref_Zone> ref_Zone;

    @Column(nullable = true)
    private String nom_sous_model;

    @Column(nullable = true)
    @javax.persistence.Temporal(TemporalType.DATE)
    private Date date_deb_prod;

    @Column(nullable = true)
    @javax.persistence.Temporal(TemporalType.DATE)
    private Date date_fin_prod;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Ref_Sous_Modele() {
        super();
    }

    public Long getId_ref_sous_modele() {
        return id_ref_sous_modele;
    }

    public void setId_ref_sous_modele(Long id_ref_sous_modele) {
        this.id_ref_sous_modele = id_ref_sous_modele;
    }

    public Ref_modele getRef_modele() {
        return ref_modele;
    }

    public void setRef_modele(Ref_modele ref_modele) {
        this.ref_modele = ref_modele;
    }

    public List<Ref_Zone> getRef_Zone() {
        return ref_Zone;
    }

    public void setRef_Zone(List<Ref_Zone> ref_Zone) {
        this.ref_Zone = ref_Zone;
    }

    public String getNom_sous_model() {
        return nom_sous_model;
    }

    public void setNom_sous_model(String nom_sous_model) {
        this.nom_sous_model = nom_sous_model;
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

}
