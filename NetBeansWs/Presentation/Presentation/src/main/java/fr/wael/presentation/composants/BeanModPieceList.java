/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation.composants;

import fr.wael.metierplateforme.implemntation.MRef_Piece;
import fr.wael.metierplateforme.interfaces.ImRef_Piece;
import fr.wael.model.Ref_Piece;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author wael
 */
@ManagedBean
@RequestScoped
public class BeanModPieceList implements Serializable {

    

    private ImRef_Piece imRef_Piece;
    private List<Ref_Piece> ref_pieces;

    private static final long serialVersionUID = 1L;

    public BeanModPieceList() {
        imRef_Piece = new MRef_Piece();
        ref_pieces = imRef_Piece.getRef_PieceBynombre(20);
    }

    public List<Ref_Piece> getRef_pieces() {
        return ref_pieces;
    }

    public void setRef_pieces(List<Ref_Piece> ref_pieces) {
        this.ref_pieces = ref_pieces;
    }

}
