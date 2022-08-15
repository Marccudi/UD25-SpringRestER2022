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
@Table(name="almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int codigo;
	@Column
	public String lugar;
	@Column
	public int capacidad;
	
 	@OneToMany
    @JoinColumn(name="almacen")
    private List<Caja> caja;

	public Almacen() {
		
	}
	public Almacen(int codigo, String lugar, int capacidad, List<Caja> caja) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getLugar() {
		return lugar;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public List<Caja> getCaja() {
		return caja;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}
	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", caja=" + caja + "]";
	}


 	
}
