package com.example.TrabajoPractico_1.Runner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.TrabajoPractico_1.Repository.ProductoRepository;
import com.example.TrabajoPractico_1.model.Producto;


@Component
public class ProductoRunner implements CommandLineRunner{

	@Autowired
	ProductoRepository productoRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Producto> lista = new ArrayList<>();
		
		
		
		Producto p1 = new Producto();
		p1.setMarca("Adidas");
		p1.setNombre("Zapatillas");
		p1.setCantidad(10);
		p1.setPrecio(BigDecimal.valueOf(54000.00));
		lista.add(p1);
		
		Producto p2 = new Producto();
		p2.setMarca("Adidas");
		p2.setNombre("Remera");
		p2.setCantidad(10);
		p2.setPrecio(BigDecimal.valueOf(25000.00));
		lista.add(p2);
		
		Producto p3 = new Producto();
		p3.setMarca("Adidas");
		p3.setNombre("Campera");
		p3.setCantidad(1);
		p3.setPrecio(BigDecimal.valueOf(94000.00));
		lista.add(p3);
		
		Producto p4 = new Producto();
		p4.setMarca("Nike");
		p4.setNombre("Zapatillas");
		p4.setCantidad(10);
		p4.setPrecio(BigDecimal.valueOf(64000.00));
		lista.add(p4);
		
		System.out.println("Productos Guardados");
		productoRepository.saveAll(lista);
		
		System.out.println("Lista de productos Adidas:");
		List<Producto> productosAdidas = productoRepository.findByMarca("Adidas");
		for (Producto prod  : productosAdidas) {
            System.out.println(prod); 
        }
		
		System.out.println("Lista de productos con poco stock:");
		List<Producto> productosPorAgotarse = productoRepository.findByCantidadLessThanEqual(2);
		for (Producto prod  : productosPorAgotarse) {
            System.out.println("Quedan "+prod.getCantidad()+"del producto "+prod.getMarca()+" "+prod.getNombre()); 
        }
		
		System.out.println("Lista de productos con precio entre $20.000 y $ 70.000:");
		List<Producto> precioProducto = productoRepository.findByPrecioBetween(
				BigDecimal.valueOf(20000.00), 
			    BigDecimal.valueOf(70000.00));
		for (Producto prod  : precioProducto) {
			 System.out.println(prod);
        }
		
		Producto productoAEditar = productoRepository.findById(1l).orElse(null);
		
		if (productoAEditar != null) {
			
			productoAEditar.setCantidad(20); 
			productoAEditar.setPrecio(BigDecimal.valueOf(60000.00));
			
			productoRepository.save(productoAEditar);
		}
		
		System.out.println("Lista final de productos con las modificaciones aplicadas:");
		List<Producto> listaFinal = productoRepository.findAll();
		for (Producto prod : listaFinal) {
		    System.out.println(prod);
		}
		
		System.out.println("Lista de todos los productos");
		List<Producto> listaCompleta = productoRepository.findAll();
		for (Producto prod : listaCompleta) {
		    System.out.println(prod);
		}
		
		System.out.println("Eliminar por id, eliminaremos el id 3");
		productoRepository.deleteById(3l);
		
		System.out.println("Lista de todos los productos");
		List<Producto> listaNueva = productoRepository.findAll();
		for (Producto prod : listaNueva) {
		    System.out.println(prod);
		}
		
	}
	
	
	
	

}
