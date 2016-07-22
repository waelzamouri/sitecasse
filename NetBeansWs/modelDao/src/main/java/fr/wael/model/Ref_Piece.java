package fr.wael.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Ref_Piece implements Serializable {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Ref_Zone ref_Zone;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ref_piece;

    @Column(nullable = true)
    private String nom_piece;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Ref_Piece() {
        super();
    }

    public Ref_Zone getRef_Zone() {
        return ref_Zone;
    }

    public void setRef_Zone(Ref_Zone ref_Zone) {
        this.ref_Zone = ref_Zone;
    }

    public Long getId_ref_piece() {
        return id_ref_piece;
    }

    public void setId_ref_piece(Long id_ref_piece) {
        this.id_ref_piece = id_ref_piece;
    }

    public String getNom_piece() {
        return nom_piece;
    }

    public void setNom_piece(String nom_piece) {
        this.nom_piece = nom_piece;
    }

}
