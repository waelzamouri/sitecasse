/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.interfaces;

import fr.wael.model.Client;

/**
 *
 * @author wael
 */
public interface ImClient {
    public Client verifConnection(String mail, String psw);
}
