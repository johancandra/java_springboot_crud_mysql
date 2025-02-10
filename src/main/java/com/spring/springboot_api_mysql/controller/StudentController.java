package com.spring.java_springboot_crud_mysql.controller;

import lombok.AllArgsConstructor;
import com.spring.java_springboot_crud_mysql.entity.Student;
import com.spring.java_springboot_crud_mysql.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/students")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student savedStudent = studentService.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // build get student by id REST API
    // http://localhost:8080/api/students/1
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId){
        Student student = studentService.getStudentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Build Get All Students REST API
    // http://localhost:8080/api/students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Build Update Student REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/students/1
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long studentId,
                                           @RequestBody Student student){
        student.setId(studentId);
        Student updatedStudent= studentService.updateStudent(student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    // Build Delete Student REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId){
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("student successfully deleted!", HttpStatus.OK);
    }
}
