package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaServiceImpl {
	@Autowired
	ISalaDAO SalaDAO;
	
	
	public List<Sala> listarSalas() {
		
		return SalaDAO.findAll();
	}

	
	public Sala guardarSala(Sala sala) {
		
		return SalaDAO.save(sala);
	}

	
	public Sala salaXID(int id) {
		
		return SalaDAO.findById(id).get();
	}

	
	public Sala actualizarSala(Sala sala) {
		
		return SalaDAO.save(sala);
	}

	
	public void eliminarSala(int id) {
		
		SalaDAO.deleteById(id);
		
	}
}
