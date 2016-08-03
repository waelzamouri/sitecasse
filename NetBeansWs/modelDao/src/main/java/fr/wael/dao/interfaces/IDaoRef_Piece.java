/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Ref_Piece;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoRef_Piece {

    public Ref_Piece getRef_PieceById(Long id_avis);

    public void addRef_Piece(Ref_Piece avis);

    public List<Ref_Piece> getAllRef_Piece();

    public void deleteRef_Piece(Ref_Piece avis);
    
    public List<Ref_Piece> geRef_PieceByNombre(int nbRef_Piece);

}
