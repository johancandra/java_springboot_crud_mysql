package com.spring.java_springboot_crud_mysql.controller;

import lombok.AllArgsConstructor;
import com.spring.java_springboot_crud_mysql.entity.Admin;
import com.spring.java_springboot_crud_mysql.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/admins")
public class AdminController {

    private AdminService adminService;

    @PostMapping
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin){
        Admin savedAdmin = adminService.createAdmin(admin);
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }

    // build get admin by id REST API
    // http://localhost:8080/api/admins/1
    @GetMapping("{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") Long adminId){
        Admin admin = adminService.getAdminById(adminId);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    // Build Get All admins REST API
    // http://localhost:8080/api/admins
    @GetMapping
    public ResponseEntity<List<Admin>> getAllAdmins(){
        List<Admin> admins = adminService.getAllAdmins();
        return new ResponseEntity<>(admins, HttpStatus.OK);
    }

    // Build Update admin REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/admins/1
    public ResponseEntity<Admin> updateAdmin(@PathVariable("id") Long adminId,
                                           @RequestBody Admin admin){
        admin.setId(adminId);
        Admin updatedAdmin= adminService.updateAdmin(admin);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }

    // Build Delete admin REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAdmin(@PathVariable("id") Long adminId){
        adminService.deleteAdmin(adminId);
        return new ResponseEntity<>("admin successfully deleted!", HttpStatus.OK);
    }
}
