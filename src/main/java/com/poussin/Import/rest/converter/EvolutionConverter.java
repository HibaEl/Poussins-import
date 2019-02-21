/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest.converter;

import com.poussin.Import.bean.Evolution;
import com.poussin.Import.common.util.NumberUtil;
import com.poussin.Import.rest.vo.EvolutionVo;

/**
 *
 * @author DELL
 */
public class EvolutionConverter extends AbstractConverter<Evolution, EvolutionVo> {

    @Override
    public Evolution toItem(EvolutionVo vo) {
        if (vo == null) {
            return null;
        } else {
            Evolution item = new Evolution();
            item.setReference(vo.getReference());
            item.setId(vo.getId());
            item.setNbrOeuf(NumberUtil.toInt(vo.getNbrOeuf()));
            item.setSemaine(NumberUtil.toInt(vo.getSemaine()));
            item.setPoid(NumberUtil.toDouble(vo.getPoid()));
            item.setImportation(new ImportConverter().toItem(vo.getImportationVo()));
            return item;

        }
    }

    @Override
    public EvolutionVo toVo(Evolution item) {
        if (item == null) {
            return null;
        } else {
            EvolutionVo vo = new EvolutionVo();
            vo.setReference(item.getReference());
            vo.setId(item.getId());
            vo.setNbrOeuf(NumberUtil.toStringI(item.getNbrOeuf()));
            vo.setSemaine(NumberUtil.toStringI(item.getSemaine()));
            vo.setPoid(NumberUtil.toStringD(item.getPoid()));
            vo.setImportationVo(new ImportConverter().toVo(item.getImportation()));
            return vo;
        }

    }

}
