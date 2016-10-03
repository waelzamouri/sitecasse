/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Client;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoClient {
     public Client getClientById(Long id_avis);

    public void addClient(Client avis);

    public List<Client> getAllClient();

    public void deleteClient(Client avis);
    
    public Client getClientBymail(String mail);
}
