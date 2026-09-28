package com.tp3.abstractfactory;

public class Main {

    private static void formarFlota(FabricaVehiculos fabrica, String marca) {
        System.out.println("--- Formando flota: " + marca + " ---");
        Sedan sedan = fabrica.crearSedan();
        Pickup pickup = fabrica.crearPickup();
        sedan.conducir();
        pickup.cargar();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Patron Abstract Factory: Concesionaria multimarca ===\n");

        FabricaVehiculos fabricaChevrolet = new FabricaChevrolet();
        formarFlota(fabricaChevrolet, "Chevrolet");

        FabricaVehiculos fabricaToyota = new FabricaToyota();
        formarFlota(fabricaToyota, "Toyota");
    }
}
