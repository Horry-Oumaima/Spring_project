package com.example.demo.enicarthage.repositories;

import com.example.demo.enicarthage.entities.field;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fieldRepositories extends JpaRepository<field,Long> {
}
