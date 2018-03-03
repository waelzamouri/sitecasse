/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoRef_Zone;
import fr.wael.dao.interfaces.IDaoRef_Zone;
import fr.wael.model.Ref_Piece;
import fr.wael.model.Ref_Zone;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author wael
 */
@ManagedBean
@RequestScoped
public class BeanChargeZone implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{premierBean.id_ref_zone}")
    private String id_ref_zone;

    private IDaoRef_Zone iDaoRef_Zone;
    private List<Ref_Zone> ref_Zones;

    public BeanChargeZone() {
        iDaoRef_Zone = new DaoRef_Zone();
        ref_Zones = iDaoRef_Zone.getAllRef_Zone();
    }

    public String getId_ref_zone() {
        return id_ref_zone;
    }

    public void setId_ref_zone(String id_ref_zone) {
        this.id_ref_zone = id_ref_zone;
    }

    public List<Ref_Zone> getRef_Zones() {
        return ref_Zones;
    }

    public void setRef_Zones(List<Ref_Zone> ref_Zones) {
        this.ref_Zones = ref_Zones;
    }

    public List<Ref_Piece> getAllPiecesByIdZone() {
//        List<Ref_Piece> ref_pieces;
        for (Ref_Zone ref_zones : ref_Zones) {
            if (ref_zones.getId_ref_zone() == Long.parseLong(id_ref_zone)) {
                return ref_zones.getRef_Piece();
            }
        }
        return null;
    }

}
