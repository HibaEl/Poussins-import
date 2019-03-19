/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest.converter;

import com.poussin.Import.bean.Import;
import com.poussin.Import.common.util.NumberUtil;
import com.poussin.Import.rest.vo.ImportVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author DELL
 */
@Component
public class ImportConverter extends AbstractConverter<Import, ImportVo> {

    @Override
    public Import toItem(ImportVo vo) {
        if (vo == null) {
            return null;

        } else {
            Import item = new Import();
            item.setReference(vo.getReference());
            item.setId(vo.getId());
           item.setNbrFemale(NumberUtil.toInt(vo.getNbrFemale()));
            item.setNbrMale(NumberUtil.toInt(vo.getNbrMale()));
            item.setNbrTotal(NumberUtil.toInt(vo.getNbrTotal()));
            item.setPrixFemale(NumberUtil.toDouble(vo.getPrixFemale()));
            item.setPrixMale(NumberUtil.toDouble(vo.getPrixMale()));
            item.setPrixTotal(NumberUtil.toDouble(vo.getPrixTotal()));
            item.setEvolutions(new EvolutionConverter().toItem(vo.getEvolutionsVo()));
            item.setFournisseur(new FournisseurConverter().toItem(vo.getFournisseurVo()));
            return item;
        }
    }

    @Override
    public ImportVo toVo(Import item) {
        if (item == null) {
            return null;

        } else {
            ImportVo vo = new ImportVo();
            vo.setReference(item.getReference());
            vo.setId(item.getId());
           vo.setNbrFemale(NumberUtil.toStringI(item.getNbrFemale()));
            vo.setNbrMale(NumberUtil.toStringI(item.getNbrMale()));
            vo.setNbrTotal(NumberUtil.toStringI(item.getNbrTotal()));
            vo.setPrixFemale(NumberUtil.toStringD(item.getPrixFemale()));
            vo.setPrixMale(NumberUtil.toStringD(item.getNbrMale()));
            vo.setPrixTotal(NumberUtil.toStringD(item.getPrixTotal()));
        //vo.setEvolutionsVo(new EvolutionConverter().toVo(item.getEvolutions()));
            vo.setFournisseurVo(new FournisseurConverter().toVo(item.getFournisseur()));
            return vo;
        }
    }

 
}


