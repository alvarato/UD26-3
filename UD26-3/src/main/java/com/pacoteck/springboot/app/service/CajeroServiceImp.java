package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.ICajeroDAO;
import com.pacoteck.springboot.app.dto.Cajero;

@Service
public class CajeroServiceImp implements ICajeroService{

	@Autowired
	ICajeroDAO dao;

	@Override
	public List<Cajero> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void create(Cajero entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(Cajero entity) {
		List<Cajero> aux = dao.findAll();
 		for (Cajero cajero : aux) {
			if(entity.getCodigo() == cajero.getCodigo()) {
				dao.save(entity);
				break;
			}
		}
	}
}
