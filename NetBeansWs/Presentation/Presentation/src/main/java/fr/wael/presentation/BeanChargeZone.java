/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoRef_Zone;
import fr.wael.dao.interfaces.IDaoRef_Zone;
import fr.wael.model.Ref_Zone;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author wael
 */
@ManagedBean
@RequestScoped
public class BeanChargeZone implements Serializable {

    private static final long serialVersionUID = 1L;

    private IDaoRef_Zone iDaoRef_Zone;
    private List<Ref_Zone> ref_Zones;
    
    public BeanChargeZone() {
        iDaoRef_Zone = new DaoRef_Zone();
        ref_Zones = iDaoRef_Zone.getAllRef_Zone();
    }

    public List<Ref_Zone> getRef_Zones() {
        return ref_Zones;
    }

    public void setRef_Zones(List<Ref_Zone> ref_Zones) {
        this.ref_Zones = ref_Zones;
    }
    

}
