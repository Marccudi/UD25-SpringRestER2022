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

import com.example.demo.dto.Sala;
import com.example.demo.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	@Autowired
	SalaServiceImpl emp;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return emp.listarSalas();
	}
	
	@GetMapping("/salas/{id}")
	public Sala listarSalasXID(@PathVariable(name="id") int id){
		Sala artxid= new Sala();
		artxid=emp.salaXID(id);
		return artxid;
	}

	@PostMapping("/salas")
	public Sala salvarsala(@RequestBody Sala sala) {
		
		return emp.guardarSala(sala);
	}
	
	
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name="id")int id,@RequestBody Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= emp.salaXID(id);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
//		sala_seleccionado.setAlmacen(sala.getAlmacen());
		
		sala_actualizado = emp.actualizarSala(sala_seleccionado);
		
		System.out.println("El sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id")int id) {
		emp.eliminarSala(id);
	}
}
