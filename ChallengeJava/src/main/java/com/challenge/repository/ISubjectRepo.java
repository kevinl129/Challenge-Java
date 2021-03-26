package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.model.Subject;

public interface ISubjectRepo extends JpaRepository<Subject, Integer>{

}
