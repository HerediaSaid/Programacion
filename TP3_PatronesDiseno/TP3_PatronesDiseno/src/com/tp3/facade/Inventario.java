package com.tp3.facade;


public class Inventario {

    public boolean hayStock(String producto, int cantidad) {
        System.out.println("[Inventario] Verificando stock de \"" + producto + "\" (" + cantidad + " unidades)...");
        return true;
    }

    public void descontarStock(String producto, int cantidad) {
        System.out.println("[Inventario] Descontando " + cantidad + " unidades de \"" + producto + "\".");
    }
}
