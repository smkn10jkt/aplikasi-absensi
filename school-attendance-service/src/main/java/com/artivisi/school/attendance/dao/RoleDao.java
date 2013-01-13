package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleDao extends PagingAndSortingRepository<Role, String> {
}