/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoRef_Piece;
import fr.wael.model.Ref_Piece;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoRef_Piece implements IDaoRef_Piece {

    private Session session;
    private Transaction tx = null;

    @Override
    public Ref_Piece getRef_PieceById(Long id_ref_Piece) {
        
        final Ref_Piece ref_PieceReturn = (Ref_Piece) session.get(Ref_Piece.class, id_ref_Piece);

        return ref_PieceReturn;

    }

    @Override
    public void addRef_Piece(Ref_Piece ref_Piece) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(ref_Piece);
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
    public List<Ref_Piece> getAllRef_Piece() {
        return session.createCriteria(Ref_Piece.class).list();
    }

    @Override
    public void deleteRef_Piece(Ref_Piece ref_Piece) {

        try {
            tx = session.beginTransaction();
            session.delete(ref_Piece);
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

    public DaoRef_Piece() {
        session = HibernateUtil.getSession();
    }

}
