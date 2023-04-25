package com.example.demo.enicarthage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enicarthage.entities.Student;
import com.example.demo.enicarthage.entities.blogpost;
import com.example.demo.enicarthage.services.StudentserviceImpl;
import com.example.demo.enicarthage.services.blogpostServiceImpl;
@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
    private StudentserviceImpl stdservice;

    @GetMapping("/all")
    public List<Student> getAllblogpost(){ return stdservice.getAllstudents(); }
    @PostMapping ("/add")
    public Student savestudent(@RequestBody Student s ){ return stdservice.savestudent(s);}

}
