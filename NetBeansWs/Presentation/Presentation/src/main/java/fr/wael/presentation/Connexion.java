/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.metierplateforme.implemntation.MClient;
import fr.wael.metierplateforme.interfaces.ImClient;
import fr.wael.metierplateforme.mail.EnvoieMail;
import fr.wael.model.Client;
import fr.wael.presentation.util.SyngletonContextSpring;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author wael
 */
@ManagedBean
@SessionScoped
public class Connexion implements Serializable {


    private ImClient imClient;
    private static final long serialVersionUID = 1L;
    //Attributs connexion
    private Client client;
    private String mail;
    private String psw;
    private boolean connected;
    private String nom;
    private String prenom;
    //attributs s'enregistrer
    private String nom_en;
    private String prenom_en;
    private String mail_en;
    private String num_tel_en;
    private String psw_en;

    public Connexion() {
        imClient = new MClient();
//        connected = false;
    }

  

    public String getNom_en() {
        return nom_en;
    }

    public void setNom_en(String nom_en) {
        this.nom_en = nom_en;
    }

    public String getPrenom_en() {
        return prenom_en;
    }

    public void setPrenom_en(String prenom_en) {
        this.prenom_en = prenom_en;
    }

    public String getMail_en() {
        return mail_en;
    }

    public void setMail_en(String mail_en) {
        this.mail_en = mail_en;
    }

    public String getNum_tel_en() {
        return num_tel_en;
    }

    public void setNum_tel_en(String num_tel_en) {
        this.num_tel_en = num_tel_en;
    }

    public String getPsw_en() {
        return psw_en;
    }

    public void setPsw_en(String psw_en) {
        this.psw_en = psw_en;
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
        if (client != null) {
            nom = client.getNom();
            prenom = client.getPrenom();
            connected = true;
        }
        return connected;

    }

    public String toTryConnect() {

        if (verifieCon()) {
            return "my-commande";
        }
        return "choix-con-ins";

    }

    public String deconncter() {
        connected = false;
        client = null;
        return "deconnecter";
    }

    public String enregistrer() {
        if (verifAllEnrgist()) {
            Client c = new Client();
            c.setNom(nom_en);
            c.setPrenom(prenom_en);
            c.setMail(mail_en);
            c.setNumero(num_tel_en);
            c.setPsw(psw_en);
            imClient.addClient(c);
            connected = true;
            nom = nom_en;
            prenom = prenom_en;
            EnvoieMail em = (EnvoieMail) SyngletonContextSpring.getInstance().getBean("envoieMail");
            em.envoyer(mail_en);
            return "my-commande";
        }
        return "KO";
    }

    private boolean verifAllEnrgist() {
        if (!nom_en.isEmpty() && !prenom_en.isEmpty() && !mail_en.isEmpty() && !num_tel_en.isEmpty() && !psw_en.isEmpty()) {
            return true;
        }
        return false;
    }

}
