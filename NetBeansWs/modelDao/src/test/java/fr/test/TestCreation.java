/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.test;

import fr.wael.model.Avis;
import fr.wael.model.Client;
import fr.wael.model.references.Ref_Piece;
import fr.wael.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class TestCreation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
//            Client client = new Client();
//            client.setMail("koikoi@gmai.com");
//            client.setNom("wael");
//            client.setNumero("0677927774");
//            client.setPsw("xxx1983748");
//            Avis avis = new Avis();
//            avis.setDate_com(new Date());
//            avis.setNb_etoile(5L);
//            avis.setCommentaire("Hello premier test");
//            List<Avis> listAvis = new ArrayList<>();
//            listAvis.add(avis);
//            client.setAvis(listAvis);
//            session.save(client);
//            avis.setClient(client);
//            session.save(avis);
            Client c = (Client) session.get(Client.class, 1L);
            List<Avis> listAvis = new ArrayList<>();
            listAvis = c.getAvis();
            System.out.println("nb etoiles : " + listAvis.get(0).getNb_etoile());
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
