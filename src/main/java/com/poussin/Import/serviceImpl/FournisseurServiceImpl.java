/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.serviceImpl;

import com.poussin.Import.bean.Fournisseur;
import com.poussin.Import.dao.FournisseurDao;
import com.poussin.Import.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */

@Service
public class FournisseurServiceImpl implements FournisseurService{
@Autowired
private FournisseurDao fournisseurDao;

    public FournisseurDao getFournisseurDao() {
        return fournisseurDao;
    }

    public void setFournisseurDao(FournisseurDao fournisseurDao) {
        this.fournisseurDao = fournisseurDao;
    }
    @Override
    public int creer(Fournisseur fournisseur) {
        fournisseurDao.save(fournisseur);
        return 1;
   
}
}
