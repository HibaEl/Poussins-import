/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.service;

import com.poussin.Import.bean.Evolution;
import com.poussin.Import.bean.Import;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author DELL
 */
public interface EvolutionService {

    public int creer(Import importation, List<Evolution> evolutions);

    public List<Evolution> findByImportationReference(String reference);

   
}
