/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoRef_modele;
import fr.wael.model.Ref_modele;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoRef_modele implements IDaoRef_modele {

    private Session session;
    private Transaction tx = null;

    @Override
    public Ref_modele getRef_modeleById(Long id_ref_modele) {
        
        final Ref_modele ref_modeleReturn = (Ref_modele) session.get(Ref_modele.class, id_ref_modele);

        return ref_modeleReturn;

    }

    @Override
    public void addRef_modele(Ref_modele ref_modele) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(ref_modele);
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
    public List<Ref_modele> getAllRef_modele() {
        return session.createCriteria(Ref_modele.class).list();
    }

    @Override
    public void deleteRef_modele(Ref_modele ref_modele) {

        try {
            tx = session.beginTransaction();
            session.delete(ref_modele);
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

    public DaoRef_modele() {
        session = HibernateUtil.getSession();
    }

}
