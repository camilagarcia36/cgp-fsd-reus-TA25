package com.ejercicio.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.ICajasDAO;
import com.ejercicio.dto.Almacenes;
import com.ejercicio.dto.Cajas;

@Service
public class CajasServiceIMPL implements ICajasService {
	@Autowired
	ICajasDAO iCajasDAO;

	@Override
	public List<Cajas> listarCajas() {
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCaja(Cajas caja) {
		return iCajasDAO.save(caja);
	}

	@Override
	public Cajas cajaById(String numreferencia) {
		return iCajasDAO.findById(numreferencia).get();
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		return iCajasDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numreferencia) {
		iCajasDAO.deleteById(numreferencia);

	}

}
