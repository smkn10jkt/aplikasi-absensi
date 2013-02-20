/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.service;

import com.artivisi.school.attendance.domain.JamKerja;
import com.artivisi.school.attendance.domain.Kehadiran;
import com.artivisi.school.attendance.domain.Ketidakhadiran;
import com.artivisi.school.attendance.domain.Peserta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author DELL
 */
public interface AbsensiService {
    void save(Peserta p);
    void delete(Peserta p);
    Peserta findPesertaById(String id);
    Page<Peserta> findAllPeserta(PageRequest pagination);
    Page<Peserta> findPesertaByJamKerja(JamKerja j, PageRequest pagination);
    Page<Peserta> findPesertaByKehadiran(Kehadiran h, PageRequest pagination);
    Page<Peserta> findPesertaByKetidakhadiran(Ketidakhadiran t, PageRequest pagination);
    
}
