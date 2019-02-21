/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.rest.converter;

import com.poussin.Import.bean.Fournisseur;
import com.poussin.Import.rest.vo.FournisseurVo;

/**
 *
 * @author DELL
 */
public class FournisseurConverter extends AbstractConverter<Fournisseur, FournisseurVo> {

    @Override
    public Fournisseur toItem(FournisseurVo vo) {
        if (vo == null) {
            return null;
        } else {
            Fournisseur item = new Fournisseur();
            item.setId(vo.getId());
            item.setNom(vo.getNom());
            item.setPrenom(vo.getPrenom());
            item.setAdresse(vo.getAdresse());
            item.setNumTel(vo.getNumTel());
            return item;
        }
    }

    @Override
    public FournisseurVo toVo(Fournisseur item) {
        if (item == null) {
            return null;
        } else {
            FournisseurVo vo = new FournisseurVo();
            vo.setId(item.getId());
            vo.setNom(vo.getNom());
            vo.setPrenom(item.getPrenom());
            vo.setAdresse(item.getAdresse());
            vo.setNumTel(item.getNumTel());
            return vo;
        }
    }

}
