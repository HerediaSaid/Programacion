package com.example.TrabajoPractico_1.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "marca_producto",nullable = false, length = 100)
	private String marca;
	
	@Column(name = "nombre_producto",nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "cantidad_producto",nullable = false)
	private int cantidad;
	
	@Column(name = "precio_producto",nullable = false,precision = 10,scale = 2)
	private BigDecimal precio;
		
	/*Constructor vacio para hibernate*/
	public Producto(){
		
	}
	
	public Producto(Long id,String marca,String nombre,int cantidad,BigDecimal precio){
		
		this.id = id;
		this.marca = marca;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", marca=" + marca + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
	
	 
	
	
}
