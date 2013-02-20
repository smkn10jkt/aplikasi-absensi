/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.JenisPeserta;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author DELL
 */
public interface JenisPesertaDao extends PagingAndSortingRepository<JenisPeserta, String> {
    
}
