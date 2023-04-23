package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Articulos;
import com.ejercicio.dto.Fabricantes;



/**
 * 
 * @author CAMILA
 *
 */
public interface IArticulosService {
	
	public List<Articulos> listarArticulos();

	public Articulos guardarArticulos(Articulos articulos);
	
	public Articulos articulosXID(Long id);
	
	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante);
	
	public Articulos actualizarArticulos(Articulos articulos);
	
	public void eliminarArticulos(Long id);
}
