package com.idat.Microservicio.service;

import java.util.List;

import com.idat.Microservicio.model.Aula;



public interface AulaService {

	void guardarAula(Aula aula);
	void eliminarAula(Integer id);
	void actualizarAula(Aula aula);
	List<Aula> listarAula();
	Aula obtenerAulaId(Integer id);
}
