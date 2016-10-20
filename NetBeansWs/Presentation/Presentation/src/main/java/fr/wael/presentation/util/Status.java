/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation.util;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wael
 */
@ManagedBean
@SessionScoped
public class Status implements Serializable{
   
    @ManagedProperty(value = "#{connexion.connected}")
    private boolean connected;

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    private Status() {
        this.connected = false;
    }

   
    
}
