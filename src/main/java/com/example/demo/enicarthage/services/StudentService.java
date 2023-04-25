package com.example.demo.enicarthage.services;

import java.util.List;

import com.example.demo.enicarthage.entities.Student;

public interface StudentService {
	
	
	Student savestudent(Student s);
	Student updatestudent(Student s);
    void deletestudent(Student s);
    void deletestudentById(Long id);
    Student getstudent(Long id);
    List<Student> getAllstudents();

}
