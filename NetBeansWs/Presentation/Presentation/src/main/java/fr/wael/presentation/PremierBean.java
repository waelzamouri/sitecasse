/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author wael
 */
@Named(value = "premierBean")
@SessionScoped
public class PremierBean implements Serializable {

    /**
     * Creates a new instance of PremierBean
     */
    public PremierBean() {
    }

    public String toRecherche() {
        return "recherche";
    }

}
