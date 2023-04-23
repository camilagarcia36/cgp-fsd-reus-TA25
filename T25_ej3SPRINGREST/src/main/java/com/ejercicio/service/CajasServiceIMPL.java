package com.ejercicio.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.ICajasDAO;
import com.ejercicio.dto.Almacenes;
import com.ejercicio.dto.Cajas;

@Service
public class CajasServiceIMPL implements ICajasService{

	@Autowired
	ICajasDAO iCajasDAO;
	@Override
	public List<Cajas> listarCajass() {
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public Cajas CajasXID(int id) {
		return iCajasDAO.findById(id).get();
	}


	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(int id) {
		iCajasDAO.deleteById(id);
		
	}


}
