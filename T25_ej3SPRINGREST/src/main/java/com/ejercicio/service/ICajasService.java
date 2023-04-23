package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Almacenes;
import com.ejercicio.dto.Cajas;

public interface ICajasService {

	public List<Cajas> listarCajas(); 

	public Cajas guardarCaja(Cajas caja);

	public Cajas cajaById(String numreferencia);

	public Cajas actualizarCaja(Cajas caja); 

	public void eliminarCaja(String numreferencia);
}
