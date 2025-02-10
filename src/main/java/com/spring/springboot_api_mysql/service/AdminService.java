package com.spring.java_springboot_crud_mysql.service;

import com.spring.java_springboot_crud_mysql.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin createAdmin(Admin admin);

    Admin getAdminById(Long adminId);

    List<Admin> getAllAdmins();

    Admin updateAdmin(Admin admin);

    void deleteAdmin(Long adminId);
}