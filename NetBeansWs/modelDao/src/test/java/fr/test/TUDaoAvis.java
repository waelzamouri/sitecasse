/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.test;

import fr.wael.dao.imp.DaoAvis;
import fr.wael.dao.interfaces.IDaoAvis;
import fr.wael.model.Avis;
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
public class TUDaoAvis {

    Avis avis;
    IDaoAvis iDaoAvis;

    public TUDaoAvis() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        iDaoAvis = new DaoAvis();
        avis = new Avis();
        avis.setCommentaire("Bordel3");
        avis.setDate_com(new Date());
        avis.setHeure_com(new Date());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void tAddAvis() {

        iDaoAvis.addAvis(avis);

    }

    @Test
    public void tgetAvisById() {
        final Avis avis2 = iDaoAvis.getAvisById(3L);

        assertEquals(avis.getCommentaire(), avis2.getCommentaire());
//        assertEquals(avis.getDate_com(), avis2.getDate_com());

    }

    @Test
    public void tgetAllAvis() {
        List<Avis> aviss = new ArrayList<>();
        aviss = iDaoAvis.getAllAvis();
        for(Avis a : aviss){
            System.out.println(a.getCommentaire());
        }
    }

}
