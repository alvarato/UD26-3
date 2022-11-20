package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.IProductoDAO;
import com.pacoteck.springboot.app.dto.Producto;

@Service
public class ProductoServiceImp implements IProductoService{

	@Autowired
	IProductoDAO dao;

	@Override
	public List<Producto> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void create(Producto entity) {
		dao.save(entity);
	}

	@Override
	public void update(Producto entity) {
		List<Producto> aux = dao.findAll();
		for (Producto producto : aux) {
			if(entity.getCodigo() == producto.getCodigo()) {
				dao.save(entity);
			}
		}
	}
}
