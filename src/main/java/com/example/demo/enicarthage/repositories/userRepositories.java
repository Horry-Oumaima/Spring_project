package com.example.demo.enicarthage.repositories;

import com.example.demo.enicarthage.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepositories extends JpaRepository<user,Long> {
}
