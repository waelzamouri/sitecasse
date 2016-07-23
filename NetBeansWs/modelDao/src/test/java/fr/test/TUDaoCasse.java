/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.test;

import fr.wael.dao.imp.DaoCasse;
import fr.wael.dao.interfaces.IDaoCasse;
import fr.wael.model.Casse;
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
public class TUDaoCasse {
    Casse casse;
    IDaoCasse iDaoCasse;
    
    public TUDaoCasse() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        casse = new Casse();
        iDaoCasse = new DaoCasse();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void taddCasse(){
        casse.setId_casse(1L);
        casse.setNom_casse("La casse du mans");
        casse.setNom_du_responsable("Jean Michel 2");
        casse.setMail("waelzamouri@gmail.com");
        iDaoCasse.addCasse(casse);
    }
}
