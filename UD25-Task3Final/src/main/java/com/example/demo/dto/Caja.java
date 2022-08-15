package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cajas")
public class Caja {

	@Id
	public String numreferencia;
	@Column
	public String contenido;
	@Column
	public int valor;
	
	@ManyToOne
    @JoinColumn(name="codigo")
	public Almacen almacen;

	public Caja() {
	}
	public Caja(String numreferencia, String contenido, int valor, Almacen almacen) {
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}
	public String getNumreferencia() {
		return numreferencia;
	}
	public String getContenido() {
		return contenido;
	}
	public int getValor() {
		return valor;
	}
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setNumreferencia(String numreferencia) {
		this.numreferencia = numreferencia;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	@Override
	public String toString() {
		return "Caja [numreferencia=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

	
}
