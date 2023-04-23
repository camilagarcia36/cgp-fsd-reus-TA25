package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.dto.Pelicula;
import com.ejercicio.service.PeliculaServiceImpl;


@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	@GetMapping("/pelicula")
	public List<Pelicula> listarPelicula() {
		return peliculaServiceImpl.listarPeli();
	}

}
