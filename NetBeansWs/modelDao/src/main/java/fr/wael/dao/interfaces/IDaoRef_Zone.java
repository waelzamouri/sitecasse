/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.dao.interfaces;

import fr.wael.model.Ref_Zone;
import java.util.List;

/**
 *
 * @author wael
 */
public interface IDaoRef_Zone {

    public Ref_Zone getRef_ZoneById(Long id_avis);

    public void addRef_Zone(Ref_Zone avis);

    public List<Ref_Zone> getAllRef_Zone();

    public void deleteRef_Zone(Ref_Zone avis);

}
