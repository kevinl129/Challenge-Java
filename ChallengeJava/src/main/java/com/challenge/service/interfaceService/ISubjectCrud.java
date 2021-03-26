package com.challenge.service.interfaceService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.challenge.model.Subject;

@Repository
public interface ISubjectCrud extends CrudRepository<Subject, String>{

}
