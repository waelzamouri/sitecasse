package fr.wael.model;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Piece {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */

    @javax.persistence.Column(nullable = false)
    protected long id_piece;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected Demande demande;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "piece")
    protected Set<Devis> devis;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Piece() {
        super();
    }

}
