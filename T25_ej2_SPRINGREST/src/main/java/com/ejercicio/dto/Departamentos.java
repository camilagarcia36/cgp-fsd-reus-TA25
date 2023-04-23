package com.ejercicio.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore; 


@Entity
@Table(name = "Departamentos")
public class Departamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "presupuesto")
	private int presupuesto;

	@OneToMany   //un departamento muchos empleados. 
	@JoinColumn(name = "id")
	private List<Empleados> empleado;

	// Constructores
	/**
	 * @param id
	 * @param nombre
	 * @param presupuesto
	 */
	public Departamentos() {

	}

	public Departamentos(String nombre, int presupuesto) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	
	}
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleados> getEmpleado() {
		return empleado;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	 * @return the presupuesto
	 */
	public int getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}


	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(List<Empleados> empleado) {
		this.empleado = empleado;
	}
	
	
	
	
}
