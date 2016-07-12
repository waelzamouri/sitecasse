package fr.wael.model;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Casse {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    private long id_casse;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "casse")
    protected Set<Devis> devis;

    @javax.persistence.OneToMany(mappedBy = "casse")
    private Set<Avis> avis;

    @javax.persistence.Column(nullable = true)
    private String nom_casse;

    @javax.persistence.Column(nullable = true)
    private String adresse;

    @javax.persistence.Column(nullable = true)
    private String nom_du_responsable;

    @javax.persistence.Column(nullable = true)
    private String numero_resp;

    @javax.persistence.Column(nullable = true)
    private String numero_siret;

    @javax.persistence.Column(nullable = true)
    private String mail;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Casse() {
        super();
    }

    public long getId_casse() {
        return id_casse;
    }

    public void setId_casse(long id_casse) {
        this.id_casse = id_casse;
    }

    public Set<Devis> getDevis() {
        return devis;
    }

    public void setDevis(Set<Devis> devis) {
        this.devis = devis;
    }

    public Set<Avis> getAvis() {
        return avis;
    }

    public void setAvis(Set<Avis> avis) {
        this.avis = avis;
    }

    public String getNom_casse() {
        return nom_casse;
    }

    public void setNom_casse(String nom_casse) {
        this.nom_casse = nom_casse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom_du_responsable() {
        return nom_du_responsable;
    }

    public void setNom_du_responsable(String nom_du_responsable) {
        this.nom_du_responsable = nom_du_responsable;
    }

    public String getNumero_resp() {
        return numero_resp;
    }

    public void setNumero_resp(String numero_resp) {
        this.numero_resp = numero_resp;
    }

    public String getNumero_siret() {
        return numero_siret;
    }

    public void setNumero_siret(String numero_siret) {
        this.numero_siret = numero_siret;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
