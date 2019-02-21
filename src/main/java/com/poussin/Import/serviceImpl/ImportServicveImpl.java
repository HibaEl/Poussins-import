/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.serviceImpl;

import com.poussin.Import.bean.Evolution;
import com.poussin.Import.bean.Import;
import com.poussin.Import.dao.ImportDao;
import com.poussin.Import.service.EvolutionService;
import com.poussin.Import.service.ImportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class ImportServicveImpl implements ImportService {

    @Autowired
    private EvolutionService evolutionService;
    @Autowired
    private ImportDao importDao;

    @Override
    public int creer(Import importation, List<Evolution> evolutions) {
        Import t = findByReference(importation.getReference());
        if (t != null) {
            return -1;
        } else {
            calculNbrTotal(importation);
            calculPrixTotal(importation);
            importDao.save(importation);
            evolutionService.creer(importation, evolutions);
            return 1;

        }
    }

    @Override
    public int calculNbrTotal(Import importation) {
        int nbrTotal = 0;
        nbrTotal = importation.getNbrFemale() + importation.getNbrMale();
        importation.setNbrTotal(nbrTotal);
        return 1;
    }

    @Override
    public double calculPrixTotal(Import importation) {
        double prixTotal = 0;
        prixTotal = (importation.getPrixFemale() * importation.getNbrFemale()) + (importation.getNbrMale() * importation.getPrixMale());
        importation.setPrixTotal(prixTotal);
        return 1;
    }

    @Override
    public Import findByReference(String reference) {
        return importDao.findByReference(reference);
    }

    public EvolutionService getEvolutionService() {
        return evolutionService;
    }

    public void setEvolutionService(EvolutionService evolutionService) {
        this.evolutionService = evolutionService;
    }

    public ImportDao getImportDao() {
        return importDao;
    }

    public void setImportDao(ImportDao importDao) {
        this.importDao = importDao;
    }

}
