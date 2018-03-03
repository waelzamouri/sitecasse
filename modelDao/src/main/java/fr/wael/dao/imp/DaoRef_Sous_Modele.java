/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoRef_Sous_Modele;
import fr.wael.model.Ref_Sous_Modele;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoRef_Sous_Modele implements IDaoRef_Sous_Modele {

    private Session session;
    private Transaction tx = null;

    @Override
    public Ref_Sous_Modele getRef_Sous_ModeleById(Long id_ref_Sous_Modele) {
        
        final Ref_Sous_Modele ref_Sous_ModeleReturn = (Ref_Sous_Modele) session.get(Ref_Sous_Modele.class, id_ref_Sous_Modele);

        return ref_Sous_ModeleReturn;

    }

    @Override
    public void addRef_Sous_Modele(Ref_Sous_Modele ref_Sous_Modele) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(ref_Sous_Modele);
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
    public List<Ref_Sous_Modele> getAllRef_Sous_Modele() {
        return session.createCriteria(Ref_Sous_Modele.class).list();
    }

    @Override
    public void deleteRef_Sous_Modele(Ref_Sous_Modele ref_Sous_Modele) {

        try {
            tx = session.beginTransaction();
            session.delete(ref_Sous_Modele);
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

    public DaoRef_Sous_Modele() {
        session = HibernateUtil.getSession();
    }

}
