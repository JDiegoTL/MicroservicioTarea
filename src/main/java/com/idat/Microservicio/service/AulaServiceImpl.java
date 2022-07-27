package com.idat.Microservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Microservicio.model.Aula;
import com.idat.Microservicio.repository.AulaRepository;



@Service
public class AulaServiceImpl implements AulaService {

	@Autowired
	private AulaRepository repository;
	
	@Override
	public void guardarAula(Aula aula) {
		repository.save(aula);
	}

	@Override
	public void eliminarAula(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizarAula(Aula aula) {
		repository.saveAndFlush(aula);
	}

	@Override
	public List<Aula> listarAula() {
		
		return repository.findAll();
	}

	@Override
	public Aula obtenerAulaId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
