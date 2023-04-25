package com.example.demo.enicarthage.entities;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CatProject {
	@Id @GeneratedValue
	 private long id;
    private String designation;
    @OneToMany(mappedBy = "category")
    private Collection<project>  projets;
}
