/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest;

import com.poussin.Import.bean.Evolution;
import com.poussin.Import.bean.Import;
import com.poussin.Import.rest.converter.AbstractConverter;
import com.poussin.Import.rest.converter.EvolutionConverter;
import com.poussin.Import.rest.vo.EvolutionVo;
import com.poussin.Import.service.EvolutionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/Import/evolutions"})
public class EvolutionRest {

    @Autowired
    private EvolutionService evolutionService;
    @Autowired
    @Qualifier("evolutionConverter")
    private AbstractConverter<Evolution, EvolutionVo> evolutionConverter;

    @GetMapping("/ReferenceImport/{reference}")
    public List<EvolutionVo> findByImportationReference(@PathVariable("") String reference) {
        return new EvolutionConverter().toVo(evolutionService.findByImportationReference(reference));
    }
    @GetMapping("/reference/{reference}")
    public   EvolutionVo findByReference(@PathVariable("") String reference) {
        return new EvolutionConverter().toVo(evolutionService.findByReference(reference));
    }

    public EvolutionService getEvolutionService() {
        return evolutionService;
    }

    public void setEvolutionService(EvolutionService evolutionService) {
        this.evolutionService = evolutionService;
    }

    public AbstractConverter<Evolution, EvolutionVo> getEvolutionConverter() {
        return evolutionConverter;
    }

    public void setEvolutionConverter(AbstractConverter<Evolution, EvolutionVo> evolutionConverter) {
        this.evolutionConverter = evolutionConverter;
    }

   
   

}
