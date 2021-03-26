package com.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.model.Professor;
import com.challenge.service.interfaceService.IProfessorCrud;
import com.challenge.service.interfaceService.IProfessorService;

@Service
public class ProfessorService implements IProfessorService{
	
	//Objeto del tipo IProfessorCrud
	@Autowired
	private IProfessorCrud dato;

	//Busca los datos y los devuelve en una lista 
	@Override
	public List<Professor> listarProfessor() {
		return (List<Professor>) dato.findAll();
	}

	@Override
	public int saveProf(Professor prof) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteProf(int idProf) {
		// TODO Auto-generated method stub
		
	}

}
