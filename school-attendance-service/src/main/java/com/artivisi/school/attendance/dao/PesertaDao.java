/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.Peserta;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author DELL
 */
public interface PesertaDao extends PagingAndSortingRepository<Peserta, String> {

}
