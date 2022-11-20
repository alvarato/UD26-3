package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pacoteck.springboot.app.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
