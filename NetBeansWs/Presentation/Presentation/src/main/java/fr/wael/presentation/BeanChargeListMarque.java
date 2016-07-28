/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoRef_Marque;
import fr.wael.dao.interfaces.IDaoRef_Marque;
import fr.wael.model.Ref_Marque;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wael
 */
@ManagedBean
@RequestScoped
public class BeanChargeListMarque implements Serializable {

    private static final long serialVersionUID = 1L;
    private IDaoRef_Marque iDaoRef_Marque;
    List<Ref_Marque> ref_marques;
    
    public BeanChargeListMarque() {
        iDaoRef_Marque = new DaoRef_Marque();
        ref_marques = iDaoRef_Marque.getAllRef_Marque();
    }

    public List<Ref_Marque> getRef_marques() {
        return ref_marques;
    }

    public void setRef_marques(List<Ref_Marque> ref_marques) {
        this.ref_marques = ref_marques;
    }
    

    public String toAfficheMarque(){
        return "affiche-marque";
    }
    
}
