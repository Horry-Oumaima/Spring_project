package com.example.demo.enicarthage.services;

import java.util.List;

import com.example.demo.enicarthage.entities.Stage;
import com.example.demo.enicarthage.entities.Student;

public interface StageService {
	
	
	
	Stage savestage(Stage s);

	Stage updatestage(Stage st);

	void deletestage(Stage s);

	void deletestageById(Long id);

	Stage getstage(Long id);

	List<Stage> getAllstages();
    
}
