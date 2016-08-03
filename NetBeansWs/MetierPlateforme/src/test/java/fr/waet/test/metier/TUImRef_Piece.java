/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.waet.test.metier;

import fr.wael.metierplateforme.implemntation.MRef_Piece;
import fr.wael.metierplateforme.interfaces.ImRef_Piece;
import fr.wael.model.Ref_Piece;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author wael
 */
public class TUImRef_Piece {
    private List<Ref_Piece> ref_peces;
    private ImRef_Piece imRef_Piece;

    @Before
    public void setUp() {
        imRef_Piece = new MRef_Piece();
        
    }
    @Test
    public void getVintsPiece(){
        ref_peces = imRef_Piece.getRef_PieceBynombre(20);
        for(Ref_Piece p : ref_peces){
            System.out.println(p.getNom_piece());
        }
    }
    
    
}
