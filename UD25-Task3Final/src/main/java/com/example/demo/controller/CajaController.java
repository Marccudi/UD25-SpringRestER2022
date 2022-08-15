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

import com.example.demo.dto.Caja;
import com.example.demo.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {
	@Autowired
	CajaServiceImpl emp;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return emp.listarCajas();
	}
	
	@GetMapping("/cajas/{id}")
	public Caja listarCajasXID(@PathVariable(name="id") String id){
		Caja artxid= new Caja();
		artxid=emp.cajaXID(id);
		return artxid;
	}

	@PostMapping("/cajas")
	public Caja salvarcaja(@RequestBody Caja caja) {
		
		return emp.guardarCaja(caja);
	}
	
	
	@PutMapping("/cajas/{id}")
	public Caja actualizarCaja(@PathVariable(name="id")String id,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= emp.cajaXID(id);
		
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setContenido(caja.getContenido());
//		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = emp.actualizarCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{dni}")
	public void eliminarCaja(@PathVariable(name="dni")String dni) {
		emp.eliminarCaja(dni);
	}
}
