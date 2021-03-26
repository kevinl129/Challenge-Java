package com.challenge.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.challenge.model.Professor;
import com.challenge.model.Subject;
import com.challenge.service.interfaceService.IProfessorCrud;
import com.challenge.service.interfaceService.IProfessorService;
import com.challenge.service.interfaceService.ISubjectCrud;

@Controller
@RequestMapping
//ESTE EN REALIDAD ES CONTROLLER ADMINISTRADOR
public class ControllerAdministrator {

	/*
	@Autowired
	private IProfessorService servicioProf;
	*/
	
	@GetMapping("/inicio-administrador")
	public String menuAdministrador() {
		return "inicioAdmin";
	}
	
	@Autowired
	private IProfessorCrud servicioProf;
	
	@Autowired
	private ISubjectCrud servicioSubj;
	
	//LISTAR Profesores
	@GetMapping("/listar-profesores")
	public String listar(Model model) {
		
		//List<Professor> listaProf=servicioProf.listarProfessor();
		List<Professor>listaProf= (List<Professor>) servicioProf.findAll();
		model.addAttribute("listaProfesores", listaProf);
		return "gestionProfesores";
	}
	
	//LISTAR Materias
	@GetMapping("/listar-materias")
	public String listarMaterias(Model model) {
		List<Subject> listaSubj=(List<Subject>) servicioSubj.findAll();
		model.addAttribute("listaMaterias", listaSubj);
	return "gestionMaterias";	
	}
	
	//AGREGAR NUEVO Materia
	@GetMapping("/nueva-materia")
	public String nuevaMateria(Model model) {
		List<Professor> listaProf=(List<Professor>) servicioProf.findAll();
		model.addAttribute("listaProfesores", listaProf);
		model.addAttribute("materia", new Subject());
		return "moduloMateria";
	}
	
	@PostMapping("/guardar-materia")
	public String guardarMateria(Subject sb, Model model) {
		servicioSubj.save(sb);
		return "redirect:/listar-materias";
	}
	
	//AGREGAR NUEVO Profesor
	@GetMapping("/nuevo-profesor")
	public String nuevoProfesor(Model model) {
		List<String> estado= new ArrayList<String>();
		estado.add("Activo");
		estado.add("No activo");
		model.addAttribute("profesor", new Professor());
		model.addAttribute("listaEstados", estado);
		return "moduloProfesor";
	}
	
	@PostMapping("/guardar-profesor")
	public String guardarProfesor(Professor profe, Model model) {
		servicioProf.save(profe);
		return "redirect:/listar-profesores";
	}
	
	//EDITAR Profesor
		@GetMapping("/editar-profesor/{dniProf}")
		public String editarProfesor(@PathVariable int dniProf, Model model) {
			List<String> estado= new ArrayList<String>();
			estado.add("Activo");
			estado.add("No activo");
			model.addAttribute("listaEstados", estado);
			model.addAttribute("profesor", servicioProf.findById(dniProf));
			return "moduloProfesor";
		}
		//editar materia
		//...
		
		//ELIMINAR Profesor
		@GetMapping("/eliminar-profesor/{dniProf}")
		public String eliminarPorfesor(@PathVariable int dniProf, Model model) {
		servicioProf.deleteById(dniProf);
			return "redirect:/listar-profesores";
		}
}
