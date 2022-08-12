package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteServiceImpl {
	@Autowired
	IFabricanteDAO FabricanteDAO;
	
	
	public List<Fabricante> listarFabricantes() {
		
		return FabricanteDAO.findAll();
	}

	
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return FabricanteDAO.save(fabricante);
	}

	
	public Fabricante fabricanteXID(int id) {
		
		return FabricanteDAO.findById(id).get();
	}

	
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return FabricanteDAO.save(fabricante);
	}

	
	public void eliminarFabricante(int id) {
		
		FabricanteDAO.deleteById(id);
		
	}
}
