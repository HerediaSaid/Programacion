package com.tp3.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Patron Factory Method: Concesionaria Toyota ===\n");

        FabricaVehiculo fabricaHilux = new FabricaHilux();
        fabricaHilux.venderVehiculo();

        FabricaVehiculo fabricaCorolla = new FabricaCorolla();
        fabricaCorolla.venderVehiculo();
    }
}
