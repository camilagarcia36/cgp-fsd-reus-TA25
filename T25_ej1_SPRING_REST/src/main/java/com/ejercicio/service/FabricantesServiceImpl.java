package com.ejercicio.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IFabricantesDAO;
import com.ejercicio.dto.Fabricantes;


/**
 * 
 * @author CAMILA
 *
 */
@Service
public class FabricantesServiceImpl implements IFabricantesService {

	@Autowired
	IFabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() 
	{
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricantes) 
	{
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public Fabricantes fabricantesXID(Long id) 
	{
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes) 
	{
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public void eliminarFabricantes(Long id) 
	{
		iFabricantesDAO.deleteById(id);
	}

}
