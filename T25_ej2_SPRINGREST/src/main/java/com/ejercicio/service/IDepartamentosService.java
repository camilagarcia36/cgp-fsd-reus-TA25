package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Departamentos;


public interface IDepartamentosService {
public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamentos(Departamentos departamentos);
	
	public Departamentos departamentoXID(int id);
	
	public Departamentos actualizarDepartamento(Departamentos departamentos);
	
	public void eliminarDepartamento(int id);
	
}
