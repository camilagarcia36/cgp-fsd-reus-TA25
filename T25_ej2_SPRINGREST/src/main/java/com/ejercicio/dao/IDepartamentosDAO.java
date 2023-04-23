package com.ejercicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.dto.Departamentos;

public interface IDepartamentosDAO extends JpaRepository <Departamentos, Integer> {

}
