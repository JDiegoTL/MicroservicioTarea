package com.idat.Microservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.Microservicio.model.Aula;
import com.idat.Microservicio.service.AulaService;



@Controller
@RequestMapping("/api/aula/v1")
public class AulaController {

	@Autowired
	private AulaService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAula(@RequestBody Aula aula) {
		service.guardarAula(aula);
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Aula> listar(){
		return service.listarAula();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Aula obtener(@PathVariable Integer id) {
		return service.obtenerAulaId(id);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Aula aula) {
		service.actualizarAula(aula);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminarAula(id);
	}
}
