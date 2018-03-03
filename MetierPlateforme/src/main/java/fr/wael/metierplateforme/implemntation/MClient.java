/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.implemntation;

import fr.wael.dao.imp.DaoClient;

import fr.wael.dao.interfaces.IDaoClient;
import fr.wael.metierplateforme.interfaces.ImClient;
import fr.wael.model.Client;

/**
 *
 * @author wael
 */
public class MClient implements ImClient {
    
    private IDaoClient iDaoClient;
    
    @Override
    public Client verifConnection(String mail, String psw) {
        final Client c = iDaoClient.getClientBymail(mail);
        if (c.getPsw().equals(psw)) {
            return c;
        }
        return null;        
    }
    
    public MClient() {
        iDaoClient = new DaoClient();
    }
    
    @Override
    public void addClient(Client client) {
        iDaoClient.addClient(client);
    }
    
}
