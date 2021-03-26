package com.challenge.service.interfaceService;

import java.util.List;

import com.challenge.model.Professor;

public interface IProfessorService {

	public List<Professor>listarProfessor();
	public int saveProf(Professor prof);
	public void deleteProf(int idProf);
}
