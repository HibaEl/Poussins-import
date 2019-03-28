/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author DELL
 */
@Entity
public class Import implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private int nbrMale;
    private int nbrFemale;
    private int nbrTotal;
    private double prixMale;
    
    private double prixFemale;
    private double prixTotal;
    @OneToOne
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "importation",cascade = CascadeType.REMOVE)
    private List<Evolution> evolutions;

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

    public int getNbrMale() {
        return nbrMale;
    }

    public void setNbrMale(int nbrMale) {
        this.nbrMale = nbrMale;
    }

    public int getNbrFemale() {
        return nbrFemale;
    }

    public void setNbrFemale(int nbrFemale) {
        this.nbrFemale = nbrFemale;
    }

    public int getNbrTotal() {
        return nbrTotal;
    }

    public void setNbrTotal(int nbrTotal) {
        this.nbrTotal = nbrTotal;
    }

    public double getPrixMale() {
        return prixMale;
    }

    public void setPrixMale(double prixMale) {
        this.prixMale = prixMale;
    }

    public double getPrixFemale() {
        return prixFemale;
    }

    public void setPrixFemale(double prixFemale) {
        this.prixFemale = prixFemale;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    @JsonIgnore
    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    @JsonSetter
    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    @JsonIgnore
    public List<Evolution> getEvolutions() {
        return evolutions;
    }

    @JsonSetter
    public void setEvolutions(List<Evolution> evolutions) {
        this.evolutions = evolutions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final Import other = (Import) obj;

        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Import{" + "id=" + id + ", reference=" + reference + ", nbrMale=" + nbrMale + ", nbrFemale=" + nbrFemale + ", nbrTotal=" + nbrTotal + ", prixMale=" + prixMale + ", prixFemale=" + prixFemale + ", prixTotal=" + prixTotal + ", fournisseur=" + fournisseur + ", evolutions=" + evolutions + '}';
    }

}
