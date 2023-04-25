package com.example.demo.enicarthage.repositories;

import com.example.demo.enicarthage.entities.entreprise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface entrepriseRepository extends JpaRepository<entreprise,Long> {
}
