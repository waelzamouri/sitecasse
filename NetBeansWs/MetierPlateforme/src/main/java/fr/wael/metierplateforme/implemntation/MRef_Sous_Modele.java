/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.implemntation;

import fr.wael.dao.imp.DaoRef_modele;
import fr.wael.dao.interfaces.IDaoRef_modele;
import fr.wael.metierplateforme.interfaces.ImRef_Sous_Modele;
import fr.wael.model.Ref_Sous_Modele;
import fr.wael.model.Ref_modele;
import java.util.List;

/**
 *
 * @author wael
 */
public class MRef_Sous_Modele implements ImRef_Sous_Modele{

    @Override
    public List<Ref_Sous_Modele> getSousModelByModel(String nom_model) {
        IDaoRef_modele iDao_ref_modeles = new DaoRef_modele();
        List<Ref_modele> ref_modeles = iDao_ref_modeles.getAllRef_modele();
        return null;
    }
    
}
