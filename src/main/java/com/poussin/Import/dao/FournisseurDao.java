/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.dao;

import com.poussin.Import.bean.Fournisseur;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur,Long> {
    
}
