package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Almacenes;
import com.ejercicio.dto.Cajas;

public interface ICajasService {

	public List<Cajas> listarCajass();

	public Cajas guardarCajas(Cajas cajas);

	public Cajas CajasXID(int id);



	public Cajas actualizarCajas(Cajas cajas);

	public void eliminarCajas(int id);
}
