package com.example.demo.enicarthage.services;


import com.example.demo.enicarthage.entities.user;

import java.util.List;

public interface userService {
    user saveuser(user b);
    user updateuser(user b);
    void deleteuser(user b);
    void deleteuserById(Long id);
    user getuser(Long id);
    List<user> getAlluser();
}
