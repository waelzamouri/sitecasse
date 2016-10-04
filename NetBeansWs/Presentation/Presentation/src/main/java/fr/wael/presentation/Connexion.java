/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;


import fr.wael.metierplateforme.implemntation.MClient;
import fr.wael.metierplateforme.interfaces.ImClient;
import fr.wael.model.Client;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wael
 */
@ManagedBean
@SessionScoped
public class Connexion implements Serializable {

    private ImClient imClient;
    private static final long serialVersionUID = 1L;
    private Client client;
    private String mail;
    private String psw;
    private boolean connected;
    private String nom;
    private String prenom;

    public Connexion() {
        imClient = new MClient();
        connected = false;
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

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
    

    private boolean verifieCon() {
        client = imClient.verifConnection(mail, psw);
        connected = false;
        if(client != null){
            nom = client.getNom();
            prenom = client.getPrenom();
            connected = true;            
        }        
        return connected;
       
    }
    public String toTryConnect(){
        
        if(verifieCon()){
            return "my-commande";
        }
        return "choix-con-ins";
       
    }
    public String deconncter(){
        connected = false;
        client = null;
        return "deconnecter";
    }

}
