/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Demande;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoDemande {
        public Demande getDemandeById(Long id_demande);

    public void addDemande(Demande demande);

    public List<Demande> getAllDemande();

    public void deleteDemande(Demande demande);
}
