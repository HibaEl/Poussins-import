/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author DELL
 */
@Entity
public class Evolution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference ;
    private int nbrOeuf ;
    private double poid ;
    @ManyToOne
    private Import importation;
    private int semaine ;

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

    public int getNbrOeuf() {
        return nbrOeuf;
    }

    public void setNbrOeuf(int nbrOeuf) {
        this.nbrOeuf = nbrOeuf;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public Import getImportation() {
        return importation;
    }

    public void setImportation(Import importation) {
        this.importation = importation;
    }

    public int getSemaine() {
        return semaine;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evolution other = (Evolution) obj;
      
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
       
        return true;
    }

    @Override
    public String toString() {
        return "Evolution{" + "id=" + id + ", reference=" + reference + ", nbrOeuf=" + nbrOeuf + ", poid=" + poid +", semaine=" + semaine + '}';
    }
    
    

    
}
