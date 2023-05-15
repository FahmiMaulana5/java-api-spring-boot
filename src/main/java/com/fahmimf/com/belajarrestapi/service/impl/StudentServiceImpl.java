package com.fahmimf.com.belajarrestapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fahmimf.com.belajarrestapi.entity.Student;
import com.fahmimf.com.belajarrestapi.repository.StudentRepository;
import com.fahmimf.com.belajarrestapi.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
       return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student;
    }

    @Override
    public void updateFullName(String fullName, Long id) {
        studentRepository.updateFullName(fullName, id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    
    
}
