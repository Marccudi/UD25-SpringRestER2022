package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServiceImpl {
	@Autowired
	IPeliculaDAO PeliculaDAO;
	
	
	public List<Pelicula> listarPeliculas() {
		
		return PeliculaDAO.findAll();
	}

	
	public Pelicula guardarPelicula(Pelicula pelicula) {
		
		return PeliculaDAO.save(pelicula);
	}

	
	public Pelicula peliculaXID(int id) {
		
		return PeliculaDAO.findById(id).get();
	}

	
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		
		return PeliculaDAO.save(pelicula);
	}

	
	public void eliminarPelicula(int id) {
		
		PeliculaDAO.deleteById(id);
		
	}
}
