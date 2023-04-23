package com.ejercicio.dto;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes")
public class Almacenes  {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "numreferencia")
	private List<Cajas> caja;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Cajas> getCaja() {
		return caja;
	}

	// CONSTRUCTORES
	public Almacenes() {

	}

	public Almacenes(String lugar, int capacidad) {
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	// GETTERS Y SETTERS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", caja=" + caja + "]";
	}
}
