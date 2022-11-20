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
@Table(name="Cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre_apellidos")
	private String nomApels;
	
	@OneToMany(mappedBy = "cajero",cascade = CascadeType.ALL)
	private List<Venta> venta;
	
	public Cajero() {}

	public Cajero(int codigo, String nomApels, List<Venta> ventas) {
		this.codigo = codigo;
		this.nomApels = nomApels;
		this.venta = ventas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	public List<Venta> getVentas() {
		return venta;
	}

	public void setVentas(List<Venta> ventas) {
		this.venta = ventas;
	}
	
	
}
