package com.pacoteck.springboot.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@ManyToOne()
	@JoinColumn(name="producto")
	private Producto producto;
	
	@ManyToOne()
	@JoinColumn(name="cajero")
	private Cajero cajero;
	
	@ManyToOne()
	@JoinColumn(name="maquina")
	private MaquinaRegistradora maquinaRegistradora;
	
	public Venta() {}

	public Venta(int codigo, Producto producto, Cajero cajero, MaquinaRegistradora maquinaRegistradora) {
		this.codigo = codigo;
		this.producto = producto;
		this.cajero = cajero;
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}
	
	
}
