package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Fabricantes;

/**
 * 
 * @author CAMILA
 *
 */
public interface IFabricantesService {
	
	public List<Fabricantes> listarFabricantes();

	public Fabricantes guardarFabricantes(Fabricantes fabricantes);
	
	public Fabricantes fabricantesXID(Long id);
	
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes);
	
	public void eliminarFabricantes(Long id);
}
