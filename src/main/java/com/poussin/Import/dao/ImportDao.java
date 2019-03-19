/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.dao;

import com.poussin.Import.bean.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface ImportDao extends JpaRepository<Import, Long> {

    public Import findByReference(String reference);

    @Query("select i from Import i where i.fournisseur.nom = :nom")
    public Import recupererListImport(@Param("nom") String nom);

    @Query("select Avg(e.nbrOeuf) from Evolution e where e.importation.id= :id")
    public Double averageNnrOeuf(@Param("id") Long id);

    @Query("select Avg(e.poid) from Evolution e where e.importation.id= :id")
    public Double averagePoid(@Param("id") Long id);
}
