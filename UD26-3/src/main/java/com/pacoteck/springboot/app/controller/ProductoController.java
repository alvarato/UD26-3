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

import com.pacoteck.springboot.app.dto.Producto;
import com.pacoteck.springboot.app.service.ProductoServiceImp;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	ProductoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Producto> findAll(){
		return imp.findAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Producto entity) {
		imp.create(entity);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Producto entity) {
		imp.update(entity);
	}
	
	}
