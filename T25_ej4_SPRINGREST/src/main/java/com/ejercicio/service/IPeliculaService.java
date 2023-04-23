package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Pelicula;

public interface IPeliculaService {


	public List<Pelicula> listarPeli(); 

	public Pelicula guardarPeli(Pelicula pelicula);

	public Pelicula peliById(int id);

	public Pelicula actualizarPeli(Pelicula peli); 

	public void eliminarPeli(int id);
}
