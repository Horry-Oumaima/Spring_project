package com.example.demo.enicarthage.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_stage")
public class Stage {

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idStage;
	private String nomStudent;
	private String prenomStudent;
	private String mailStudent;
	private String mailEncadrant;
	private String sujet;
	private String entreprise;
	private String duree;
	private String date_debut;
	private String feedback;
	public long getIdStage() {
		return idStage;
	}
	public void setIdStage(long idStage) {
		this.idStage = idStage;
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
	public String getMailEncadrant() {
		return mailEncadrant;
	}
	public void setMailEncadrant(String mailEncadrant) {
		this.mailEncadrant = mailEncadrant;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		entreprise = entreprise;
	}
	public String getDurée() {
		return duree;
	}
	public void setDurée(String durée) {
		this.duree = durée;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Stage(String nomStudent, String prenomStudent, String mailStudent, String mailEncadrant, String sujet,
			String entreprise, String durée, String date_debut, String feedback) {
		super();
		this.nomStudent = nomStudent;
		this.prenomStudent = prenomStudent;
		this.mailStudent = mailStudent;
		this.mailEncadrant = mailEncadrant;
		this.sujet = sujet;
		entreprise = entreprise;
		this.duree = durée;
		this.date_debut = date_debut;
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Stage [idStage=" + idStage + ", nomStudent=" + nomStudent + ", prenomStudent=" + prenomStudent
				+ ", mailStudent=" + mailStudent + ", mailEncadrant=" + mailEncadrant + ", sujet=" + sujet
				+ ", Entreprise=" + entreprise + ", durée=" + duree + ", date_debut=" + date_debut + ", feedback="
				+ feedback + "]";
	}
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
