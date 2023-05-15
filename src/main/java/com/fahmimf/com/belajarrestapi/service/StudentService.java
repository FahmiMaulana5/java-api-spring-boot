package com.fahmimf.com.belajarrestapi.service;

import java.util.List;
import java.util.Optional;

import com.fahmimf.com.belajarrestapi.entity.Student;

public interface StudentService {
    public void addStudent(Student student);
    public List<Student> getAllStudent();
    public Optional<Student> getStudentById(Long id);
    public void updateFullName(String fullName, Long id);
    public void deleteStudentById(Long id);
}
