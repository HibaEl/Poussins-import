/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.serviceImpl;

import com.poussin.Import.bean.Evolution;
import com.poussin.Import.bean.Import;
import com.poussin.Import.dao.EvolutionDao;

import com.poussin.Import.service.EvolutionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class EvolutionServiceImpl implements EvolutionService {

    @Autowired
    private EvolutionDao evolutionDao;

    @Override
    public int creer(Import importation, List<Evolution> evolutions) {
        System.out.println("ha size d list == " + evolutions.size());
        for (Evolution evolution : evolutions) {
            System.out.println(evolution);
            evolution.setImportation(importation);
            evolutionDao.save(evolution);
        }
        return 1;
    }

    @Override
    public List<Evolution> findByImportationReference(String reference) {
        return evolutionDao.findByImportationReference(reference);
    }

    public EvolutionDao getEvolutionDao() {
        return evolutionDao;
    }

    public void setEvolutionDao(EvolutionDao evolutionDao) {
        this.evolutionDao = evolutionDao;
    }
}
