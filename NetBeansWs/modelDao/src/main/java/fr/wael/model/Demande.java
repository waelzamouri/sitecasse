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
    private long id_demande;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Client client;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToMany
    private Set<Casse> casse;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "demande")
    private Set<Piece> piece;

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

    public long getId_demande() {
        return id_demande;
    }

    public void setId_demande(long id_demande) {
        this.id_demande = id_demande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Casse> getCasse() {
        return casse;
    }

    public void setCasse(Set<Casse> casse) {
        this.casse = casse;
    }

    public Set<Piece> getPiece() {
        return piece;
    }

    public void setPiece(Set<Piece> piece) {
        this.piece = piece;
    }

    
}
