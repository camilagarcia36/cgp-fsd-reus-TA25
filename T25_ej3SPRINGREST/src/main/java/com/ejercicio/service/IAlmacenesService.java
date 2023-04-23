package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Almacenes;

public interface IAlmacenesService {

	public List<Almacenes> listarAlmaceness();

	public Almacenes guardarAlmacenes(Almacenes Almacenes);

	public Almacenes AlmacenesXID(int id);

	public Almacenes actualizarAlmacenes(Almacenes Almacenes);

	public void eliminarAlmacenes(int id);
}