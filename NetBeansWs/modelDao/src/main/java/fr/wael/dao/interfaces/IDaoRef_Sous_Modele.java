/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Ref_Sous_Modele;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoRef_Sous_Modele {

    public Ref_Sous_Modele getRef_Sous_ModeleById(Long id_avis);

    public void addRef_Sous_Modele(Ref_Sous_Modele avis);

    public List<Ref_Sous_Modele> getAllRef_Sous_Modele();

    public void deleteRef_Sous_Modele(Ref_Sous_Modele avis);

}
