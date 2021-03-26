package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.model.Professor;

public interface IProfessorRepo extends JpaRepository<Professor, Integer> {

}
