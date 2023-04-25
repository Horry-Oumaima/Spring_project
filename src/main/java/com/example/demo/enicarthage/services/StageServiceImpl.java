package com.example.demo.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enicarthage.entities.Stage;
import com.example.demo.enicarthage.entities.Student;
import com.example.demo.enicarthage.repositories.StageRep;
import com.example.demo.enicarthage.repositories.StudentRepository;
@Service
public class StageServiceImpl implements StageService {

	
	
	
	
	@Autowired
	StageRep stg;

	@Override
	public Stage savestage(Stage s) {
		// TODO Auto-generated method stub
		return stg.save(s);
	}

	@Override
	public Stage updatestage(Stage st) {
		return stg.save(st);
	}

	@Override
	public void deletestage(Stage s) {
		stg.delete(s);
		
	}

	@Override
	public void deletestageById(Long id) {
		 stg.deleteById(id);
		
	}

	@Override
	public Stage getstage(Long id) {
		return stg.findById(id).get();
		
	}

	@Override
	public List<Stage> getAllstages() {
		return stg.findAll();
	}

}
