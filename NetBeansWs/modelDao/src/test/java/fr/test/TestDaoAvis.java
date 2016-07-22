/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.test;

import fr.wael.dao.imp.DaoAvis;
import fr.wael.dao.interfaces.IDaoAvis;
import fr.wael.model.Avis;
import java.util.Date;

/**
 *
 * @author wael
 */
public class TestDaoAvis {
    public static void main(String[] args) {
        IDaoAvis iDaoAvis = new DaoAvis();
        Avis avis = new Avis();
        avis.setCommentaire("Bordel");
        avis.setDate_com(new Date());
        iDaoAvis.addAvis(avis);
    }
}
