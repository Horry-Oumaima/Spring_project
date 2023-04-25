package com.example.demo.enicarthage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.enicarthage.entities.project;

import jakarta.transaction.Transactional;



@RepositoryRestResource
@Transactional
@CrossOrigin("*") // permit d'accepter les requests
public interface ProjectRep extends JpaRepository<project, Long> {
	
	
	
	 // le nom de path de recherche
    @RestResource(path = "/designation")
    List<project> findByDescriptionContains(@Param("desc") String desc);

    @RestResource(path = "/pagination")
    Page<project> findByDescriptionContains(@Param("desc") String desc, Pageable pageable);
    @RestResource(path = "/byCategory")
    Page<project> findByCategory_Id(@Param("c") long c, Pageable pageable);

}
