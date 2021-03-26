package com.challenge.service.interfaceService;

import java.util.List;

import com.challenge.model.Subject;

public interface ISubjectService {

	public List<Subject> listarSubject();
	public int saveSubject(Subject sub);
	public void deleteSubject(int idSubject);
}
