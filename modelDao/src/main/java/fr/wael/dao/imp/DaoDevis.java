/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoDevis;
import fr.wael.model.Devis;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoDevis implements IDaoDevis {

    private Session session;
    private Transaction tx = null;

    @Override
    public Devis getDevisById(Long id_devis) {
        
        final Devis devisReturn = (Devis) session.get(Devis.class, id_devis);

        return devisReturn;

    }

    @Override
    public void addDevis(Devis devis) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(devis);
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
    public List<Devis> getAllDevis() {
        return session.createCriteria(Devis.class).list();
    }

    @Override
    public void deleteDevis(Devis devis) {

        try {
            tx = session.beginTransaction();
            session.delete(devis);
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

    public DaoDevis() {
        session = HibernateUtil.getSession();
    }

}
