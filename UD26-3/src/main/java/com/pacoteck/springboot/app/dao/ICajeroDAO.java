package com.pacoteck.springboot.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Integer>{

	List<Cajero> findAll();

}
