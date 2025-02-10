package com.spring.java_springboot_crud_mysql.service.impl;

import lombok.AllArgsConstructor;
import com.spring.java_springboot_crud_mysql.entity.Student;
import com.spring.java_springboot_crud_mysql.repository.StudentRepository;
import com.spring.java_springboot_crud_mysql.service.StudentService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        return optionalStudent.get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId()).get();
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        Student updatedStudent = studentRepository.save(existingStudent);
        return updatedStudent;
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
