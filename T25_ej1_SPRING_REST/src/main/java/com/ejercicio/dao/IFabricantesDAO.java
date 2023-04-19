package com.ejercicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.dto.Fabricantes;



public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long>  {

}
