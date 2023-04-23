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
	CajasServiceIMPL cajasServiceImpl;

	@GetMapping("/Cajas")
	public List<Cajas> listarCajass() {
		return cajasServiceImpl.listarCajass();
	}



	@PostMapping("/Cajas")
	public Cajas salvarCajas(@RequestBody Cajas Cajas) {

		return cajasServiceImpl.guardarCajas(Cajas);
	}

	@GetMapping("/Cajas/{id}")
	public Cajas CajasXID(@PathVariable(name = "id") int id) {

		Cajas Cajas_xid = new Cajas();

		Cajas_xid = cajasServiceImpl.CajasXID(id);

		System.out.println("Cajas XID: " + Cajas_xid);

		return Cajas_xid;
	}

	@PutMapping("/Cajas/{id}")
	public Cajas actualizarCajas(@PathVariable(name = "id") int id, @RequestBody Cajas Cajas) {

		Cajas Cajas_seleccionado = new Cajas();
		Cajas Cajas_actualizado = new Cajas();

		Cajas_seleccionado = cajasServiceImpl.CajasXID(id);

		Cajas_seleccionado.setid(Cajas.getid());
		Cajas_seleccionado.setContenido(Cajas.getContenido());
		Cajas_seleccionado.setValor(Cajas.getValor());

		Cajas_actualizado = cajasServiceImpl.actualizarCajas(Cajas_seleccionado);

		System.out.println("El Cajas actualizado es: " + Cajas_actualizado);

		return Cajas_actualizado;
	}

	@DeleteMapping("/Cajas/{id}")
	public void eliminarCajas(@PathVariable(name = "id") int id) {
		cajasServiceImpl.eliminarCajas(id);
	}

}
