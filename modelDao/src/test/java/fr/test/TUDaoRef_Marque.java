/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.test;

import fr.wael.dao.imp.DaoRef_Marque;
import fr.wael.dao.interfaces.IDaoRef_Marque;
import fr.wael.model.Ref_Marque;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wael
 */
public class TUDaoRef_Marque {

    Ref_Marque avis;
    IDaoRef_Marque iDaoRef_Marque;

    public TUDaoRef_Marque() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        iDaoRef_Marque = new DaoRef_Marque();
        avis = new Ref_Marque();
       
    }

    @After
    public void tearDown() {
    }

    //@Test
    public void tAddRef_Marque() {

        iDaoRef_Marque.addRef_Marque(avis);

    }

    //@Test
    public void tgetRef_MarqueById() {
        final Ref_Marque avis2 = iDaoRef_Marque.getRef_MarqueById(3L);

      //  assertEquals(avis.getCommentaire(), avis2.getCommentaire());
//        assertEquals(avis.getDate_com(), avis2.getDate_com());

    }

    @Test
    public void tgetAllRef_Marque() {
        List<Ref_Marque> aviss = new ArrayList<>();
        aviss = iDaoRef_Marque.getAllRef_Marque();
        for(Ref_Marque a : aviss){
            System.out.println(a.getNom_marque());
        }
    }
    //@Test
    public void tdeleteRef_Marque(){
        Ref_Marque avis2 = new Ref_Marque();
        //avis2.setId_avis(2L);
        //avis2.setCommentaire("Bordel");
        
        
        iDaoRef_Marque.deleteRef_Marque(avis2);
    }

}
