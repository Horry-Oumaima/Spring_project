package com.example.demo.enicarthage.services;

import com.example.demo.enicarthage.entities.blogpost;

import java.util.List;

public interface blogpostService {
    blogpost saveblogpost(blogpost b);
    blogpost updateblogpost(blogpost b);
    void deleteblogpost(blogpost b);
    void deleteblogpostById(Long id);
    blogpost getblogpost(Long id);
    List<blogpost> getAllblogpost();

}
