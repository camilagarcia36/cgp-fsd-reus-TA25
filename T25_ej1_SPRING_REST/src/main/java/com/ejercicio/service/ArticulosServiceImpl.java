package com.ejercicio.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IArticulosDAO;
import com.ejercicio.dto.Articulos;
import com.ejercicio.dto.Fabricantes;


/**
 * 
 * @author CAMILA
 *
 */
@Service
public class ArticulosServiceImpl implements IArticulosService {

	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos() 
	{
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulos) 
	{
		return iArticulosDAO.save(articulos);
	}

	@Override
	public Articulos articulosXID(Long id) 
	{
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante) 
	{
		return iArticulosDAO.findByFabricante(fabricante);
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulos) 
	{
		return iArticulosDAO.save(articulos);
	}

	@Override
	public void eliminarArticulos(Long id) 
	{
		iArticulosDAO.deleteById(id);
	}

}
