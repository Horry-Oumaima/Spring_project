package com.example.demo.enicarthage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "T_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idStudent;
	private String nomStudent;
	private String prenomStudent;
	private String mailStudent;
	
	
	
	
	
	
	public Student() {
		super();
		
	}
	
	public long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(long idStudent) {
		this.idStudent = idStudent;
	}
	public String getNomStudent() {
		return nomStudent;
	}
	public void setNomStudent(String nomStudent) {
		this.nomStudent = nomStudent;
	}
	
	
	public String getPrenomStudent() {
		return prenomStudent;
	}

	public void setPrenomStudent(String prenomStudent) {
		this.prenomStudent = prenomStudent;
	}

	public String getMailStudent() {
		return mailStudent;
	}

	public void setMailStudent(String mailStudent) {
		this.mailStudent = mailStudent;
	}

	public Student(String nomStudent, String prenomStudent, String mailStudent) {
		super();
		this.nomStudent = nomStudent;
		this.prenomStudent = prenomStudent;
		this.mailStudent = mailStudent;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nomStudent=" + nomStudent + ", prenomStudent=" + prenomStudent
				+ ", mailStudent=" + mailStudent + "]";
	}
	
	
	
}