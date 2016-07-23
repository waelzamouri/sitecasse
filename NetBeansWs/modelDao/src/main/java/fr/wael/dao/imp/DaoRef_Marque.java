/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoRef_Marque;
import fr.wael.model.Ref_Marque;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoRef_Marque implements IDaoRef_Marque {

    private Session session;
    private Transaction tx = null;

    @Override
    public Ref_Marque getRef_MarqueById(Long id_ref_Marque) {
        
        final Ref_Marque ref_MarqueReturn = (Ref_Marque) session.get(Ref_Marque.class, id_ref_Marque);

        return ref_MarqueReturn;

    }

    @Override
    public void addRef_Marque(Ref_Marque ref_Marque) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(ref_Marque);
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
    public List<Ref_Marque> getAllRef_Marque() {
        return session.createCriteria(Ref_Marque.class).list();
    }

    @Override
    public void deleteRef_Marque(Ref_Marque ref_Marque) {

        try {
            tx = session.beginTransaction();
            session.delete(ref_Marque);
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

    public DaoRef_Marque() {
        session = HibernateUtil.getSession();
    }

}
