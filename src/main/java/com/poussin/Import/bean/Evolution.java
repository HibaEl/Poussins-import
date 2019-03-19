/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
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
    private String reference;
    private int nbrOeuf;
    private double poid;
    @ManyToOne
    private Import importation;
    private int semaine;

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

    @JsonIgnore
    public Import getImportation() {
        return importation;
    }

    @JsonSetter
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
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.reference);
        hash = 29 * hash + this.nbrOeuf;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.poid) ^ (Double.doubleToLongBits(this.poid) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.importation);
        hash = 29 * hash + this.semaine;
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
        if (this.nbrOeuf != other.nbrOeuf) {
            return false;
        }
        if (Double.doubleToLongBits(this.poid) != Double.doubleToLongBits(other.poid)) {
            return false;
        }
        if (this.semaine != other.semaine) {
            return false;
        }
        if (!Objects.equals(this.reference, other.reference)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.importation, other.importation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evolution{" + "id=" + id + ", reference=" + reference + ", nbrOeuf=" + nbrOeuf + ", poid=" + poid + ", importation=" + importation + ", semaine=" + semaine + '}';
    }

}
