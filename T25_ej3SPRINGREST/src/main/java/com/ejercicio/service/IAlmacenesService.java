package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Almacenes;

public interface IAlmacenesService {

	// Metodos del CRUD
		public List<Almacenes> listarAlmacen(); // Listar All

		public Almacenes guardarAlmacen(Almacenes almacen); // Guarda un almacen CREATE

		public Almacenes almacenById(int codigo); // Leer datos de un almacen READ

		public Almacenes actualizarAlmacen(Almacenes almacen); // Actualiza datos del almacen UPDATE

		public void eliminarAlmacen(int codigo);// Elimina el almacen DELETE
}