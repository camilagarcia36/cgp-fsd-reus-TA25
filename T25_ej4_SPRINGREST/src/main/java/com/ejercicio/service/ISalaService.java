package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSala(); 

	public Sala guardarSala(Sala Sala);

	public Sala salaById(int id);

	public Sala actualizarSala(Sala Sala); 

	public void eliminarSala(int id);
}
