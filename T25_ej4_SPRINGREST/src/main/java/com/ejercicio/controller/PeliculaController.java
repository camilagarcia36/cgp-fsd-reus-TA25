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

import com.ejercicio.dto.Pelicula;
import com.ejercicio.service.PeliculaServiceImpl;


@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	@GetMapping("/Pelicula")
	public List<Pelicula> listarPelicula() {
		return peliculaServiceImpl.listarPeli();
	}

	@PostMapping("/Pelicula")
	public Pelicula guardarPeli(@RequestBody Pelicula Pelicula) {
		return peliculaServiceImpl.guardarPeli(Pelicula);
	}

	@GetMapping("/Pelicula/{id}")
	public Pelicula peliById(@PathVariable(name = "id") int id) {
		Pelicula Pelicula = new Pelicula();
		Pelicula = peliculaServiceImpl.peliById(id);
		System.out.println("Fabricante By ID: " + Pelicula);
		return Pelicula;
	}

	@PutMapping("/Pelicula/{id}")
	public Pelicula actualizarPeli(@PathVariable(name = "id") int id, @RequestBody Pelicula Pelicula) {

		Pelicula Pelicula_seleccionado = new Pelicula();
		Pelicula Pelicula_actualizado = new Pelicula();
		Pelicula_seleccionado = peliculaServiceImpl.peliById(id);
		Pelicula_seleccionado.setNombre(Pelicula.getNombre()); 
		Pelicula_seleccionado.setCalificacion(Pelicula.getCalificacion()); 

		Pelicula_actualizado = peliculaServiceImpl.actualizarPeli(Pelicula_seleccionado);
		System.out.println("El cliente actualizado es: " + Pelicula_actualizado);
		return Pelicula_actualizado;
	}

	@DeleteMapping("/Pelicula/{id}")
	public void eliminarPeli(@PathVariable(name = "id") int id) {
		peliculaServiceImpl.eliminarPeli(id);
	}
}
