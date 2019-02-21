/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest.vo;

import java.util.List;

/**
 *
 * @author DELL
 */
public class ImportVo {
       private Long id;
    private String reference;
    private String nbrMale;
    private String nbrFemale;
    private String nbrTotal;
    private String prixMale;
    private String prixFemale;
    private String prixTotal;
    private FournisseurVo fournisseurVo;
    private List<EvolutionVo> evolutionsVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNbrMale() {
        return nbrMale;
    }

    public void setNbrMale(String nbrMale) {
        this.nbrMale = nbrMale;
    }

    public String getNbrFemale() {
        return nbrFemale;
    }

    public void setNbrFemale(String nbrFemale) {
        this.nbrFemale = nbrFemale;
    }

    public String getNbrTotal() {
        return nbrTotal;
    }

    public void setNbrTotal(String nbrTotal) {
        this.nbrTotal = nbrTotal;
    }

    public String getPrixMale() {
        return prixMale;
    }

    public void setPrixMale(String prixMale) {
        this.prixMale = prixMale;
    }

    public String getPrixFemale() {
        return prixFemale;
    }

    public void setPrixFemale(String prixFemale) {
        this.prixFemale = prixFemale;
    }

    public String getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(String prixTotal) {
        this.prixTotal = prixTotal;
    }

    public FournisseurVo getFournisseurVo() {
        return fournisseurVo;
    }

    public void setFournisseurVo(FournisseurVo fournisseurVo) {
        this.fournisseurVo = fournisseurVo;
    }

    public List<EvolutionVo> getEvolutionsVo() {
        return evolutionsVo;
    }

    public void setEvolutionsVo(List<EvolutionVo> evolutionsVo) {
        this.evolutionsVo = evolutionsVo;
    }

    
    
}
