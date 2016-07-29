/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

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

    @ManagedProperty(value = "#{premierBean.f_marque}")
    private String f_marque;
     
    public BeanChargeListModele() {
        imRef_Modele = new MRef_Modele();
        
    }

    public List<Ref_modele> getRef_modele() {
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
        ref_modele = imRef_Modele.getModelesByMarque(f_marque);
        
    }
    

}
