package com.example.demo.enicarthage.services;


import com.example.demo.enicarthage.entities.user;
import com.example.demo.enicarthage.repositories.userRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Autowired
    userRepositories obj_u ;
    @Override
    public user saveuser(user b) {


        return obj_u.save(b);
    }

    @Override
    public user updateuser(user b) {
        return obj_u.save(b);
    }
    @Override
    public void deleteuser(user b) {
        obj_u.delete(b);
    }
    @Override
    public void deleteuserById(Long id) {
        obj_u.deleteById(id);
    }

    @Override
    public user getuser(Long id) {
        return   obj_u.findById(id).get();
    }

    @Override
    public List<user> getAlluser() {
        return obj_u.findAll();
    }
}
