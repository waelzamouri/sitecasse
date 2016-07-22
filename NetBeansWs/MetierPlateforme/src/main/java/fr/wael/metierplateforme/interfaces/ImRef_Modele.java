/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.interfaces;

import fr.wael.model.Ref_modele;
import java.util.List;

/**
 *
 * @author wael
 */
public interface ImRef_Modele {
    public List<Ref_modele> getModelesByMarque(String nom_marque);
}
