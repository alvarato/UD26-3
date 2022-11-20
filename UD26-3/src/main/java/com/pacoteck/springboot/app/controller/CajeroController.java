package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Cajero;
import com.pacoteck.springboot.app.service.CajeroServiceImp;

@RestController
@RequestMapping("cajeros")
public class CajeroController {

	@Autowired
	CajeroServiceImp imp;

	
	@GetMapping("/findAll")
	public List<Cajero> findAll(){
		return imp.findAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Cajero entity) {
		imp.create(entity);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Cajero entity) {
		imp.update(entity);
	}
}
