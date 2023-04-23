package com.ejercicio.dto;

import javax.persistence.*;



@Entity
@Table(name = "cajas")
public class Cajas {
	@Id
	@Column(name = "numreferencia")
	private String numreferencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacenes almacen;

	// CONTRUCTORES
	public Cajas() {

	}

	public Cajas(String numreferencia, String contenido, int valor, Almacenes almacen) {
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// GETTERS Y SETTERS
	public String getNumreferencia() {
		return numreferencia;
	}

	public void setNumreferencia(String numreferencia) {
		this.numreferencia = numreferencia;
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

	public Almacenes getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Caja [numreferencia=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
}