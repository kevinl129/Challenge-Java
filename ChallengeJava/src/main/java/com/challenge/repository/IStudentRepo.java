package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
