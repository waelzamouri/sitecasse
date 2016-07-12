package fr.wael.model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Avis {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    private long id_avis;

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
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Casse casse;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @gene<!--rated
	 * @ord
     * ered
     */
    @javax.persistence.Column(nullable = false)
    private long nb_etoile;

    @javax.persistence.Column(nullable = false)
    private String commentaire;

    @javax.persistence.Column(nullable = false)
    private Date date_com;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Avis() {
        super();
    }

    public long getId_avis() {
        return id_avis;
    }

    public void setId_avis(long id_avis) {
        this.id_avis = id_avis;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Casse getCasse() {
        return casse;
    }

    public void setCasse(Casse casse) {
        this.casse = casse;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}