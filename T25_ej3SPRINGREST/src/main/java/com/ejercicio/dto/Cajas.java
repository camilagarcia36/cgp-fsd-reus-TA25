package com.ejercicio.dto;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cajas")
public class Cajas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "contenido") // no hace falta si se llama igual
	private String contenido;
	@Column(name = "valor") // no hace falta si se llama igual
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen") // no hace falta si se llama igual
	private Almacenes almacen;

	public Cajas() {

	}

	public Cajas(String contenido, int valor, Almacenes almacen) {
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [id=" + id + ", contenido=" + contenido + ", valor=" + valor + "]";
	}

}