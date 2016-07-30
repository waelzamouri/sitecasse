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
    final IDaoRef_modele iDaoRef_modele;

    @Override
    public List<Ref_Sous_Modele> getSousModelByModel(long id_modele) {
       
       final Ref_modele ref_modele_trouve = iDaoRef_modele.getRef_modeleById(id_modele);
       return ref_modele_trouve.getRef_Sous_Modele();
    }

    @Override
    public long getIdModelByName(String name_modele) {
       List<Ref_modele> ref_modeles = iDaoRef_modele.getAllRef_modele();
       for(Ref_modele ref : ref_modeles){
           if(ref.getNom_modele().equals(name_modele)){
               return ref.getId_ref_modele();
           }
       }
       return 0;
    }
    

    public MRef_Sous_Modele() {
        iDaoRef_modele = new DaoRef_modele();
    }
    
    
    
}
