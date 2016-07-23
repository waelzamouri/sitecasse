/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;




/**
 *
 * @author wael
 */
@ManagedBean
@SessionScoped
public class PremierBean implements Serializable {
private static final long serialVersionUID = 1L;
    /**
     * Creates a new instance of PremierBean
     */
    public PremierBean() {
    }

    public String toRecherche() {
        return "rech";
    }

}
