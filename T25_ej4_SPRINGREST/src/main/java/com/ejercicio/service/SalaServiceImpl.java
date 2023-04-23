package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.ISalaDAO;
import com.ejercicio.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired

	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSala() {
		// TODO Auto-generated method stub
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala Sala) {
		// TODO Auto-generated method stub
		return iSalaDAO.save(Sala);

	}

	@Override
	public Sala salaById(int id) {
		// TODO Auto-generated method stub
		return iSalaDAO.findById(id).get();

	}

	@Override
	public Sala actualizarSala(Sala Sala) {
		// TODO Auto-generated method stub
		return iSalaDAO.save(Sala);

	}

	@Override
	public void eliminarSala(int id) {
		// TODO Auto-generated method stub
		iSalaDAO.deleteById(id);

	} 

	
}
