package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;

import com.example.demo.enicarthage.entities.Stage;
import com.example.demo.enicarthage.entities.Student;
import com.example.demo.enicarthage.entities.blogpost;
import com.example.demo.enicarthage.entities.prof;
import com.example.demo.enicarthage.entities.user;
import com.example.demo.enicarthage.repositories.StageRep;
import com.example.demo.enicarthage.repositories.StudentRepository;
import com.example.demo.enicarthage.repositories.blogpostRepositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
@Autowired
 private blogpostRepositories obj ;

    @Test
    public void test_blogpost(){


    }
    
    @Autowired
    private StageRep str ;
    @Test
    public void TestcreateStage() {
    	    	
    	Stage s =new Stage("nes","ness","ness@gamail.com","baha boulabiar","dev","neapolis","deux mois","01/06/2022","une bonne expérience");
    	str.save(s);

    }
    @Test
    public void testFindblogpost(){
        blogpost blog =obj.findById(1L).get();
        System.out.println(blog);
    }
    @Test
    public void testupdate(){
        blogpost blog =obj.findById(1L).get();

        obj.save(blog);
        System.out.println(blog);

    }
    @Test
    public void testfindall(){
        List<blogpost> blogs =obj.findAll();
        for(blogpost b:blogs)
            System.out.println(b);
    }
    
    @Autowired
    private StudentRepository studentrep;
    @Test
    public void TestcreateStudent() {
    	Student s = new Student ("ness","nasnous","nes@gmail.com",1);
    	studentrep.save(s);
    }
    
    @Test
    public void TestfindStudent() {
    	Student st = studentrep.findById(1L).get();
    	System.out.println(st);
    }
    
    @Test
    public void TestupdateStudent() {
    	Student st = studentrep.findById(1L).get();
    	st.setMailStudent("kharraf@gmail.Com");
    	studentrep.save(st);
    	System.out.println(st);
    }
    
    @Test
    public void TestdeleteStudent() {
     studentrep.deleteById(1L);
    	
    }


    @Test
    public void TestfindAllStudenst() {
    	List<Student> students=studentrep.findAll();
    	for (Student s:students)
    		System.out.println(s);
    
    }
}
