package com.example.demo.enicarthage.Controllers;

import com.example.demo.enicarthage.entities.blogpost;
import com.example.demo.enicarthage.services.blogpostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class blogpostController {
    @Autowired
    private blogpostServiceImpl blogservice;

    @GetMapping("/all")
    public List<blogpost> getAllblogpost(){ return blogservice.getAllblogpost(); }
    @GetMapping("/all/{id}")
    public blogpost getblogpost(@PathVariable("id")Long id){ return blogservice.getblogpost(id) ;}
    @PostMapping ("/add")
    public blogpost saveblogpost(@RequestBody blogpost b){ return blogservice.saveblogpost(b);}
    @DeleteMapping("delete/{id}")
    public void deleteblogpostById(@PathVariable("id")Long id){  blogservice.deleteblogpostById(id);}
    @DeleteMapping("/delete")
    public void deleteblogpost( @RequestBody blogpost b) { blogservice.deleteblogpost(b);}
    @PutMapping("/update")
    public blogpost updateblogpost(blogpost b){return blogservice.updateblogpost(b);}
}
