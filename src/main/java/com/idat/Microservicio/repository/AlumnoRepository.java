package com.idat.Microservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Microservicio.model.Alumno;



@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
