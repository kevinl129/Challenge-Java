package com.challenge.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "professor")
public class Professor {

	@Id
	@Column(name = "dni_prof")
	private int dniProf;

	@Column(name = "name_prof", length = 50)
	private String nameProf;

	@Column(name = "surname_prof", length = 50)
	private String surnameProf;

	@Column(name = "active_prof", length = 50)
	private String activeProf;

	// Relacion uno a muchos, un profesor puede tener varias materias a su cargo
	@OneToMany(mappedBy = "professor")
	// @JoinColumn(name="FK_subject")
	private List<Subject> profSubjectList;

	public Professor(int dniProf, String nameProf, String surnameProf, String activeProf) {
		super();
		this.dniProf = dniProf;
		this.nameProf = nameProf;
		this.surnameProf = surnameProf;
		this.activeProf = activeProf;
		// this.profSubjectList=profSubjectList;
	}

	public Professor() {
		super();
	}

	// GETTERS AND SETTERS
	public int getDniProf() {
		return dniProf;
	}

	public void setDniProf(int dniProf) {
		this.dniProf = dniProf;
	}

	public String getNameProf() {
		return nameProf;
	}

	public void setNameProf(String nameProf) {
		this.nameProf = nameProf;
	}

	public String getSurnameProf() {
		return surnameProf;
	}

	public void setSurnameProf(String surnameProf) {
		this.surnameProf = surnameProf;
	}

	public String getActiveProf() {
		return activeProf;
	}

	public void setActiveProf(String activeProf) {
		this.activeProf = activeProf;
	}

	public List<Subject> getProfSubjectList() {
		return profSubjectList;
	}

	public void setProfSubjectList(List<Subject> profSubjectList) {
		this.profSubjectList = profSubjectList;
	}

}

