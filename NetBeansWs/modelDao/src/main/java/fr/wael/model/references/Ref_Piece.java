/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.wael.model.references;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author wael
 */
public class Ref_Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(nullable = false)
    private Long id_ref_piece;

    @Column
    private String nom_piece;

    @ManyToOne
    private Ref_Zone ref_Zone;

    public Long getId_ref_piece() {
        return id_ref_piece;
    }

    public void setId_ref_piece(Long id_ref_piece) {
        this.id_ref_piece = id_ref_piece;
    }

    public String getNom_piece() {
        return nom_piece;
    }

    public void setNom_piece(String nom_piece) {
        this.nom_piece = nom_piece;
    }

    public Ref_Zone getRef_Zone() {
        return ref_Zone;
    }

    public void setRef_Zone(Ref_Zone ref_Zone) {
        this.ref_Zone = ref_Zone;
    }

    public Ref_Piece() {
    }

}
