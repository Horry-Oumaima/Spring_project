package com.example.demo.enicarthage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enicarthage.entities.Stage;
import com.example.demo.enicarthage.entities.Student;
import com.example.demo.enicarthage.services.StageServiceImpl;
@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/stages")
public class StageController {
	
	@Autowired
    private StageServiceImpl stgservice;
	
	
	 @GetMapping("/all")
	    public List<Stage> getAllblogpost(){ return stgservice.getAllstages(); }
	    @PostMapping ("/add")
	    public Stage savestudent(@RequestBody Stage s ){ return stgservice.savestage(s);}

}
