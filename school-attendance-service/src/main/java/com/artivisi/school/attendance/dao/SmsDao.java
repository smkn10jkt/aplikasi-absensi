package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.Sms;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SmsDao extends PagingAndSortingRepository<Sms, String> {

}
