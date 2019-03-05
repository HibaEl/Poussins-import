/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest;

import com.poussin.Import.rest.converter.EvolutionConverter;
import com.poussin.Import.rest.vo.EvolutionVo;
import com.poussin.Import.service.EvolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping({"/Import/evolutions"})
public class EvolutionRest {

    @Autowired
    private EvolutionService evolutionService;

    @GetMapping("/reference/{reference}")
    public EvolutionVo findByReference(@PathVariable String reference) {
        return new EvolutionConverter().toVo(evolutionService.findByReference(reference));
    }

    public EvolutionService getEvolutionService() {
        return evolutionService;
    }

    public void setEvolutionService(EvolutionService evolutionService) {
        this.evolutionService = evolutionService;
    }
}
