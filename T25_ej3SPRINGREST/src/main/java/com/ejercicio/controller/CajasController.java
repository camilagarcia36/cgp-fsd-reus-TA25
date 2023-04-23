package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio.dto.Almacenes;
import com.ejercicio.dto.Cajas;
import com.ejercicio.service.CajasServiceIMPL;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceIMPL cajasServiceImpl;;

	@GetMapping("/cajas")
	public List<Cajas> listarCajas() {
		return cajasServiceImpl.listarCajas();
	}

	@PostMapping("/cajas")
	public Cajas guardarCaja(@RequestBody Cajas caja) {
		return cajasServiceImpl.guardarCaja(caja);
	}

	@GetMapping("/cajas/{numreferencia}")
	public Cajas cajaById(@PathVariable(name = "numreferencia") String numreferencia) {
		Cajas caja = new Cajas();
		caja = cajasServiceImpl.cajaById(numreferencia);
		System.out.println("Fabricante By ID: " + caja);
		return caja;
	}

	@PutMapping("/cajas/{numreferencia}")
	public Cajas actualizarCaja(@PathVariable(name = "numreferencia") String numreferencia, @RequestBody Cajas caja) {

		Cajas caja_seleccionado = new Cajas();
		Cajas caja_actualizado = new Cajas();
		caja_seleccionado = cajasServiceImpl.cajaById(numreferencia);
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());

		caja_actualizado = cajasServiceImpl.actualizarCaja(caja_seleccionado);
		return caja_actualizado;
	}

	@DeleteMapping("/cajas/{numreferencia}")
	public void eliminarCaja(@PathVariable(name = "numreferencia") String numreferencia) {
		cajasServiceImpl.eliminarCaja(numreferencia);
	}

}
