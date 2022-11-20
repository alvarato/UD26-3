package com.pacoteck.springboot.app.service;

import java.util.List;
import com.pacoteck.springboot.app.dto.MaquinaRegistradora;

public interface IMRService {

	public List<MaquinaRegistradora> findAll();
	public void deleteById(int id);
	public void create(MaquinaRegistradora entity);
	public void update(MaquinaRegistradora entity);
}
