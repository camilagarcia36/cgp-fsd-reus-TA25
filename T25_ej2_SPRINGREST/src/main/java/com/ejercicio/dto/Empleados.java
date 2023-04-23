package com.ejercicio.dto;

import javax.persistence.*;

@Entity
@Table(name = "Empleados") // Nombre de la tabla
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="dni")
	private  String dni;
	
	@Column(name="nombre")
	private String nombre; 
	
	@Column(name="apellidos")
	private String apellidos; 
	
	@ManyToOne
	@JoinColumn(name="departamento")  //aqui tiene que estar el nombre del sql del fk_1 depende como lo hayas llamado. 
	private Departamentos departamentos; 
	
	
	public Empleados() {

	}


	public Empleados(String dni, String nombre, String apellidos, Departamentos departamentos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamentos = departamentos;
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the departamentos
	 */
	public Departamentos getDepartamentos() {
		return departamentos;
	}


	/**
	 * @param departamentos the departamentos to set
	 */
	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", dni=\" + dni + \", nombre=" + nombre + ", apellidos=" + apellidos + ", departamentos="
				+ departamentos + "]";
	}
}
