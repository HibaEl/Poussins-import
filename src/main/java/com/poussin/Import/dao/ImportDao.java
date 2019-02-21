/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.dao;

import com.poussin.Import.bean.Fournisseur;
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

    public Import findByFournisseur(Fournisseur fournisseur);

}
