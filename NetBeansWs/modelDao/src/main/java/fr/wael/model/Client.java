package fr.wael.model;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
@javax.persistence.Entity
public class Client {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    private long id_client;

    @javax.persistence.Column(nullable = false)
    private String nom;

    @javax.persistence.Column(nullable = true)
    private String prenom;

    @javax.persistence.Column(nullable = false)
    private String numero;
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.Column(nullable = false)
    private String mail;

    @javax.persistence.Column(nullable = false)
    private String psw;

    @javax.persistence.OneToMany(mappedBy = "client")
    private Set<Demande> demandes;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    @javax.persistence.OneToMany(mappedBy = "client")
    private Set<Avis> avis;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Client() {
        super();
    }

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Set<Demande> getDemandes() {
        return demandes;
    }

    public void setDemandes(Set<Demande> demandes) {
        this.demandes = demandes;
    }

    public Set<Avis> getAvis() {
        return avis;
    }

    public void setAvis(Set<Avis> avis) {
        this.avis = avis;
    }

}
