package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IDepartamentosDAO;
import com.ejercicio.dto.Departamentos;

@Service
	public class DepartamentosServiceImpl implements IDepartamentosService {
	
	@Autowired
	IDepartamentosDAO iDepartamentosDAO;

	@Override
	public List<Departamentos> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findAll(); 	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamentos);

	}


	@Override
	public Departamentos actualizarDepartamento(Departamentos departamentos) {
		return iDepartamentosDAO.save(departamentos);

	}

	@Override
	public Departamentos departamentoXID(int id) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public void eliminarDepartamento(int id) {
		iDepartamentosDAO.deleteById(id);
		
	}



}
