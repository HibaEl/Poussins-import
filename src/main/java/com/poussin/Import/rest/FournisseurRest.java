/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest;

import com.poussin.Import.bean.Fournisseur;
import com.poussin.Import.rest.converter.AbstractConverter;
import com.poussin.Import.rest.converter.FournisseurConverter;
import com.poussin.Import.rest.vo.FournisseurVo;
import com.poussin.Import.service.FournisseurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/Import/fournisseurs"})
public class FournisseurRest {

    @Autowired
    private FournisseurService fournisseurService;

    @Autowired
    @Qualifier("fournisseurConverter")
    private AbstractConverter<Fournisseur, FournisseurVo> fournisseurConverter;

    @GetMapping("/")
    public List<FournisseurVo> findAllFournisseurs() {
        return new FournisseurConverter().toVo(fournisseurService.findAllFournisseurs());
    }

    public FournisseurService getFournisseurService() {
        return fournisseurService;
    }

    public void setFournisseurService(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    public AbstractConverter<Fournisseur, FournisseurVo> getFournisseurConverter() {
        return fournisseurConverter;
    }

    public void setFournisseurConverter(AbstractConverter<Fournisseur, FournisseurVo> fournisseurConverter) {
        this.fournisseurConverter = fournisseurConverter;
    }

}
