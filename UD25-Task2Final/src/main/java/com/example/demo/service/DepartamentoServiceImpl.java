package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoServiceImpl {
	@Autowired
	IDepartamentoDAO DepartamentoDAO;
	
	
	public List<Departamento> listarDepartamentos() {
		
		return DepartamentoDAO.findAll();
	}

	
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return DepartamentoDAO.save(departamento);
	}

	
	public Departamento departamentoXID(int id) {
		
		return DepartamentoDAO.findById(id).get();
	}

	
	public Departamento actualizarDepartamento(Departamento departamento) {
		
		return DepartamentoDAO.save(departamento);
	}

	
	public void eliminarDepartamento(int id) {
		
		DepartamentoDAO.deleteById(id);
		
	}
}
