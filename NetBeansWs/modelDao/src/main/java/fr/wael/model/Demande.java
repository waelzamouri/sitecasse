package fr.wael.model;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Demande {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected long id_demande;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected Client client;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToMany
    protected Set<Casse> casse;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "demande")
    protected Set<Piece> piece;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Demande() {
        super();
    }

}
