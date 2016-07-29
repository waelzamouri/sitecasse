/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.metierplateforme.implemntation;

import fr.wael.dao.imp.DaoRef_Marque;
import fr.wael.dao.interfaces.IDaoRef_Marque;
import fr.wael.metierplateforme.interfaces.ImRef_Modele;
import fr.wael.model.Ref_Marque;
import fr.wael.model.Ref_modele;
import java.util.List;

/**
 *
 * @author wael
 */
public class MRef_Modele implements ImRef_Modele {

    @Override
    public List<Ref_modele> getModelesByMarque(String nom_marque) {
        Ref_Marque ref_marque_trouve = null;
        final IDaoRef_Marque iDaoRef_Marque = new DaoRef_Marque();
        List<Ref_Marque> ref_Marques = iDaoRef_Marque.getAllRef_Marque();
        for (Ref_Marque ref_Marque : ref_Marques) {
            if (ref_Marque.getNom_marque().equals(nom_marque)) {
                ref_marque_trouve = ref_Marque;
            }
        }
        if(ref_marque_trouve != null){
            return ref_marque_trouve.getRef_modele();
        }else{
            return null;
        }
    }

}
