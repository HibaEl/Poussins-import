/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest.vo;

/**
 *
 * @author DELL
 */
public class EvolutionVo {
    private Long id;
    private String reference ;
    private String nbrOeuf ;
    private String poid ;
    private ImportVo importationVo;
    private String semaine ;

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

    public String getNbrOeuf() {
        return nbrOeuf;
    }

    public void setNbrOeuf(String nbrOeuf) {
        this.nbrOeuf = nbrOeuf;
    }

    public String getPoid() {
        return poid;
    }

    public void setPoid(String poid) {
        this.poid = poid;
    }

    public ImportVo getImportationVo() {
        return importationVo;
    }

    public void setImportationVo(ImportVo importationVo) {
        this.importationVo = importationVo;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    
    
    
}
