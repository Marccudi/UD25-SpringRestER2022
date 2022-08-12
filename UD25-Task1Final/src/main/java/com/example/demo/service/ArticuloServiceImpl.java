package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloServiceImpl{
	@Autowired
	
	IArticuloDAO ArticuloDAO;
	
	
	public List<Articulo> listarArticulos() {
		
		return ArticuloDAO.findAll();
	}

	
	public Articulo guardarArticulo(Articulo fabricante) {
		
		return ArticuloDAO.save(fabricante);
	}

	
	public Articulo fabricanteXID(int id) {
		
		return ArticuloDAO.findById(id).get();
	}

	
	public Articulo actualizarArticulo(Articulo fabricante) {
		
		return ArticuloDAO.save(fabricante);
	}

	
	public void eliminarArticulo(int id) {
		
		ArticuloDAO.deleteById(id);
		
	}


public  Articulo articuloXID(int id) {
		
		return ArticuloDAO.findById(id).get();
	}
}
