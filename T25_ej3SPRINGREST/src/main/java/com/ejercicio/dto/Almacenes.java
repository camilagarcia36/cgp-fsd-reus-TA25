package com.ejercicio.dto;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes")
public class Almacenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "capacidad") // no hace falta si se llama igual
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Cajas> cajas;

	public Almacenes() {

	}

	public Almacenes(String nombre, int capacidad) {

		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @return the cajas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajas")
	public List<Cajas> getCajas() {
		return cajas;
	}

	/**
	 * @param cajas the cajas to set
	 */
	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

}
