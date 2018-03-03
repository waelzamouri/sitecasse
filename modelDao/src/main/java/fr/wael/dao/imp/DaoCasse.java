/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoCasse;
import fr.wael.model.Casse;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoCasse implements IDaoCasse {

    private Session session;
    private Transaction tx = null;

    @Override
    public Casse getCasseById(Long id_casse) {
        
        final Casse casseReturn = (Casse) session.get(Casse.class, id_casse);

        return casseReturn;

    }

    @Override
    public void addCasse(Casse casse) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(casse);
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
    public List<Casse> getAllCasse() {
        return session.createCriteria(Casse.class).list();
    }

    @Override
    public void deleteCasse(Casse casse) {

        try {
            tx = session.beginTransaction();
            session.delete(casse);
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

    public DaoCasse() {
        session = HibernateUtil.getSession();
    }

}
