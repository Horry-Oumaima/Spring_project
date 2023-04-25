package com.example.demo.enicarthage.Controllers;


import com.example.demo.enicarthage.entities.blogpost;
import com.example.demo.enicarthage.entities.user;
import com.example.demo.enicarthage.services.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userServiceImpl userservice;

    @GetMapping("/all")
    public List<user> getAlluser(){ return userservice.getAlluser(); }
    @GetMapping("/all/{id}")
    public user getuser(@PathVariable("id")Long id){ return userservice.getuser(id) ;}
    @PostMapping("/add")
    public user saveuser(@RequestBody user b){ return userservice.saveuser(b);}
}
