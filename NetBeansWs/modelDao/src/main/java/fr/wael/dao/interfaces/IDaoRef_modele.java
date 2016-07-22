/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Ref_modele;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoRef_modele {

    public Ref_modele getRef_modeleById(Long id_avis);

    public void addRef_modele(Ref_modele avis);

    public List<Ref_modele> getAllRef_modele();

    public void deleteRef_modele(Ref_modele avis);

}
