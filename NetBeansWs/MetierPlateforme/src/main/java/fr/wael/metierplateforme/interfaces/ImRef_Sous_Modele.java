/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.interfaces;

import fr.wael.model.Ref_Sous_Modele;
import java.util.List;

/**
 *
 * @author wael
 */
public interface ImRef_Sous_Modele {
    public List<Ref_Sous_Modele> getSousModelByModel(long id_modele);
    public long getIdModelByName(String name_modele);
}
