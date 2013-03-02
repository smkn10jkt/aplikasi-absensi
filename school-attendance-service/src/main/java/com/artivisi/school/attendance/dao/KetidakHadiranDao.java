/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.Ketidakhadiran;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Joki
 */
public interface KetidakHadiranDao extends PagingAndSortingRepository<Ketidakhadiran, String> {
    
}
