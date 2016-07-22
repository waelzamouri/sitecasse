/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Ref_Marque;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoRef_Marque {

    public Ref_Marque getRef_MarqueById(Long id_avis);

    public void addRef_Marque(Ref_Marque avis);

    public List<Ref_Marque> getAllRef_Marque();

    public void deleteRef_Marque(Ref_Marque avis);

}
