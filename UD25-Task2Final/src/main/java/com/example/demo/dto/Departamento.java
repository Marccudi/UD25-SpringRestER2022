package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento {

	@Id
	public int codigo;
	@Column
	public String nombre;
	@Column
	public int presupuesto;
	
	 	@OneToMany
	    @JoinColumn(name="id")
	    private List<Empleado> empleado;

	 public Departamento() {

	}
	 public Departamento(int codigo, String nombre, int presupuesto, List<Empleado> empleado) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.presupuesto = presupuesto;
			this.empleado = empleado;
	}
	 
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public List<Empleado> getEmpleado() {
		return empleado;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleado="
				+ empleado + "]";
	}
	 
	 

	 
	 
}
