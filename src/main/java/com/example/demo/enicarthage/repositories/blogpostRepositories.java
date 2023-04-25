package com.example.demo.enicarthage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.enicarthage.entities.blogpost;
@Repository
public interface blogpostRepositories extends JpaRepository<blogpost ,Long > {
}
