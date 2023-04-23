package com.ejercicio.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "nombre")
	private String nombre; 
	
	@Column(name="calificacion")
	private int calificacion; 
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Sala> sala;
	
	
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}


	public Pelicula(int id, String nombre, int calificacion, List<Sala> sala) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.sala = sala;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the calificacion
	 */
	public int getCalificacion() {
		return calificacion;
	}


	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	
}
