/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoAvis;
import fr.wael.model.Avis;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoAvis implements IDaoAvis {
    
    private static Session session = HibernateUtil.getSession();
    private static Transaction tx = null;
    
    @Override
    public Avis getAvisById(Long id_avis) {
        
        return (Avis) session.get(Avis.class, id_avis);
        
    }
    
    @Override
    public void addAvis(Avis avis) {
        try {
            tx = session.beginTransaction();
            session.save(avis);
            
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
    public List<Avis> getAllAvis() {
        return session.createCriteria(Avis.class).list();
    }
    
    @Override
    public void deleteAvis(Avis avis) {
        session.delete(avis);
    }

    public DaoAvis() {
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTx() {
        return tx;
    }

    public void setTx(Transaction tx) {
        this.tx = tx;
    }
    
    
}
