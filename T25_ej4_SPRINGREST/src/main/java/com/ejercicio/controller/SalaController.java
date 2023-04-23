package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.dto.Sala;
import com.ejercicio.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;

	@GetMapping("/sala")
	public List<Sala> listarSala() {
		return salaServiceImpl.listarSala();
	}
	
	@PutMapping("/Sala/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") int id, @RequestBody Sala sala) {

		Sala sala_seleccionado = new Sala();
		Sala sala_actualizado = new Sala();
		sala_seleccionado = salaServiceImpl.salaById(id);
		sala_seleccionado.setPelicula(sala.getPelicula()); 
		sala_seleccionado.setNombre(sala.getNombre()); 

		sala_actualizado = salaServiceImpl.actualizarSala(sala_seleccionado);
		System.out.println("La sala  actualizado es: " + sala_actualizado);
		return sala_actualizado;
	}

}
