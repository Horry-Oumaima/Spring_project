package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.enicarthage.entities.CatProject;
import com.example.demo.enicarthage.entities.project;
import com.example.demo.enicarthage.repositories.CategProjRep;
import com.example.demo.enicarthage.repositories.ProjectRep;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
    ProjectRep projDao;
    @Autowired
    RepositoryRestConfiguration restConfiguration;
    @Autowired
    CategProjRep categoryDao;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(project.class);
        restConfiguration.exposeIdsFor(CatProject.class);
       
        //Test l'insertion
        CatProject c1 =  new CatProject();
        CatProject c3=  new CatProject();
        CatProject c2 =  new CatProject();
        CatProject c4 =  new CatProject();
        c1.setDesignation("PFA");
        c2.setDesignation("PFE");
        c3.setDesignation("Stage d'été");
        c4.setDesignation("Doctorat");
        categoryDao.save(c1);
        categoryDao.save(c2);
        categoryDao.save(c3);
        categoryDao.save(c4);
       // projDao.save(new project(null, "recherche&developpement","developement en python des API REST","informatique",c3));
       // projDao.save(new project(null, "data science","création des models en AI", "infotronique",c1));
        //projDao.save(new project(null, "FullStack","developement en angular d'un site web","informatique",c2));
       // projDao.save(new project(null, "recherche&developpement","developement en python des API REST","informatique",c3));
        projDao.save(new project(null, "FullStack","developement en angular d'un site web","informatique",c2));


       
        projDao.findAll().forEach(p->{
            System.out.println(p.getDescription());
        });
         
    }

}
