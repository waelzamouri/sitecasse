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
    public List<Ref_modele> getModelesByMarque(long id_marque) {
        final IDaoRef_Marque iDaoRef_Marque = new DaoRef_Marque();
        Ref_Marque ref_marque_trouve = null;
        ref_marque_trouve = iDaoRef_Marque.getRef_MarqueById(id_marque);
        return ref_marque_trouve.getRef_modele();
    }

}
