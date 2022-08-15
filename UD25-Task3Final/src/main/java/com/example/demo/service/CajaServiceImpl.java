package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServiceImpl {
	@Autowired
	ICajaDAO CajaDAO;
	
	
	public List<Caja> listarCajas() {
		
		return CajaDAO.findAll();
	}

	
	public Caja guardarCaja(Caja caja) {
		
		return CajaDAO.save(caja);
	}

	
	public Caja cajaXID(String id) {
		return CajaDAO.findById(id).get();
	}

	
	public Caja actualizarCaja(Caja caja) {
		
		return CajaDAO.save(caja);
	}

	
	public void eliminarCaja(String id) {
		
		CajaDAO.deleteById(id);
		
	}


public Caja articuloXID(String id) {
		
		return CajaDAO.findById(id).get();
	}
}
