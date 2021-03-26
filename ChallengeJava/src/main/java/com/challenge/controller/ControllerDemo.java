package com.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.challenge.model.Professor;
import com.challenge.repository.IProfessorRepo;

@Controller
public class ControllerDemo {

	@Autowired
	private IProfessorRepo repo;

	@GetMapping("/greeting")
	public String verBootstrap() {		
		
		Professor professor = new Professor();
	
		professor.setDniProf(41825459);
		professor.setNameProf("Kevin");
		professor.setSurnameProf("Cazon");
		professor.setActiveProf("activo");

		repo.save(professor);
		return "index";
	}

}




