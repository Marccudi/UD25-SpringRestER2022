package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServideImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServideImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculaServideImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaXID(@PathVariable(name="id") int id) {
		
		Pelicula pelicula_xid= new Pelicula();
		
		pelicula_xid=peliculaServideImpl.peliculaXID(id);
		
		
		return pelicula_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")int id,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculaServideImpl.peliculaXID(id);
		
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionedad(pelicula.getCalificacionedad());
		
		pelicula_actualizado = peliculaServideImpl.actualizarPelicula(pelicula_seleccionado);
		
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eleiminarPelicula(@PathVariable(name="codigo")int codigo) {
		peliculaServideImpl.eliminarPelicula(codigo);
	}
	
	
}