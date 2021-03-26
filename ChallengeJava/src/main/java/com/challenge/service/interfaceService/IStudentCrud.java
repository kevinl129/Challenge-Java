package com.challenge.service.interfaceService;

import org.springframework.data.repository.CrudRepository;

import com.challenge.model.Student;

public interface IStudentCrud extends CrudRepository<Student, Integer>{

}
