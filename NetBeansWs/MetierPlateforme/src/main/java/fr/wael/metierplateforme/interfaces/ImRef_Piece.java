/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.interfaces;

import fr.wael.model.Ref_Piece;
import java.util.List;

/**
 *
 * @author wael
 */
public interface ImRef_Piece {
    public List<Ref_Piece> getRef_PieceBynombre(int nbRef_Piece);
}
