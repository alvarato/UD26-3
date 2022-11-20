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
@Table(name="Maquinas_registradoras")
public class MaquinaRegistradora {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "piso")
	private int piso;
	
	@OneToMany(mappedBy = "maquinaRegistradora",cascade = CascadeType.ALL)
	private List<Venta> venta;
	
	public MaquinaRegistradora() {}

	public MaquinaRegistradora(int codigo, int piso, List<Venta> venta) {
		this.codigo = codigo;
		this.piso = piso;
		this.venta = venta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@JsonIgnore
	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	
}
