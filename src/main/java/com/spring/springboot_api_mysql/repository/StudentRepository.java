package com.spring.java_springboot_crud_mysql.repository;

import com.spring.java_springboot_crud_mysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
