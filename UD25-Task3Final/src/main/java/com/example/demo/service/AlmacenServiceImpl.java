package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl {
	@Autowired
	IAlmacenDAO AlmacenDAO;
	
	
	public List<Almacen> listarAlmacens() {
		
		return AlmacenDAO.findAll();
	}

	
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return AlmacenDAO.save(almacen);
	}

	
	public Almacen almacenXID(int id) {
		
		return AlmacenDAO.findById(id).get();
	}

	
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return AlmacenDAO.save(almacen);
	}

	
	public void eliminarAlmacen(int id) {
		
		AlmacenDAO.deleteById(id);
		
	}
}
