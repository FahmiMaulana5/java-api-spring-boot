package com.fahmimf.com.belajarrestapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fahmimf.com.belajarrestapi.entity.Student;
import com.fahmimf.com.belajarrestapi.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    //Post/Add
    @PostMapping
    public ResponseEntity addStudent(@RequestBody Student student){
        studentService.addStudent(student);

        return ResponseEntity.ok(HttpStatus.OK);
    }
    
    //Get
    @GetMapping
    public ResponseEntity getAllStudent(){
        List<Student> students = studentService.getAllStudent();

        return ResponseEntity.ok(students);
    }

    //Get by id
    @GetMapping
    @RequestMapping("/detail")
    public ResponseEntity getStudentById(@RequestParam Long id){
        Optional<Student> student = studentService.getStudentById(id);

        return ResponseEntity.ok(student);
    }

    //PUt
    @PutMapping
    public ResponseEntity updateFullName(@RequestParam Long id, @RequestBody Student student){
        studentService.updateFullName(student.getFullName(), id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //delete
    @DeleteMapping
    public ResponseEntity deleteStudent(@RequestParam Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
