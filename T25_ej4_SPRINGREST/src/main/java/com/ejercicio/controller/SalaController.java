package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/Sala")
	public List<Sala> listarSala() {
		return salaServiceImpl.listarSala();
	}
	

	@PostMapping("/Sala")
	public Sala guardarSala(@RequestBody Sala Sala) {
		return salaServiceImpl.guardarSala(Sala);
	}

	@GetMapping("/Sala/{id}")
	public Sala salaById(@PathVariable(name = "id") int id) {
		Sala Sala = new Sala();
		Sala = salaServiceImpl.salaById(id);
		System.out.println("Fabricante By ID: " + Sala);
		return Sala;
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
	
	@DeleteMapping("/Sala/{id}")
	public void eliminarPeli(@PathVariable(name = "id") int id) {
		salaServiceImpl.eliminarSala(id);
	}

}
