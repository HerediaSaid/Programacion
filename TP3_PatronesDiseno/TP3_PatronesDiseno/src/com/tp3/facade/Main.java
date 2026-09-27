package com.tp3.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Patron Facade: Proceso de compra de una tienda online ===");

        TiendaFacade tienda = new TiendaFacade();

        tienda.comprarProducto(
                "Teclado mecanico",
                1,
                45990.0,
                "tarjeta de credito",
                "Av. Siempreviva 742, San Miguel de Tucuman"
        );
    }
}
