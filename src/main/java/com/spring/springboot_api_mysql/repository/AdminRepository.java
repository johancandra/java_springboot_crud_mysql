package com.spring.java_springboot_crud_mysql.repository;

import com.spring.java_springboot_crud_mysql.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
