package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.IMRDAO;
import com.pacoteck.springboot.app.dto.MaquinaRegistradora;

@Service
public class MRServiceImp implements IMRService{

	@Autowired
	IMRDAO dao;

	@Override
	public List<MaquinaRegistradora> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void create(MaquinaRegistradora entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(MaquinaRegistradora entity) {
		List<MaquinaRegistradora> aux = dao.findAll();
		for (MaquinaRegistradora mr : aux) {
			if(entity.getCodigo() == mr.getCodigo()) {
				dao.save(entity);
				break;
			}
		}
	}
	
}
