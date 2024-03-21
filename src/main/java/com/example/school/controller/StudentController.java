package com.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.school.model.Student;
import com.example.school.service.StudentH2Service;

@RestController
public class StudentController {
  @Autowired
  private StudentH2Service studentService;

  @GetMapping("/students")
  public ArrayList<Student> getStudents() {
    return studentServices.getStudents();
  }

  @GetMapping("/students/{studentId}")
     public Student getStudentById@PathVariable("studentId")int studentId)
  {
    return studentServices.getStudentById(studentId);
  }
  @PostMapping("/students")
      public Student addStudent@RequestBody Student student)
  {
    return studentServices.addStudent(student);
  }

  @PostMapping("/students/bulk")
  public String addMultiplestudents(@RequestBody ArrayList<Student> studentsList) {
    return studentService.addMultipleStudents(studentsList);
  }

  @PostMapping("/students/{studentId}")
  public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
    return studentService.updatestudent(studentId, student);
  }

  @DeleteMapping("/students/{studentId}")
  public void deleteStudent(@PathVariable int studentId) {
    studentService.deleteStudent(studentId);
  }
}