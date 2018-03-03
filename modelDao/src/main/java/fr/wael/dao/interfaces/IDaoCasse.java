/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Casse;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoCasse {

    public Casse getCasseById(Long id_avis);

    public void addCasse(Casse avis);

    public List<Casse> getAllCasse();

    public void deleteCasse(Casse avis);
}
