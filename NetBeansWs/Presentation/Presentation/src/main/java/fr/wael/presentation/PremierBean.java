/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.presentation;

import fr.wael.dao.imp.DaoRef_Marque;
import fr.wael.dao.imp.DaoRef_modele;
import fr.wael.dao.interfaces.IDaoRef_Marque;
import fr.wael.dao.interfaces.IDaoRef_modele;
import fr.wael.model.Ref_Marque;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author wael
 */
@ManagedBean
@SessionScoped
public class PremierBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private IDaoRef_Marque daoRef_Marque;
    private IDaoRef_modele daoRef_modele;
    private Ref_Marque ref_Marque;
    private List<Ref_Marque> ref_marquess;

    /**
     * Creates a new instance of PremierBean
     */
    public PremierBean() {
        daoRef_Marque = new DaoRef_Marque();
        ref_Marque = new Ref_Marque();
        ref_marquess = new ArrayList();
        daoRef_modele = new DaoRef_modele();
    }

    private List<Ref_Marque> toutesLesMarques() {

        ref_marquess = daoRef_Marque.getAllRef_Marque();
        //System.out.println(ref_marquess.get(0).getNom_marque());
        return ref_marquess;

    }
//    public void valueChangeMethod(ValueChangeEvent e){
//            
//	}

    public String toRecherche() {
        return "rech";
    }

    public IDaoRef_Marque getDaoRef_Marque() {
        return daoRef_Marque;
    }

    public void setDaoRef_Marque(IDaoRef_Marque daoRef_Marque) {
        this.daoRef_Marque = daoRef_Marque;
    }

    public Ref_Marque getRef_Marque() {
        return ref_Marque;
    }

    public void setRef_Marque(Ref_Marque ref_Marque) {
        this.ref_Marque = ref_Marque;
    }

    public List<Ref_Marque> getRef_marquess() {
        return toutesLesMarques();
    }

    public void setRef_marquess(ArrayList<Ref_Marque> ref_marquess) {
        this.ref_marquess = ref_marquess;
    }

    public IDaoRef_modele getDaoRef_modele() {
        return daoRef_modele;
    }

    public void setDaoRef_modele(IDaoRef_modele daoRef_modele) {
        this.daoRef_modele = daoRef_modele;
    }


}
