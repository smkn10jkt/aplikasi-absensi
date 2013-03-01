package com.artivisi.school.attendance.service;

import java.util.List;

import com.artivisi.school.attendance.domain.ApplicationConfig;
import com.artivisi.school.attendance.domain.JenisPeserta;
import com.artivisi.school.attendance.domain.Kehadiran;
import com.artivisi.school.attendance.domain.Menu;
import com.artivisi.school.attendance.domain.Permission;
import com.artivisi.school.attendance.domain.Role;
import com.artivisi.school.attendance.domain.Sms;
import com.artivisi.school.attendance.domain.User;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BelajarRestfulService extends MonitoredService {
	// konfigurasi aplikasi
	void save(ApplicationConfig ac);
	void delete(ApplicationConfig ac);
	ApplicationConfig findApplicationConfigById(String id);
    Page<ApplicationConfig> findAllApplicationConfigs(Pageable pageable);
	Long countAllApplicationConfigs();
	Long countApplicationConfigs(String search);
	Page<ApplicationConfig> findApplicationConfigs(String search, Pageable pageable);
        
    // menu
    void save(Menu m);
    void delete(Menu m);
    Menu findMenuById(String id);
    List<Menu> findTopLevelMenu();
    Page<Menu> findAllMenu(Pageable pageable);
    Long countAllMenu();
    List<Menu> findMenuByParent(Menu m);
    List<Menu> findMenuNotInRole(Role r);
    
    // permission
    void save(Permission m);
    void delete(Permission m);
    Permission findPermissionById(String id);
    Page<Permission> findAllPermissions(Pageable pageable);
    Long countAllPermissions();
    List<Permission> findPermissionsNotInRole(Role r);
    
    // role
    void save(Role role);
    void delete(Role role);
    Role findRoleById(String id);
    Page<Role> findAllRoles(Pageable pageable);
    Long countAllRoles();
    
    // user
    void save(User m);
    void delete(User m);
    User findUserById(String id);
    User findUserByUsername(String username);
    Page<User> findAllUsers(Pageable pageable);
    Long countAllUsers();
    
    //sms
    void save(Sms sms);
    void delete(Sms sms);
    Sms findSmsById(String id);
    Page<Sms> findAllSmss(Pageable pageable);
    Long countAllSms();
    
    // jenispeserta
    void  save(JenisPeserta jenis);
    void delete(JenisPeserta jenis);
    JenisPeserta findJenisPesertaById(String id);
    Page<JenisPeserta> findAllJenisPesertas(Pageable pageable);
    Long countAllJenisPeserta();
}