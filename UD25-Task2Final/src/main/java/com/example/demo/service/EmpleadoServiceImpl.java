package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl {
	@Autowired
	IEmpleadoDAO EmpleadoDAO;
	
	
	public List<Empleado> listarEmpleados() {
		
		return EmpleadoDAO.findAll();
	}

	
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return EmpleadoDAO.save(empleado);
	}

	
	public Empleado empleadoXID(String id) {
		return EmpleadoDAO.findById(id).get();
	}

	
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return EmpleadoDAO.save(empleado);
	}

	
	public void eliminarEmpleado(String id) {
		
		EmpleadoDAO.deleteById(id);
		
	}


public Empleado articuloXID(String id) {
		
		return EmpleadoDAO.findById(id).get();
	}
}
