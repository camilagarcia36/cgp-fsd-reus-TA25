package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IPeliculaDAO;
import com.ejercicio.dto.Pelicula;

@Service

public class PeliculaServiceImpl implements IPeliculaService{
	@Autowired

	IPeliculaDAO iPeliculaDAO; 
	
	@Override
	public List<Pelicula> listarPeli() {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPeli(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliById(int id) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPeli(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPeli(int id) {
		// TODO Auto-generated method stub
		iPeliculaDAO.deleteById(id);

	}
	
	
	

}
