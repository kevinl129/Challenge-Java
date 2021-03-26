package com.challenge.service.interfaceService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.challenge.model.Professor;

//Con esta interfaz heredamos las operaciones basicas para realizar un CRUD 
@Repository
public interface IProfessorCrud extends CrudRepository<Professor, Integer>{

}
