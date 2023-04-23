package com.ejercicio.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.dto.Articulos;
import com.ejercicio.dto.Fabricantes;


public interface IArticulosDAO extends JpaRepository<Articulos, Long> {

	public List<Articulos> findByFabricante(Fabricantes fabricante);
}
