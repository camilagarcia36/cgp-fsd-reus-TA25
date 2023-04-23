package com.ejercicio.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio.dto.Almacenes;
import com.ejercicio.service.AlmacenesServiceIMPL;

@RestController
@RequestMapping("/api")
public class AlmacenesController {


	@Autowired
	AlmacenesServiceIMPL almacenesServiceImpl;

	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacen() {
		return almacenesServiceImpl.listarAlmacen();
	}

	@PostMapping("/almacenes")
	public Almacenes salvarAlmacen(@RequestBody Almacenes almacen) {
		return almacenesServiceImpl.guardarAlmacen(almacen);
	}

	@GetMapping("/almacenes/{codigo}")
	public Almacenes almacenById(@PathVariable(name = "codigo") int codigo) {
		Almacenes almacen = new Almacenes();
		almacen = almacenesServiceImpl.almacenById(codigo);
		System.out.println("Fabricante By ID: " + almacen);
		return almacen;
	}

	@PutMapping("/almacenes/{codigo}")
	public Almacenes actualizarAlmacen(@PathVariable(name = "codigo") int codigo, @RequestBody Almacenes almacen) {

		Almacenes almacen_seleccionado = new Almacenes();
		Almacenes almacen_actualizado = new Almacenes();
		almacen_seleccionado = almacenesServiceImpl.almacenById(codigo);
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());

		almacen_actualizado = almacenesServiceImpl.actualizarAlmacen(almacen_seleccionado);
		System.out.println("El cliente actualizado es: " + almacen_actualizado);
		return almacen_actualizado;
	}

	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name = "codigo") int codigo) {
		almacenesServiceImpl.eliminarAlmacen(codigo);
	}
}
