/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

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

    private String f_marque;
    private String f_modele;
    private String f_nom_piece;

    /**
     * Creates a new instance of PremierBean
     */
    public PremierBean() {

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

    public String toRecherche() {
//        final IDaoPiece iDaoPiece = new DaoPiece();
//        Piece piece = new Piece();
//        piece.setMarque(f_marque);
//        piece.setModel(f_modele);
//        piece.setNom_piece(f_nom_piece);
//        iDaoPiece.addPiece(piece);

        return "rech";
    }

    public String toModele() {
        Map<String, String> params
                = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        f_marque = params.get("marque");
        
        return "model-list";
    }

}
