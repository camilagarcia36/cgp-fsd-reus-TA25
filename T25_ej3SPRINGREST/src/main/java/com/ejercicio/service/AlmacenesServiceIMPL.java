package com.ejercicio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IAlmacenesDAO;
import com.ejercicio.dto.Almacenes;

@Service
public class AlmacenesServiceIMPL implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO iAlmacenDAO;

	@Override
	public List<Almacenes> listarAlmacen() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacenes almacenById(int codigo) {
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		iAlmacenDAO.deleteById(codigo);

	}
}
