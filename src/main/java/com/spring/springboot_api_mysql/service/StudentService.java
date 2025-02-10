package com.spring.java_springboot_crud_mysql.service;

import com.spring.java_springboot_crud_mysql.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    Student getStudentById(Long studentId);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Long studentId);
}