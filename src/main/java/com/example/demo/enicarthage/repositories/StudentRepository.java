package com.example.demo.enicarthage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enicarthage.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
