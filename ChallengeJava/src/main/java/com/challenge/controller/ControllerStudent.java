package com.challenge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.challenge.model.Student;
import com.challenge.model.Subject;
import com.challenge.service.interfaceService.IStudentCrud;
import com.challenge.service.interfaceService.ISubjectCrud;

@Controller
public class ControllerStudent {
	
	@Autowired
	private ISubjectCrud serviceSubj;
	@Autowired
	private IStudentCrud serviceStudent;
	
	@GetMapping("/listar-materias-alumno/{idAlumno}")
	public String listaMateriasAlumnoId(@PathVariable int idAlumno ,Model model) {
		Optional<Student> alumnoSubjOP=serviceStudent.findById(idAlumno);
		Student alumnoSubj=alumnoSubjOP.get();
		//model.addAttribute("idAlum",idAlumno);
		model.addAttribute("listaMateriasAlum",alumnoSubj.getSubjectList() );
		return "inicioEstudiante";
	}
	
	
	/*
	@GetMapping("/listar-materias-alumno")
	public String listarMateriasAlumno(Model model) {
		List<Subject> listaMaterias=(List<Subject>) serviceSubj.findAll();
		model.addAttribute("listaMaterias",listaMaterias );
		
		return "verMaterias";
	}
	*/
	//LISTAR Materias
	@GetMapping("/listar-materias-inscripcion")
	public String listarMaterias(Model model) {
		List<Subject> listaSubj=(List<Subject>) serviceSubj.findAll();
		//como hago para volver al inicio estudiante 
		model.addAttribute("listaMaterias", listaSubj);
	return "verMaterias";	
	}
	
	//Inscribirse materia
	@GetMapping("/inscribirse-materia/{nombreMateria}")
	public String inscribirseMateria() {
		return null;
	}

}
