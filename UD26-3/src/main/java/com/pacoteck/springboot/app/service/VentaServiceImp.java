package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.IVentaDAO;
import com.pacoteck.springboot.app.dto.Venta;

@Service
public class VentaServiceImp implements IVentaService{

	@Autowired
	IVentaDAO dao;

	@Override
	public List<Venta> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(Venta entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(Venta entity) {
		List<Venta> aux = dao.findAll();
		for (Venta venta : aux) {
			if(entity.getCodigo() == venta.getCodigo()) {
				dao.save(entity);
				break;
			}
		}
		
	}
}
