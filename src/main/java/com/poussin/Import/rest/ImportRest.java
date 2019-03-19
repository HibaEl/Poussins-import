/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest;

import com.poussin.Import.bean.Import;
import com.poussin.Import.rest.converter.AbstractConverter;
import com.poussin.Import.rest.converter.ImportConverter;
import com.poussin.Import.rest.vo.ImportVo;
import com.poussin.Import.service.ImportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/Import/imports"})
public class ImportRest {

    @Autowired
    private ImportService importService;

    @Autowired
    @Qualifier("importConverter")
    private AbstractConverter<Import, ImportVo> importConverter;

    @PostMapping("/")
    public int creer(@RequestBody ImportVo importationVo) {
        Import importation = new ImportConverter().toItem(importationVo);
        return importService.creer(importation, importation.getEvolutions());
    }

    @GetMapping("/reference/{reference}")
    public ImportVo findByReference(@PathVariable String reference) {
        return new ImportConverter().toVo(importService.findByReference(reference));
    }

    @GetMapping("/")
    public List<ImportVo> findAll() {
        return new ImportConverter().toVo(importService.findAll());
    }

    @GetMapping("/nom/{nom}")
    public ImportVo recupererListImport(@PathVariable("nom") String nom) {
        return new ImportConverter().toVo(importService.recupererListImport(nom));
    }

    @GetMapping("/idImportNbrOeuf/{id}")
    public Double averageNnrOeuf(@PathVariable Long id) {
        return importService.averageNnrOeuf(id);
    }

    @GetMapping("/idImportPoid/{id}")
    public Double averagePoid(@PathVariable Long id) {
        return importService.averagePoid(id);
    }

    public ImportService getImportService() {
        return importService;
    }

    public void setImportService(ImportService importService) {
        this.importService = importService;
    }

    public AbstractConverter<Import, ImportVo> getImportConverter() {
        return importConverter;
    }

    public void setImportConverter(AbstractConverter<Import, ImportVo> importConverter) {
        this.importConverter = importConverter;
    }

}
