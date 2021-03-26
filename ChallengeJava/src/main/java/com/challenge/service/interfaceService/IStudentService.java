package com.challenge.service.interfaceService;

import java.util.List;

import com.challenge.model.Student;

public interface IStudentService {

	public List<Student>listarStudent();
	public int saveStudent(Student student);
	public void deleteStudent(int idStudent);
}
