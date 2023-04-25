package com.example.demo.enicarthage.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.enicarthage.entities.CatProject;

import jakarta.transaction.Transactional;



@Transactional
@RepositoryRestResource
@CrossOrigin("*") // permit d'accepter les requests

public interface CategProjRep extends JpaRepository<CatProject,Long> {

}
