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

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;



@RestController
@RequestMapping("/api")
public class EmpleadoController {
	@Autowired
	EmpleadoServiceImpl emp;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return emp.listarEmpleados();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado listarEmpleadosXID(@PathVariable(name="id") String id){
		Empleado artxid= new Empleado();
		artxid=emp.empleadoXID(id);
		return artxid;
	}

	@PostMapping("/empleados")
	public Empleado salvarempleado(@RequestBody Empleado empleado) {
		
		return emp.guardarEmpleado(empleado);
	}
	
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")String id,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= emp.empleadoXID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = emp.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni")String dni) {
		emp.eliminarEmpleado(dni);
	}
}
