package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public void deleteById(int id);
	public void create(Producto entity);
	public void update(Producto entity);

}
