/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Piece;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoPiece {

    public Piece getPieceById(Long id_avis);

    public void addPiece(Piece avis);

    public List<Piece> getAllPiece();

    public void deletePiece(Piece avis);

}
