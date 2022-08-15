package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int codigo;
	@Column
	public String nombre;
	@Column
	public int calificacionedad;
	
 	@OneToMany
    @JoinColumn(name="sala")
 	private List<Sala> sala;

	public Pelicula() {

	}

	public Pelicula(int codigo, String nombre, int calificacionedad, List<Sala> sala) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;
		this.sala = sala;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCalificacionedad() {
		return calificacionedad;
	}

	public List<Sala> getSala() {
		return sala;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCalificacionedad(int calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacionedad=" + calificacionedad
				+ ", sala=" + sala + "]";
	}
	
	
}