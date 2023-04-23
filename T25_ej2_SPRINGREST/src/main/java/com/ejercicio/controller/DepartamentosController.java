package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.dto.Departamentos;
import com.ejercicio.service.DepartamentosServiceImpl;



@RestController
@RequestMapping("/api")
public class DepartamentosController {

	@Autowired
	DepartamentosServiceImpl departamentosServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentosServiceImpl.listarDepartamentos();
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamentos departamentoXID(@PathVariable(name="id") int id) {
		Departamentos dep_xid = new Departamentos();
		
		dep_xid = departamentosServiceImpl.departamentoXID(id);
		
		System.out.println("Departamento: "+dep_xid);
		
		return dep_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id") int id,@RequestBody Departamentos departamentos) {
		Departamentos dep_sel = new Departamentos();
		Departamentos dep_act = new Departamentos();
		
		dep_sel = departamentosServiceImpl.departamentoXID(id);
		
		dep_sel.setNombre(departamentos.getNombre());
		dep_sel.setPresupuesto(departamentos.getPresupuesto());
		
		dep_act=departamentosServiceImpl.actualizarDepartamento(dep_sel);
		
		System.out.println("El cliente actualizado es: "+dep_act);
		
		return dep_act;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name="id")int id) {
		departamentosServiceImpl.eliminarDepartamento(id);
	}
	
}
