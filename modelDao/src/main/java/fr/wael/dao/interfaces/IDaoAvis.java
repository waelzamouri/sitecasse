/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Avis;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoAvis {

    public Avis getAvisById(Long id_avis);

    public void addAvis(Avis avis);

    public List<Avis> getAllAvis();

    public void deleteAvis(Avis avis);

}
