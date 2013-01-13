package com.artivisi.school.attendance.dao;

import com.artivisi.school.attendance.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, String> {
	User findByUsername(String username);
}
