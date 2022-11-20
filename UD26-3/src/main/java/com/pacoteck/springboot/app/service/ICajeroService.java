package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Cajero;

public interface ICajeroService {

	public List<Cajero> findAll();
	public void deleteById(int id);
	public void create(Cajero entity);
	public void update(Cajero entity);
}
