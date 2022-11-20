package com.pacoteck.springboot.app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private int precio;
	
	@OneToMany(mappedBy = "producto",cascade = CascadeType.ALL)
	private List<Venta> venta;
	
	public Producto() {}

	public Producto(int codigo, String nombre, int precio, List<Venta> ventas) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.venta = ventas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@JsonIgnore
	public List<Venta> getVentas() {
		return venta;
	}

	public void setVentas(List<Venta> ventas) {
		this.venta = ventas;
	}
	
	

}
