package com.ejercicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IAlmacenesDAO;
import com.ejercicio.dto.Almacenes;

@Service
public class AlmacenesServiceIMPL implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	@Override
	public List<Almacenes> listarAlmaceness() {
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public Almacenes AlmacenesXID(int id) {
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public void eliminarAlmacenes(int id) {
		iAlmacenesDAO.deleteById(id);
	}

}
