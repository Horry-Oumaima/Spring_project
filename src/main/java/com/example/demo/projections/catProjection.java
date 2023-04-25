package com.example.demo.projections;



import org.springframework.data.rest.core.config.Projection;

import com.example.demo.enicarthage.entities.project;

@Projection(name = "p1", types = project.class)

public interface catProjection {
	 public String getDescription();
}
