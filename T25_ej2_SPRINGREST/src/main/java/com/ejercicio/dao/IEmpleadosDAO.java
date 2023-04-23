 package com.ejercicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.dto.Empleados;

public interface IEmpleadosDAO extends JpaRepository<Empleados, Integer> {

}
