/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoPiece;
import fr.wael.model.Piece;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoPiece implements IDaoPiece {

    private Session session;
    private Transaction tx = null;

    @Override
    public Piece getPieceById(Long id_piece) {
        
        final Piece pieceReturn = (Piece) session.get(Piece.class, id_piece);

        return pieceReturn;

    }

    @Override
    public void addPiece(Piece piece) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(piece);
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
    public List<Piece> getAllPiece() {
        return session.createCriteria(Piece.class).list();
    }

    @Override
    public void deletePiece(Piece piece) {

        try {
            tx = session.beginTransaction();
            session.delete(piece);
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

    public DaoPiece() {
        session = HibernateUtil.getSession();
    }

}
