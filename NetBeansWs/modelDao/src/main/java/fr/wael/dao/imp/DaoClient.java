/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.imp;

import fr.wael.dao.interfaces.IDaoClient;
import fr.wael.model.Client;
import fr.wael.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author wael
 */
public class DaoClient implements IDaoClient {

    private Session session;
    private Transaction tx = null;

    @Override
    public Client getClientById(Long id_client) {
        
        final Client clientReturn = (Client) session.get(Client.class, id_client);

        return clientReturn;

    }

    @Override
    public void addClient(Client client) {
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(client);
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
    public List<Client> getAllClient() {
        return session.createCriteria(Client.class).list();
    }

    @Override
    public void deleteClient(Client client) {

        try {
            tx = session.beginTransaction();
            session.delete(client);
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

    public DaoClient() {
        session = HibernateUtil.getSession();
    }

}
