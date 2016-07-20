package fr.wael.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Devis {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */

    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_devis;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Casse casse;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Piece piece;

    
    public long getId_devis() {
        return id_devis;
    }

    public void setId_devis(long id_devis) {
        this.id_devis = id_devis;
    }

    public Casse getCasse() {
        return casse;
    }

    public void setCasse(Casse casse) {
        this.casse = casse;
    }

    public Piece getPiece() {
        return piece;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public void setPiece(Piece piece) {    
        this.piece = piece;
    }

    public Devis() {
        super();
    }

}
