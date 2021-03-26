package com.challenge.model;

import java.sql.Time;
import java.util.*;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "subject")
public class Subject {
    /*
	@Id
	@Column(name="Id")
	private int id;
	*/
	@Id
	@Column(name = "name_subject")
	private String nameSub;

	//revisar la parte del Time
	@Column(name = "start_time_subject")
	@Temporal(TemporalType.TIME)
	//@DateTimeFormat(pattern="hh:mm")
	private Date startTimeSub;
	
	@Column(name = "finish_time_subject")
	@Temporal(TemporalType.TIME)
	private Date finishTimeSub;

	@Column(name = "max_quantity", length = 50)
	private int maxQuantity;

	//Relaciones muchos a muchos
	@ManyToMany(mappedBy="subjectList")
	private List<Student> studentList;

	//Relaciones de muchos a uno
	@ManyToOne
	@JoinColumn(name = "fk_professor")
	private Professor professor;
	

	// Constructor, añadir el muchos a muchos
	

	public Subject() {
		super();
	}


	public Subject( String nameSub, Date startTimeSub, Date finishTimeSub, int maxQuantity,
			List<Student> studentList, Professor professor) {
		super();
		//this.id = id;
		this.nameSub = nameSub;
		this.startTimeSub = startTimeSub;
		this.finishTimeSub = finishTimeSub;
		//this.professorSub = professorSub;
		this.maxQuantity = maxQuantity;
		this.studentList = studentList;
		this.professor = professor;
	}


	// GETTERS AND SETTERS
	public String getNameSub() {
		return nameSub;
	}

	/*
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
    */

	public void setNameSub(String nameSub) {
		this.nameSub = nameSub;
	}

	/*
	public String getProfessorSub() {
		return professorSub;
	}

	public void setProfessorSub(String professorSub) {
		this.professorSub = professorSub;
	}
     */
     
	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Date getStartTimeSub() {
		return startTimeSub;
	}

	public void setStartTimeSub(Date startTimeSub) {
		this.startTimeSub = startTimeSub;
	}

	public Date getFinishTimeSub() {
		return finishTimeSub;
	}

	public void setFinishTimeSub(Date finishTimeSub) {
		this.finishTimeSub = finishTimeSub;
	}
	
	

}

