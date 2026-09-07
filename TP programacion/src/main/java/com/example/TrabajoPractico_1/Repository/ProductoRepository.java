package com.example.TrabajoPractico_1.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrabajoPractico_1.model.Producto;

import jakarta.transaction.Transactional;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

	
	List<Producto> findByMarca(String marca); /*Buscar productos por marca*/
	List<Producto> findByCantidadLessThanEqual(int cantidadMaxima);/*Buscar productos con stock por agotarse*/
	List<Producto> findByPrecioBetween(BigDecimal precioMinimo, BigDecimal precioMaximo); /*Buscar por rango de precio*/
	
	@Transactional
    void deleteById(Long id);
	
}
