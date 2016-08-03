/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.imp.*;
import fr.wael.dao.interfaces.IDaoRef_Zone;
import fr.wael.dao.interfaces.IDaoRef_Zone;
import fr.wael.model.Ref_Zone;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoRef_Zone implements IDaoRef_Zone {

    private Session session;
    private Transaction tx = null;

    @Override
    public Ref_Zone getRef_ZoneById(Long id_ref_Zone) {
        
        final Ref_Zone ref_ZoneReturn = (Ref_Zone) session.get(Ref_Zone.class, id_ref_Zone);

        return ref_ZoneReturn;

    }

    @Override
    public void addRef_Zone(Ref_Zone ref_Zone) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(ref_Zone);
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
    public List<Ref_Zone> getAllRef_Zone() {
        return session.createCriteria(Ref_Zone.class).list();
    }

    @Override
    public void deleteRef_Zone(Ref_Zone ref_Zone) {

        try {
            tx = session.beginTransaction();
            session.delete(ref_Zone);
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

    public DaoRef_Zone() {
        session = HibernateUtil.getSession();
    }

}
