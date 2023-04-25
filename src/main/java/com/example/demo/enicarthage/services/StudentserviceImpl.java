package com.example.demo.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enicarthage.entities.Student;
import com.example.demo.enicarthage.repositories.StudentRepository;



@Service
public class StudentserviceImpl implements StudentService {
	@Autowired
	StudentRepository stdrep;

	@Override
	public Student savestudent(Student s) {
		// TODO Auto-generated method stub
		return stdrep.save(s);
	}

	@Override
	public Student updatestudent(Student s) {
		return stdrep.save(s);
	}

	@Override
	public void deletestudent(Student s) {
		stdrep.delete(s);
		
	}

	@Override
	public void deletestudentById(Long id) {
		 stdrep.deleteById(id);
		
	}

	@Override
	public Student getstudent(Long id) {
		return stdrep.findById(id).get();
		
	}

	@Override
	public List<Student> getAllstudents() {
		return stdrep.findAll();
	}

}
