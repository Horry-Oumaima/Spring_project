package com.example.demo.enicarthage.services;

import com.example.demo.enicarthage.entities.blogpost;
import com.example.demo.enicarthage.repositories.blogpostRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class blogpostServiceImpl implements blogpostService{
   @Autowired
     blogpostRepositories obj;
    @Override
    public blogpost saveblogpost(blogpost b) {


        return obj.save(b);
    }

    @Override
    public blogpost updateblogpost(blogpost b) {
        return obj.save(b);
    }

    @Override
    public void deleteblogpost(blogpost b) {
     obj.delete(b);
    }

    @Override
    public void deleteblogpostById(Long id) {
        obj.deleteById(id);
    }

    @Override
    public blogpost getblogpost(Long id) {
      return   obj.findById(id).get();
    }

    @Override
    public List<blogpost> getAllblogpost() {
        return obj.findAll();
    }

}
