/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Devis;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoDevis {

    public Devis getDevisById(Long id_avis);

    public void addDevis(Devis avis);

    public List<Devis> getAllDevis();

    public void deleteDevis(Devis avis);

}
