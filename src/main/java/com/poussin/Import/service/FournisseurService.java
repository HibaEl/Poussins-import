/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.service;

import com.poussin.Import.bean.Fournisseur;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface FournisseurService {
   
    public List<Fournisseur> findAllFournisseurs();
}
