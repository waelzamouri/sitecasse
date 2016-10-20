/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoClient;
import fr.wael.dao.interfaces.IDaoClient;
import fr.wael.model.Client;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author wael
 */
@ManagedBean
@RequestScoped
public class BeanSenregistrer extends Connexion implements Serializable {

    private static final long serialVersionUID = 1L;
    //private IDaoClient iDaoClient;
    private String nom;
    private String prenom;
    private String mail;
    private String num_tel;
    private String mdp;
    

    
    public BeanSenregistrer() {
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

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    public String enregistrer(){
        if(verifAll()){
            
           // iDaoClient = new DaoClient();
            Client client = new Client();
            client.setNom(nom);
            client.setPrenom(prenom);
            client.setMail(mail);
            client.setNumero(num_tel);
            client.setPsw(mdp);
            super.imClient.addClient(client);
            super.connected = true;
            super.nom = this.nom;
            super.prenom = this.prenom;
            //iDaoClient.addClient(client);
            
            return "my-commande";
        }
        return "enrg-ko";
    }
    
    private boolean verifAll(){
        if(nom != null && prenom!=null && mail!= null && num_tel != null && mdp != null){
            return true;
        }
        return false;
    }

}
