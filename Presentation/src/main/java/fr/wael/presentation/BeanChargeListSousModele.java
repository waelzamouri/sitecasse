/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoRef_modele;
import fr.wael.dao.interfaces.IDaoRef_modele;
import fr.wael.metierplateforme.implemntation.MRef_Sous_Modele;
import fr.wael.metierplateforme.interfaces.ImRef_Sous_Modele;
import fr.wael.model.Ref_Sous_Modele;
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
public class BeanChargeListSousModele {

    private static final long serialVersionUID = 1L;
    private ImRef_Sous_Modele imRef_Sous_Modele;
    private List<Ref_Sous_Modele> ref_Sous_Modeles;
    private IDaoRef_modele iDaoRef_modele;

    @ManagedProperty(value = "#{premierBean.id_modele}")
    private String id_modele;

    @ManagedProperty(value = "#{premierBean.f_modele}")
    private String f_modele;

    public List<Ref_Sous_Modele> getRef_Sous_Modeles() {
        if (!id_modele.equals("0")) {
            iDaoRef_modele = new DaoRef_modele();
            id_modele = iDaoRef_modele.getIdModeleByName(f_modele).toString();
            ref_Sous_Modeles = imRef_Sous_Modele.getSousModelByModel(Long.parseLong(id_modele));
        }
        return ref_Sous_Modeles;
    }

    public void setRef_Sous_Modeles(List<Ref_Sous_Modele> ref_Sous_Modeles) {

        this.ref_Sous_Modeles = ref_Sous_Modeles;
    }

    public String getId_modele() {
        return id_modele;
    }

    public void setId_modele(String id_modele) {
        this.id_modele = id_modele;
    }

    public String getF_modele() {
        return f_modele;
    }

    public void setF_modele(String f_modele) {
        this.f_modele = f_modele;
    }

    public BeanChargeListSousModele() {
        imRef_Sous_Modele = new MRef_Sous_Modele();
    }

}
