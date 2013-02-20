/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.service.impl;

import com.artivisi.school.attendance.dao.PesertaDao;
import com.artivisi.school.attendance.domain.JamKerja;
import com.artivisi.school.attendance.domain.Kehadiran;
import com.artivisi.school.attendance.domain.Ketidakhadiran;
import com.artivisi.school.attendance.domain.Peserta;
import com.artivisi.school.attendance.service.AbsensiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Service
@Transactional
public class AbsensiServiceImpl implements AbsensiService {

    @Autowired private PesertaDao pesertaDao;
    
    @Override
    public void save(Peserta p) {
        pesertaDao.save(p);
    }

    @Override
    public void delete(Peserta p) {
        pesertaDao.delete(p);
    }

    @Override
    public Peserta findPesertaById(String id) {
        if(id == null || id.trim().length() < 1)
        {
            return null;
        }
        return pesertaDao.findOne(id);
    }

    @Override
    public Page<Peserta> findAllPeserta(PageRequest pagination) {
        return pesertaDao.findAll(pagination);
    }

    @Override
    public Page<Peserta> findPesertaByJamKerja(JamKerja j, PageRequest pagination) {
       
    }

    @Override
    public Page<Peserta> findPesertaByKehadiran(Kehadiran h, PageRequest pagination) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Page<Peserta> findPesertaByKetidakhadiran(Ketidakhadiran t, PageRequest pagination) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
