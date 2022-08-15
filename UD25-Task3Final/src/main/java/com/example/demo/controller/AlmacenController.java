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

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

		@Autowired
		AlmacenServiceImpl almacenServideImpl;
		
		@GetMapping("/almacenes")
		public List<Almacen> listarAlmacens(){
			return almacenServideImpl.listarAlmacens();
		}
		
		@PostMapping("/almacenes")
		public Almacen salvarAlmacen(@RequestBody Almacen almacen) {
			
			return almacenServideImpl.guardarAlmacen(almacen);
		}
		
		@GetMapping("/almacenes/{id}")
		public Almacen almacenXID(@PathVariable(name="id") int id) {
			
			Almacen almacen_xid= new Almacen();
			
			almacen_xid=almacenServideImpl.almacenXID(id);
			
			
			return almacen_xid;
		}
		
		@PutMapping("/almacenes/{id}")
		public Almacen actualizarAlmacen(@PathVariable(name="id")int id,@RequestBody Almacen almacen) {
			
			Almacen almacen_seleccionado= new Almacen();
			Almacen almacen_actualizado= new Almacen();
			
			almacen_seleccionado= almacenServideImpl.almacenXID(id);
			
			almacen_seleccionado.setCapacidad(almacen.getCapacidad());
			almacen_seleccionado.setLugar(almacen.getLugar());
			
			almacen_actualizado = almacenServideImpl.actualizarAlmacen(almacen_seleccionado);
			
			
			return almacen_actualizado;
		}
		
		@DeleteMapping("/almacenes/{codigo}")
		public void eleiminarAlmacen(@PathVariable(name="codigo")int codigo) {
			almacenServideImpl.eliminarAlmacen(codigo);
		}
		
		
	}