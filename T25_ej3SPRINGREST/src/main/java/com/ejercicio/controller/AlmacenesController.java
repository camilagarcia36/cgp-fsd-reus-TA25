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

	@GetMapping("/Almacenes")
	public List<Almacenes> listarAlmacenes() {
		return almacenesServiceImpl.listarAlmaceness();
	}

	@PostMapping("/Almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes Almacenes) {
		return almacenesServiceImpl.guardarAlmacenes(Almacenes);
	}

	@GetMapping("/Almacenes/{id}")
	public Almacenes AlmacenesXID(@PathVariable(name = "id") int id) {

		Almacenes Almacenes_xid = new Almacenes();

		Almacenes_xid = almacenesServiceImpl.AlmacenesXID(id);

		System.out.println("Almacenes XID: " + Almacenes_xid);

		return Almacenes_xid;
	}

	@PutMapping("/Almacenes/{id}")
	public Almacenes actualizarAlmacenes(@PathVariable(name = "id") int id, @RequestBody Almacenes Almacenes) {

		Almacenes Almacenes_seleccionado = new Almacenes();
		Almacenes Almacenes_actualizado = new Almacenes();

		Almacenes_seleccionado = almacenesServiceImpl.AlmacenesXID(id);

		Almacenes_seleccionado.setid(Almacenes.getid());
		Almacenes_seleccionado.setNombre(Almacenes.getNombre());
		Almacenes_seleccionado.setCapacidad(Almacenes.getCapacidad());

		Almacenes_actualizado = almacenesServiceImpl.actualizarAlmacenes(Almacenes_seleccionado);

		System.out.println("El Almacenes actualizado es: " + Almacenes_actualizado);

		return Almacenes_actualizado;
	}

	@DeleteMapping("/Almacenes/{id}")
	public void eliminarAlmacenes(@PathVariable(name = "id") int id) {
		almacenesServiceImpl.eliminarAlmacenes(id);
	}
}
