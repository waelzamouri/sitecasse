package fr.wael.model;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

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
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_piece;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Demande demande;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "piece")
    private List<Devis> devis;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    @javax.persistence.Column(nullable = false)
    private String marque;

    @javax.persistence.Column(nullable = false)
    private String model;

    @javax.persistence.Column(nullable = false)
    private String zone;

    @javax.persistence.Column(nullable = false)
    private String nom_piece;

    @javax.persistence.Column(nullable = true)
    private String com_client;

    public Piece() {
        super();
    }

    public long getId_piece() {
        return id_piece;
    }

    public void setId_piece(long id_piece) {
        this.id_piece = id_piece;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public List<Devis> getDevis() {
        return devis;
    }

    public void setDevis(List<Devis> devis) {
        this.devis = devis;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getNom_piece() {
        return nom_piece;
    }

    public void setNom_piece(String nom_piece) {
        this.nom_piece = nom_piece;
    }

    public String getCom_client() {
        return com_client;
    }

    public void setCom_client(String com_client) {
        this.com_client = com_client;
    }

}
