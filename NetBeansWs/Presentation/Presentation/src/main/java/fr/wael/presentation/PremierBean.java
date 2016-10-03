/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.metierplateforme.implemntation.MRef_Sous_Modele;
import fr.wael.metierplateforme.interfaces.ImRef_Sous_Modele;
import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;

/**
 *
 * @author wael
 */
@ManagedBean
@SessionScoped
public class PremierBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private ImRef_Sous_Modele imRef_Sous_Modele;
    private String f_marque;
    private String f_modele;
    private String f_nom_piece;
    private String id_marque;
    private String id_modele;
    private String id_sous_modele;
    private String id_ref_zone;
    private String nom_zone;
    private String nom_sous_modele;
    private String id_piece;
    private String url_modele_img;

    /**
     * Creates a new instance of PremierBean
     */
    public PremierBean() {
        imRef_Sous_Modele = new MRef_Sous_Modele();
    }

    public String getId_ref_zone() {
        return id_ref_zone;
    }

    public void setId_ref_zone(String id_ref_zone) {
        this.id_ref_zone = id_ref_zone;
    }

    public String getNom_zone() {
        return nom_zone;
    }

    public void setNom_zone(String nom_zone) {
        this.nom_zone = nom_zone;
    }

    public String getUrl_modele_img() {
        return url_modele_img;
    }

    public void setUrl_modele_img(String url_modele_img) {
        this.url_modele_img = url_modele_img;
    }

    public String getId_piece() {
        return id_piece;
    }

    public void setId_piece(String id_piece) {
        this.id_piece = id_piece;
    }

    public String getId_marque() {
        return id_marque;
    }

    public void setId_marque(String id_marque) {
        this.id_marque = id_marque;
    }

    public String getId_modele() {
        return id_modele;
    }

    public void setId_modele(String id_modele) {
        this.id_modele = id_modele;
    }

    public String getF_marque() {
        return f_marque;
    }

    public void setF_marque(String f_marque) {
        this.f_marque = f_marque;
    }

    public String getF_modele() {
        return f_modele;
    }

    public void setF_modele(String f_modele) {
        this.f_modele = f_modele;
    }

    public String getF_nom_piece() {
        return f_nom_piece;
    }

    public void setF_nom_piece(String f_nom_piece) {
        this.f_nom_piece = f_nom_piece;
    }

    public String getId_sous_modele() {
        return id_sous_modele;
    }

    public void setId_sous_modele(String id_sous_modele) {
        this.id_sous_modele = id_sous_modele;
    }

    public String getNom_sous_modele() {
        return nom_sous_modele;
    }

    public void setNom_sous_modele(String nom_sous_modele) {
        this.nom_sous_modele = nom_sous_modele;
    }

    public String toRecherche() {

        this.id_modele = String.valueOf(imRef_Sous_Modele.getIdModelByName(f_modele));

        return "rech";
    }

    public String toModele() {
        Map<String, String> params
                = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        f_marque = params.get("marque");
        id_marque = params.get("idmarque");

        return "model-list";
    }

    public String toSousModele() {
        Map<String, String> params
                = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        f_modele = params.get("modele");
        id_modele = params.get("idmodele");
        url_modele_img = params.get("urlimage");
        return "sous-modele";
    }

    public String toAfficheMarque() {
        Map<String, String> params
                = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        f_nom_piece = params.get("piece");
        id_piece = params.get("idpiece");
        return "affiche-marque";
    }

    public String toZone() {
        Map<String, String> params
                = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        id_sous_modele = params.get("idsousmodele");
        nom_sous_modele = params.get("nomsousmodele");
        if (nom_sous_modele == null) {
            nom_sous_modele = "---";
        }
     
            return "zone";
      
    }
    public String toPieceChoix() {
         final Map<String, String> params
                = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
         id_ref_zone = params.get("idzone");
         nom_zone = params.get("nomzone");
         
        return "piece-choix";
    }
    public String toChoixInsCon(){
        return "choix-con-ins";
    }
 

}
