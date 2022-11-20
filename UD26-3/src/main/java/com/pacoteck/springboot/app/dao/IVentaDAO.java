package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pacoteck.springboot.app.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
