/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.JenisKetidakhadiran;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Joki
 */
public interface JenisKetidakHadiranDao extends PagingAndSortingRepository<JenisKetidakhadiran, String>{
    
}
