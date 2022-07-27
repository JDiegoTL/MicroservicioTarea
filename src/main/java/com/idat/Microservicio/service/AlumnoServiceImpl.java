package com.idat.Microservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Microservicio.model.Alumno;
import com.idat.Microservicio.repository.AlumnoRepository;



@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoRepository repository;

	
	@Override
	public List<Alumno> listar() {
		return repository.findAll();
	}

	@Override
	public Alumno obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Alumno alumno) {
		repository.save(alumno);

	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Alumno alumno) {
		repository.saveAndFlush(alumno);

	}

}
