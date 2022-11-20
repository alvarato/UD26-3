package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Venta;

public interface IVentaService {

	
	public List<Venta> findAll();
	public void deleteById(int id);
	public void create(Venta entity);
	public void update(Venta entity);
}
