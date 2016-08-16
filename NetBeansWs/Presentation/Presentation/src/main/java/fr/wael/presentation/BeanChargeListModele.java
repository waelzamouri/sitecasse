/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoRef_Marque;
import fr.wael.dao.interfaces.IDaoRef_Marque;
import fr.wael.metierplateforme.implemntation.MRef_Modele;
import fr.wael.metierplateforme.interfaces.ImRef_Modele;
import fr.wael.model.Ref_modele;
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
public class BeanChargeListModele implements Serializable {

    private static final long serialVersionUID = 1L;
    private ImRef_Modele imRef_Modele;
    private List<Ref_modele> ref_modele;
    private IDaoRef_Marque iDaoRef_Marque;

    @ManagedProperty(value = "#{premierBean.f_marque}")
    private String f_marque;

    @ManagedProperty(value = "#{premierBean.id_marque}")
    private String id_marque;

    public BeanChargeListModele() {
        imRef_Modele = new MRef_Modele();

    }

    public String getId_marque() {
        return id_marque;
    }

    public void setId_marque(String id_marque) {
        this.id_marque = id_marque;
    }

    public List<Ref_modele> getRef_modele() {

        iDaoRef_Marque = new DaoRef_Marque();
        id_marque = iDaoRef_Marque.getIdMarqueByName(f_marque).toString();
       

        ref_modele = imRef_Modele.getModelesByMarque(Long.parseLong(id_marque));

        return ref_modele;
    }

    public void setRef_modele(List<Ref_modele> ref_modele) {
        this.ref_modele = ref_modele;
    }

    public String getF_marque() {
        return f_marque;
    }

    public void setF_marque(String f_marque) {
        this.f_marque = f_marque;

    }

}
