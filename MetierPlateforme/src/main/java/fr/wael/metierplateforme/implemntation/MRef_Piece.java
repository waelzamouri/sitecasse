/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.implemntation;

import fr.wael.dao.imp.DaoRef_Piece;
import fr.wael.dao.interfaces.IDaoRef_Piece;
import fr.wael.metierplateforme.interfaces.ImRef_Piece;
import fr.wael.model.Ref_Piece;
import java.util.List;

/**
 *
 * @author wael
 */
public class MRef_Piece implements ImRef_Piece {

    private IDaoRef_Piece iDaoRef_Piece;

    @Override
    public List<Ref_Piece> getRef_PieceBynombre(int nbRef_Piece) {
        if (nbRef_Piece != 0) {
            return iDaoRef_Piece.geRef_PieceByNombre(nbRef_Piece);
        } else {
            return null;
        }
    }

    public MRef_Piece() {
        iDaoRef_Piece = new DaoRef_Piece();
    }

}
