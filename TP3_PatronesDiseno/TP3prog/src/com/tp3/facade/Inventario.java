package com.tp3.facade;

/** Subsistema 1: maneja el stock de productos. */
public class Inventario {

    public boolean hayStock(String producto, int cantidad) {
        System.out.println("[Inventario] Verificando stock de \"" + producto + "\" (" + cantidad + " unidades)...");
        return true;
    }

    public void descontarStock(String producto, int cantidad) {
        System.out.println("[Inventario] Descontando " + cantidad + " unidades de \"" + producto + "\".");
    }
}
