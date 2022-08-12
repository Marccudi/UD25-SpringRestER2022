package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl {
	@Autowired
	static
	IEmpleadoDAO EmpleadoDAO;
	
	
	public static List<Empleado> listarEmpleados() {
		
		return EmpleadoDAO.findAll();
	}

	
	public static Empleado guardarEmpleado(Empleado empleado) {
		
		return EmpleadoDAO.save(empleado);
	}

	
	public static Empleado empleadoXID(String id) {
		return EmpleadoDAO.findById(id).get();
	}

	
	public static Empleado actualizarEmpleado(Empleado empleado) {
		
		return EmpleadoDAO.save(empleado);
	}

	
	public static void eliminarEmpleado(String id) {
		
		EmpleadoDAO.deleteById(id);
		
	}


public static Empleado articuloXID(String id) {
		
		return EmpleadoDAO.findById(id).get();
	}
}
