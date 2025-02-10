package com.spring.java_springboot_crud_mysql.service.impl;

import lombok.AllArgsConstructor;
import com.spring.java_springboot_crud_mysql.entity.Admin;
import com.spring.java_springboot_crud_mysql.repository.AdminRepository;
import com.spring.java_springboot_crud_mysql.service.AdminService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(Long adminId) {
        Optional<Admin> optionalAdmin = adminRepository.findById(adminId);
        return optionalAdmin.get();
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        Admin existingAdmin = adminRepository.findById(admin.getId()).get();
        existingAdmin.setUser(admin.getUser());
        existingAdmin.setPassword(admin.getPassword());
        Admin updatedAdmin = adminRepository.save(existingAdmin);
        return updatedAdmin;
    }

    @Override
    public void deleteAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
    }
}
