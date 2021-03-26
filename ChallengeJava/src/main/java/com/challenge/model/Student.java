package com.challenge.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "dni_student")
	private int dniStudent;

	@Column(name = "leg_student", length = 50)
	private int legStudent;

	// creamos la relacion de muchos a muchos entre estudiantes y materias
	//un estudiante puede tener varias materias y una materia puede tener varios estudiantes
	// definimos el JoinTable, es la tabla intermedia entre estudiantes y materia
	@ManyToMany
	@JoinTable(name = "student_subject", 
	       joinColumns = @JoinColumn(name = "FK_student_dni"), 
	       inverseJoinColumns = @JoinColumn(name = "FK_subject_id"))
	private List<Subject> subjectList;

	// Constructores
	public Student(int dniStudent, int legStudent, List<Subject> subjectList) {
		super();
		this.dniStudent = dniStudent;
		this.legStudent = legStudent;
		this.subjectList = subjectList;
	}

	public Student() {
		super();
	}

	// GETTERS AND SETTERS
	public int getDniStudent() {
		return dniStudent;
	}

	public void setDniStudent(int dniStudent) {
		this.dniStudent = dniStudent;
	}

	public int getLegStudent() {
		return legStudent;
	}

	public void setLegStudent(int legStudent) {
		this.legStudent = legStudent;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}
