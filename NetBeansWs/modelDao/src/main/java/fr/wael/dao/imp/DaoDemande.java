/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoDemande;
import fr.wael.model.Demande;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoDemande implements IDaoDemande {

    private Session session;
    private Transaction tx = null;

    @Override
    public Demande getDemandeById(Long id_demande) {
        
        final Demande demandeReturn = (Demande) session.get(Demande.class, id_demande);

        return demandeReturn;

    }

    @Override
    public void addDemande(Demande demande) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(demande);
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

    @Override
    public List<Demande> getAllDemande() {
        return session.createCriteria(Demande.class).list();
    }

    @Override
    public void deleteDemande(Demande demande) {

        try {
            tx = session.beginTransaction();
            session.delete(demande);
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

    public DaoDemande() {
        session = HibernateUtil.getSession();
    }

}
