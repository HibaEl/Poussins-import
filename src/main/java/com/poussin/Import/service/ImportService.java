/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.service;

import com.poussin.Import.bean.Evolution;
import com.poussin.Import.bean.Fournisseur;
import com.poussin.Import.bean.Import;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ImportService {

    public Import findByReference(String reference);

    public int creer(Import importation, List<Evolution> evolutions);

    public int calculNbrTotal(Import importation);

    public double calculPrixTotal(Import importation);

    
}
